package com.test.ten;

import java.util.Random;

public class Main {
	private int[]arr = {1,2,3,4,5,6,7,8,9,10};  
    private static final int SIZE = 10;  
    Random random = new Random();  
	public static void main(String[] args) {
		Main main = new Main();
		sort(main.random,main.arr);
		printArr(main.arr);
	}
	public static void sort(Random random,int[] arr){  
        for(int i=0;i<SIZE;i++){  
            int p = random.nextInt(i+1); 
            int tmp = arr[i];  
            arr[i] = arr[p];  
            arr[p] = tmp;  
        }  
	}
	
	 public static void printArr(int[] arr ){  
	        for(int i=0;i<SIZE;i++){  
	            System.out.print(arr[i]+" ");  
	        }  
	    }  	
	
}
