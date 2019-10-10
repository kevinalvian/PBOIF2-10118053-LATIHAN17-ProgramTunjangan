/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118053.latihan17.programtunjangan;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class PBOIF210118053LATIHAN17ProgramTunjangan {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("============== Program Tunjangan =============");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp.");
        
        Scanner scanner = new Scanner(System.in);
        
        int gaji= scanner.nextInt();
        System.out.print("Status anda? (Menikah/Belum     : ");
        String status = scanner.next();
        
        double tunjangan = 0;
        
        if(status.equalsIgnoreCase("Menikah")){
             tunjangan = (double) (0.35*gaji);
    
    }   else{tunjangan=0;} 
       
        System.out.println("======== Hasil Perhitungan Gaji Anda ========");
        System.out.println("Gaji Pokok     : Rp." + gaji);
        System.out.println("Tunjangan      : Rp." + tunjangan );
        System.out.println("Total Gaji     : Rp." + (gaji+tunjangan));
        
    }
    
}
