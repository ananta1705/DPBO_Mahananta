package dpbo.travel.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissionUtil {
	/**
     * Method yang menerima input bilangan bulat dari pengguna
     * 
     * @return Angka yang diinput pengguna(bilangan bulat)
     */
    public static int getIntegerInput() {
        
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String inputString = null;
        
        try {
            inputString = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return Integer.parseInt( inputString );
    }
    
    /**
     * Method yang menerima input string dari pengguna
     * 
     * @return String yang diinput pengguna
     */
    public static String getStringInput() {
        
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String inputString = null;
        
        try {
            inputString = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return inputString;
    }
}
