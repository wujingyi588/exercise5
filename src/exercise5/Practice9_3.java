package exercise5;

import java.util.Date;
public class Practice9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time=10000;
		Date date=new Date(time);
		
		for(int i=0;i<8;i++) {
			date.setTime(time);
			printDate(time,date);
			time=time*10;
		}
	}
	
	public static void printDate(long time,Date date) {
		System.out.println(time+":"+date.toString());
	}
}
