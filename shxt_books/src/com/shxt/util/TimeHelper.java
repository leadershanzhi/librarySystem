package com.shxt.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeHelper {
	
   /*public static void main(String[] args) {
	  
	   
	   System.out.println(getSubtraction("2012-10-07 13:53:43","2012-12-07 13:53:43"));
	   System.out.println(getLTime());
   }*/
   public static String getLTime(){
	   String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
       return time;
   }
   public static String getSTime(){
	   String time = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
       return time;
   }
   public static int getSubtraction(String d1,String d2){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date1 = df.parse(d1);
			Date date2 = df.parse(d2);
			long result = date2.getTime() - date1.getTime();
			if(result%(1000*60*60) == 0){
				result = result/(1000*60*60);
			}else{
				result = result/(1000*60*60)+1;
			}
			return (int)result;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
    
}
