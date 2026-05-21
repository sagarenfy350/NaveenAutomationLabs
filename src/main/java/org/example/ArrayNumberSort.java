package org.example;

public class ArrayNumberSort {
    public static void main(String[] args) {
        int[] arr={11,34,1,97,67,78,34};
        int temp=0;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int num : arr){
            System.out.println(num);
        }
    }
}
