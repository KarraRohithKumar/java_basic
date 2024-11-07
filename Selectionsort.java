package Sorting;

public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = {50,30,20,40,10};
    sort(arr);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(i+" ");}
    }
    static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int minimumIndex=i;
            for (int j = i; j < arr.length; j++) {
                if(arr[i]<arr[minimumIndex]){
                   minimumIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minimumIndex];
            arr[minimumIndex]=temp;
        }
    }
    }
    

