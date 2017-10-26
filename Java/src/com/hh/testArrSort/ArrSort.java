package com.hh.testArrSort;

import java.util.Date;

public class ArrSort {

	public static void main(String[] args) {
		int[] a= new int[]{3,2,1,5,4}; 
		selectSort(a);
		//rubbleSort(a);
		
	}
 
	//选择排序
	public static void selectSort(int arr[]){
		Date d = new Date();
		int min=0;//定义最小的变量
		int minindex=0;//要换的最小数的坐标
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[i]){
					minindex=j;
				}
				min=arr[minindex];
				arr[minindex]=arr[i];
				arr[i]=min;
			}
			
		}
		Date d1 = new Date();
		System.out.println("选择排序花费时间 "+(d1.getTime()-d.getTime()));
		for (int i : arr) {
			System.out.print(" "+i);
		}
	}
	//冒泡排序
	public static void rubbleSort(int arr[]){
		Date d = new Date();
		for(int i=0;i<arr.length;i++){
			 int min=arr[i];//min只是一个常量，下面交换后数组的a[0]的值不是arr[0]的初始值，所以要写  min=arr[i];
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<min){
					 min=arr[i];
					arr[i]=arr[j];
					arr[j]=min;
				}
			}
		}
		Date d1 = new Date();
		System.out.println("冒泡排序花费时间 "+(d1.getTime()-d.getTime()*1000));
		for (int i : arr) {
			System.out.print(" "+i);
		}
	}
	
}
