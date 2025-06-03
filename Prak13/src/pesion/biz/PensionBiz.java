/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pesion.biz;
/**
 *
 * @author ASUS
 */





import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Import class-class dari package pension
import pension.Customer;
import pension.RoomType;
import pension.Standard;
import pension.Suite;
import pension.AlreadyCheckoutException;
import pension.AlreadyReservedException;

public class PensionBiz implements PensionBiz { // Pastikan TIDAK ADA 'abstract' di sini
    private List<Map<String, Object>> rooms;

    public PensionBiz() {
        this.rooms = new ArrayList<>();
        initializeRoomData(); // Langsung inisialisasi saat objek dibuat
    }

    @Override
    public void initializeRoomData() {
        rooms.clear();

        Map<String, Object> room101 = new HashMap<>();
        room101.put("id", "101");
        room101.put("room", new Standard());
        rooms.add(room101);

        Map<String, Object> room102 = new HashMap<>();
        room102.put("id", "102");
        room102.put("room", new Standard());
        rooms.add(room102);

        Map<String, Object> room103 = new HashMap<>();
        room103.put("id", "103");
        room103.put("room", new Standard());
        rooms.add(room103);

        Map<String, Object> room104 = new HashMap<>();
        room104.put("id", "104");
        room104.put("room", new Suite());
        rooms.add(room104);

        Map<String, Object> room105 = new HashMap<>();
        room105.put("id", "105");
        room105.put("room", new Suite());
        rooms.add(room105);
    }

    private Map<String, Object> findRoomById(String roomId) {
        for (Map<String, Object> roomData : rooms) {
            if (roomData.get("id").equals(roomId)) {
                return roomData;
            }
        }
        return null;
    }

    @Override
    public String checkIn(String roomId, String custName, String custPhone) throws AlreadyReservedException {
        Map<String, Object> roomData = findRoomById(roomId);
        if (roomData == null) {
            return "[Error] Silahkan masukkan nomor kamar yang benar.";
        }

        if (roomData.containsKey("Guest")) {
            throw new AlreadyReservedException("Kamar " + roomId + " sudah dipesan.");
        }

        Customer customer = new Customer(custName, custPhone);
        roomData.put("Guest", customer);
        return String.format("[Nama] %s [No.tlp] %s check in ke kamar %s", custName, custPhone, roomId);
    }

    @Override
    public String checkOut(String roomId) throws AlreadyCheckoutException {
        Map<String, Object> roomData = findRoomById(roomId);
        if (roomData == null) {
            return "[Error] Silahkan masukkan nomor kamar yang benar.";
        }

        if (!roomData.containsKey("Guest")) {
            throw new AlreadyCheckoutException("Check out sudah dilakukan untuk kamar " + roomId + ".");
        }

        roomData.remove("Guest");
        return "Kamar " + roomId + " check out berhasil.";
    }

    @Override
    public void roomList() {
        System.out.println("======== Informasi Ruangan ========");
        if (rooms.isEmpty()) {
            System.out.println("Belum ada data kamar.");
            return;
        }
        for (Map<String, Object> roomData : rooms) {
            String id = (String) roomData.get("id");
            RoomType room = (RoomType) roomData.get("room");
            System.out.print("Kamar " + id + ": " + room.toString());

            if (roomData.containsKey("Guest")) {
                Customer customer = (Customer) roomData.get("Guest");
                System.out.println(" " + customer.toString());
            } else {
                System.out.println();
            }
        }
        System.out.println("=================================");
    }
}