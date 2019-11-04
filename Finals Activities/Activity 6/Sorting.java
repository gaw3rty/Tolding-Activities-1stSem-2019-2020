/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author CC2-1H-29
 */
import java.util.Scanner;
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp, sum = 0;
        float mean;
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        
        int sizeArray[] = new int[n];
       
        for(int i = 0; i < n; i++){
            System.out.println("Enter Element [" + (i) + "]:");
            sizeArray[i] = sc.nextInt();
            sum += sizeArray[i];
        }
        System.out.print("Unsorted Arrays: ");
        for(int i = 0; i < n; i++){
        System.out.print(sizeArray[i] + " ");
        }
        for(int i = 0; i < n; i++){
            for(int x = 0; x < n; x++){
                if(sizeArray[i] < sizeArray[x]){
                    temp = sizeArray[i];
                    sizeArray[i] = sizeArray[x];
                    sizeArray[x] = temp;
                }
            }          
        }
        System.out.print("\n  Sorted Arrays: ");
        for(int i = 0; i < n; i++){
            System.out.print(sizeArray[i] + " ");    
        }
        
        mean = sum/sizeArray.length;
        System.out.println("\n\t   mean: " + mean);
        
         
    } 
}

