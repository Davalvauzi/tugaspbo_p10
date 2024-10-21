/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum;

import java.util.Scanner;

/**
 *
 * @author MyPC PRO
 */
public class Kota {
    public static void main(String[] args) {
        // TODO code application logic here
        String[] kota = new String[20];
        Scanner input = new Scanner (System.in);
        int i;
        
        System.out.print("Masukkan jumlah data: ");
        int jml = input.nextInt();
        for (i = 0; i<jml; i++){
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan nama Kota : "); 
            kota[i]=input.next();
        }
    
        System.out.println("\n Nama - nama Kota");
        for (i=0; i<jml; i++) {
            System.out.print((i + " "));
            System.out.println("Nama Kota: " + kota[i] );
        }   
    }   
}