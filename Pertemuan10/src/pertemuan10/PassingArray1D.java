/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan10;

/**
 *
 * @author MyPC PRO
 */
public class PassingArray1D {

    /**
     * @param args the command line arguments
     */
    
    static void min(int arr[]) {
        int min = arr[0];
        for (int i = 1; i<arr.length; i++)
            if(min < arr[i])
                min = arr[i];
            
            System.out.println(min);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = {100,20,70,40,50};
        
        min(a);
    }
}