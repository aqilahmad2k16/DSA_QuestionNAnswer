package Sheet01;

import java.util.Scanner;

public class Q01{
    public static void findThePair(int[] arr, int k){
        int l=0, r=arr.length-1;
        while(l<r){
            if(arr[l]*arr[r] > k){
                r--;
            }else if(arr[l]*arr[r] < k){
                l++;
            }else if( arr[l]*arr[r] == k){
                System.out.println("( "+ l + " , "+ r+ " )");
                r--;
                l++;
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size the of array");

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        System.out.println("enter the value of k");
        int k = scan.nextInt();

        findThePair(arr, k);
        scan.close();
    }
}