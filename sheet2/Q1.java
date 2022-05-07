package sheet2;

import java.util.Scanner;

public class Q1 {
    public static int findSumBetweenNumbers(int l, int r){
        int n=r-l+1;
        int sum=(n*(l+r))/2;
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the range of the number");
        int l=scan.nextInt();
        int r=scan.nextInt();
        System.out.println(findSumBetweenNumbers(l, r));
    }
}
