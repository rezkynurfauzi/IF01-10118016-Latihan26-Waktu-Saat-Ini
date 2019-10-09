/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118016.latihan26.waktu.saat.ini;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Rezky
 * NAMA      : Rezky Nur Fauzi
 * KELAS     : IF-1
 * NIM       : 10118016
 * Deskripsi Program   : Program ini berisi program Waktu Saat ini
 */

public class IF0110118016Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String hari;
        
        Date dKini = new Date( );
        SimpleDateFormat day = new SimpleDateFormat ("EEEE");
        if(day.equals("Sunday")){
            hari = "Minggu";
        }
        else if(day.equals("Monday")){
            hari = "Senin";
        }
        else if(day.equals("Tuesday")){
            hari = "Selasa";
        }
        else if(day.equals("Wednesday")){
            hari = "Rabu";
        }
        else if (day.equals("Thursday")){
            hari = "Kamis";
        }
        else if (day.equals("Friday")){
            hari = "Jumat";
        }
        else {
            hari = "Sabtu";
        }
        
        SimpleDateFormat today = new SimpleDateFormat (", dd MMM yyyy h:mm:ss");
        System.out.println("Hari ini adalah hari : "+ hari  + today.format(dKini));
    }
    
}
