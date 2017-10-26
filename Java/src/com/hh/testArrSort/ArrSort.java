package com.hh.testArrSort;

import java.util.Date;

public class ArrSort {

	public static void main(String[] args) {
		int[] a= new int[]{3,2,1,5,4}; 
		selectSort(a);
		//rubbleSort(a);
		
	}
 
	//ѡ������
	public static void selectSort(int arr[]){
		Date d = new Date();
		int min=0;//������С�ı���
		int minindex=0;//Ҫ������С��������
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
		System.out.println("ѡ�����򻨷�ʱ�� "+(d1.getTime()-d.getTime()));
		for (int i : arr) {
			System.out.print(" "+i);
		}
	}
	//ð������
	public static void rubbleSort(int arr[]){
		Date d = new Date();
		for(int i=0;i<arr.length;i++){
			 int min=arr[i];//minֻ��һ�����������潻���������a[0]��ֵ����arr[0]�ĳ�ʼֵ������Ҫд  min=arr[i];
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<min){
					 min=arr[i];
					arr[i]=arr[j];
					arr[j]=min;
				}
			}
		}
		Date d1 = new Date();
		System.out.println("ð�����򻨷�ʱ�� "+(d1.getTime()-d.getTime()*1000));
		for (int i : arr) {
			System.out.print(" "+i);
		}
	}
	
}
