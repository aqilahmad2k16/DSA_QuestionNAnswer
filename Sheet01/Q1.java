
package Sheet01;    

import java.util.ArrayList;
import java.util.HashMap;

public class Q1{
    // public static void main(String[] args) {
        //Question:- find the frequency of the character
    //   HashMap<Character, Integer> hm = new HashMap<>(); 
    //     String str = "abceeffffiii";
    //     for(int i=0; i<str.length(); i++){
    //         char ch = str.charAt(i);
    //         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
    //             if(!hm.containsKey(ch)){
    //                 hm.put(ch, 1);
    //             }else{
    //                 int val = hm.get(ch);
    //                 int val1 = val+1;
    //                 hm.put(ch, val1);
    //             }
    //         }
    //     }

    //     char ch1 = '\0';
    //     int max = hm.get(str.charAt(0));
    //     for(Character keys: hm.keySet()){
    //         if(hm.get(keys) > max){
    //             max = hm.get(keys);
    //             ch1 = keys;
    //         }
            
    //     }
        

    //     System.out.println(ch1);
    //     System.out.println(max);

    //     char ch3 = '\0';
    //     int min = hm.get(str.charAt(0));
    //     for(Character key1 : hm.keySet()){
    //         if(key1 == 'a' || key1 == 'e' || key1 == 'i' || key1 == 'o' || key1 == 'u'){

    //             if(hm.get(key1) < min){
    //                 min = hm.get(key1);
    //                 ch3 = key1;
    
    //             }
    //         }
    //     }

    //     if(hm.get(str.charAt(0)) <= min){
    //         min = hm.get(str.charAt(0));
    //         ch3 = str.charAt(0);
    //     }

    //     System.out.println(ch3);
    //     System.out.println(min);

    // }

    // public static void main(String[] args) {
    //     HashMap<Integer, Integer> hm = new HashMap<>();

    //     int a1[] = {1,2,2,1};
    //     int a2[] = {2,2};
    //     ArrayList<Integer> lst = new ArrayList<>();

        // for(int i=0; i<a1.length; i++){
        //     if(!hm.containsKey(a1[i])){
        //         hm.put(a1[i], i);
        //     }
        //     // hm.put(i, a1[i]);
        // }
        // for(int i=0; i<a2.length;i++){

        //     for(Integer key : hm.keySet()){
                
        //     }
        // }

        // for(int i=0; i<a2.length; i++){
        //     for(int j=0; j<a1.length; j++){
        //         if(a2[i] == a1[j]){

        //             if(!hm.containsKey(a2[i])){
        //                 hm.put(a2[i], i);
        //             }
        //         }
        //     }
        // }

        // System.out.println(hm);
        // for(Integer key : hm.keySet()){
        //     lst.add(key);
        // }

        // int[] arr = new int[lst.size()];
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = lst.get(i);
        //     System.out.println(arr[i]);
        // }



        

    // }

    public static void main(String[] args) {
        // int[] arr = {1,1,2,3,4,4,4,5,5,5,5,6,6};

        // ArrayList<Integer> lst = new ArrayList<>();
        // int c1 = 0, c2 = 0;
        // int count = 1;
        // while(c1 < arr.length ){
        //     if(arr[c1] == arr[c2]){
        //         count++;
        //         c1++;
        //     }else{
        //         if(count >=2 && count <=3){
        //             lst.add(arr[c2]);
        //             count = 1;
        //         }
        //         c2 = c1;
        //         c1++;
        //     }
        // }
        // if(count>=2 && count<=3){
        //     lst.add(arr[c2]);
        // }

        // System.out.println(lst);


        //Question: find the union of two arrays

        // int[] a1 = {1,3,5,6,9,2,2};
        // int[] a2 = {4, 4, 5, 8};

        // ArrayList<Integer> lst = new ArrayList<>();
        
        
        // lst.add(a1[0]);
        // for(int i=1; i<a1.length; i++){
        //     if(!lst.contains(a1[i])){
        //         lst.add(a1[i]);
        //     }
        // }

       

        // for(int i=0; i<a2.length; i++){
        //     if(!lst.contains(a2[i])){
        //         lst.add(a2[i]);
        //     }
        // }

        
        // int[] arr = new int[lst.size()];
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = lst.get(i);
        // }

        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }


        // Question:- find the intersection of the two array

        

        // ArrayList<Integer> lst = new ArrayList<>();

        // int c1 = 0, c2 = 0;
        // while(c1<a1.length && c2<a2.length){
        //     if(a1[c1] == a2[c2]){
        //         lst.add(a1[c1]);
        //         c1++;
        //         c2++;
        //     }
       
        //     c1++;
        //     c2++;
       
        // }

        int[] a1 = {1,8};
        int[] a2 = {2};
        int[] arr = new int[a1.length + a2.length];
        int c1 = 0, c2 = 0, c3 = 0;
        while(c1<a1.length && c2<a2.length){
            if(a1[c1] < a2[c2]){
                arr[c3] = a1[c1];
                c3++;
                c1++;
            }else{
                arr[c3] = a2[c2];
                c3++;
                c2++;
            }
        }

        while(c1<a1.length){
            arr[c3] = a1[c1];
            c3++;
            c1++;
        }

        while(c2<a2.length){
            arr[c3] = a2[c2];
            c3++;
            c2++;
            
        }

        int n = arr.length;
        if(n%2 == 0){
            float medn = ((arr[(n/2) -1] + arr[(n/2)])/2);
            System.out.println(String.format("%.4f",medn));
        }else{
            float medn = arr[(n/2)];
            System.out.println(String.format("%.4f", medn));
        }
    
        

       



        

    }

}