/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pesion.biz;

/**
 *
 * @author ASUS
 */



// ... import lainnya ...
import pension.AlreadyCheckoutException; // Pastikan import ini ada
import pension.AlreadyReservedException; // Pastikan import ini ada
// ... import lainnya ...

public class PensionBiz implements pensionBiz { // PASTIKAN ADA 'implements IPensionBiz'

    // ... (constructor dan fields) ...

    @Override // Jika ini merah
    public void initializeRoomData() { // HARUS public, void, tanpa parameter
        // ... implementasi ...
    }

    @Override // Jika ini merah
    public String checkIn(String roomId, String custName, String custPhone) throws AlreadyReservedException {
        // HARUS public, return String, parameter (String, String, String), throws AlreadyReservedException
        // ... implementasi ...
    }

    @Override // Jika ini merah
    public String checkOut(String roomId) throws AlreadyCheckoutException {
        // HARUS public, return String, parameter (String), throws AlreadyCheckoutException
        // ... implementasi ...
    }

    @Override // Jika ini merah
    public void roomList() { // HARUS public, void, tanpa parameter
        // ... implementasi ...
    }
}