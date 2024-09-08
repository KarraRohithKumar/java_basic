package Arrays;

import java.util.Scanner;

public class arrayCreation {
    public static void main(String[] args) {
      int[] arr={1,2,3,4}; 
      modifyanarray(arr);
        //arr[3]=1111;
       // for(Integer i:arr){
       for(int i=0;i<=arr.length;i++){
       System.out.print(arr[i]+" ");  
      }}
      static void modifyanarray(int[] b){
        b[3]=1112;
      }
    }