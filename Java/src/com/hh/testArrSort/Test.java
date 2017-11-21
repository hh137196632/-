package com.hh.testArrSort;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=0;
		int b=0;
		System.out.println(a==0);
		System.out.println(b==0);
		System.out.println(a==b);
		String  stra="a";
		String  strb="a";
		System.out.println(stra=="a");
		System.out.println(strb=="a");
		System.out.println(stra==strb);*/
	 for(int i=0;i<10;i++){
		 System.out.println(new Random().nextInt(3));
	 }
	  float a = 0.666666f;
	  int b= (int)a;
	  double  c=  0.6;
	  System.out.println(b);
	  
	 Date  a1  =new  Date();
	 
	//System.out.println(getDayOfWeekByDate("2017-11-6  11:48:00")); 
	 //System.out.println(getWeek(new Date()));
	
	}
	/* public static String getDayOfWeekByDate(String date) {
	        String dayOfweek = "-1";
	        try {
	            SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
	            Date myDate = myFormatter.parse(date);
	            SimpleDateFormat formatter = new SimpleDateFormat("E");
	            String str = formatter.format(myDate);
	            dayOfweek = str;

	        } catch (Exception e) {
	            System.out.println("´íÎó!");
	        }
	        return dayOfweek;
	    }*/
	public static String getWeek(Date date){
	String[] weeks = {"7","1","2","3","4","5","6"};
	Calendar cal = Calendar.getInstance();
	cal.setTime(date);
	int week_index = cal.get(Calendar.DAY_OF_WEEK) - 1;
	if(week_index<0){
		week_index = 0;
	} 
	return weeks[week_index];
}
}
