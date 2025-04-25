package dpbo.travel;

import dpbo.travel.travel.IndividualTravel;
import dpbo.travel.travel.PackageTravel;
import dpbo.travel.travel.Travel;
import dpbo.travel.util.MissionUtil;

/**
 * Hello world!
 */
public class App {
	public static void main( String[] args ) {
        
		// Lihat soal Jurnal
		
    }
    
    public static void printMenu() {
        System.out.println( "========== < Menu > ==========" );
        System.out.println( " 1. Periksa semua produk travel" );
        System.out.println( " 2. Periksa produk individual" );
        System.out.println( " 3. Permintaan produk paket travel" );
        System.out.println( " 4. Reservasi produk travel" );
        System.out.println( " 9. End" );
        System.out.println( "==============================" );
        System.out.print( "## Menu : " );
    }
    
    public static void printHeader() {
        printSeperator();
        System.out.println( "Kode Travel\tNama Kota\tPenerbangan\tJenis Travel\t\tJumlah minimum orang yang boleh berangkat\tMaksimal orang yang bisa reservasi\tJumlah reservasi orang" );
        printSeperator();
    }
    
    public static void printSeperator() {
        System.out.println( "------------------------------------------------------------------------------------------------" );
    }
}
