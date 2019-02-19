
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Berkay
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner =new Scanner(System.in);
        
        System.out.print("Boy Giriniz: ");
        double boy=scanner.nextDouble();
        
        System.out.print("Kilo Giriniz: ");
        double kilo=scanner.nextDouble();
       
        
        double sonuc= kilo/(boy*boy);
        
        System.out.println("Kitle Endeksiniz: "+sonuc);
        
        
    }
    
}
