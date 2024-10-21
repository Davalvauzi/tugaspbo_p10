package latihan;

import java.util.Scanner;

public class Toserba {
    public static void main(String[] args) {
        String[] kodeBarang = {"a1", "a2", "a3"};
        String[] namaBarang = {"Buku Gambar", "Pensil Gambar", "Pulpen Warna"};
        int[] hargaBarang = {3000, 4000, 5000};

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah Item Barang yang ingin dibeli: ");
        int jumlahItem = input.nextInt();  
        
        String[] kodeBeli = new String[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];
        int[] jumlahBayar = new int[jumlahItem];

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode Barang: ");
            kodeBeli[i] = input.next(); 
            System.out.print("Masukkan Jumlah Beli: ");
            jumlahBeli[i] = input.nextInt();  
        }

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("*************************");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("==============================================================");

        int totalBayar = 0;
        for (int i = 0; i < jumlahItem; i++) {
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBeli[i].equals(kodeBarang[j])) {
                    jumlahBayar[i] = hargaBarang[j] * jumlahBeli[i];
                    totalBayar += jumlahBayar[i];
                    System.out.printf("%-4d %-12s %-12s %-6d %-12d %-12d\n", 
                                      (i + 1), kodeBarang[j], namaBarang[j], hargaBarang[j], jumlahBeli[i], jumlahBayar[i]);
                }
            }
        }

        System.out.println("==============================================================");
        System.out.println("Total Bayar\t\t\t\t\t\t  " + totalBayar);
        System.out.println("==============================================================");
    }
}