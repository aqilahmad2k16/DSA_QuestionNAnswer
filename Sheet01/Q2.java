package Sheet01;
public class Q2 {

    // public static int[] mergeSort(int[] arr, int lef, int rig){
    //     if(lef == rig){
    //         int[] base = new int[1];
    //         base[0] = arr[0];
    //         return base;
    //     }

    //     int mid = (lef+rig)/2;

    //     int[] lefsort = mergeSort(arr, lef, mid);
    //     int[] rigsort = mergeSort(arr, mid+1, rig);

    //     int[] sortedArray = mergeTwoSortedArray(lefsort, rigsort);

    //     return sortedArray;
    // }


    // public static int[] mergeTwoSortedArray(int[] left, int[] right){
    //     int i=0, j=0, k=0;
    // }
    public static void main(String[] args) {
       //Question 2 
       int a = 1, b = 1;
       for(int i=3; i<=10; i++){
           int c = a+b;
           if(c>4 && c<40){

               System.out.print(c + " ");
           }
           a = b;
           b = c;
       }


       //Question 1

    //    int pn = 5;
    //    int spn = pn*pn;
    //    for(int div=1; div<spn; div++){
    //        if(spn%div == 0){
    //            System.out.print(div + " ");
    //        }
    //    }

       // Question 3

    //    int[] arr = {2,-5,3,5,-4,8};
    //    int sum = Integer.MIN_VALUE;
    //    int sum1 = 0;
    //    for(int i=0; i<arr.length; i++){
    //        for(int j = 0; j<=i; j++){
    //            sum1 += arr[j];
    //        }

    //        if(sum1>sum){
    //            sum = sum1;
    //        }
    //    }



    //    System.out.println(sum);

    //    //Question 4
    //    int[] arr = {-1,2,3,-5,0,1,2,4,5};
    //    int l=0, r=arr.length-1;
    //    int[] arr1 = mergeSort(arr, l, r);



    }
}
