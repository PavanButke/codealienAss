// Find the second largest integer in an array of alphanumeric characters.


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int arr[]= new int[n];
        for(int i=0; i< n ; i++){
            arr[i]= scan.nextInt();
        }
        System.out.println(maxOfArray(arr,0));
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==arr.length){
            return Integer.MIN_VALUE;
        }
        int result= maxOfArray(arr , idx+1);
        if(result > arr[idx]){
            return result;
        }
        else{
            return arr[idx];
        }
    }

}
