/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayleftrotation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Slime nightmare
 */
public class ArrayLeftRotation {

    /**
     * @param args the command line arguments
     */
    
    //Ham rotateLeft su dung queue
    public static int[] rotateLeft(int d, int[] arr) {
        // Write your code here
        Queue<Integer> queue = new LinkedList<>();
        for (int i : arr) {
            queue.add(i);
        }
        for (int i = 1; i <= d; i++) {
            int num = queue.poll();
            queue.add(num);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = queue.poll();
        }
        return arr;
    }

   public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        int[] arrResult = rotateLeft(d, arr);
        for(int i = 0; i< n ; i++){
            System.out.print(arrResult[i] + " ");
        }
}
}
