package exercise5;

import java.util.Date;
import java.util.Random;
public class Practice9_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUM=10000;
		int[] number=new int[NUM];
		Random random=new Random();
		
		for(int i=0;i<NUM;i++) {
			number[i]=random.nextInt(10000);
		}
		
		StopWatch stopWatch=new StopWatch();
		sort(number);
		stopWatch.stop();
		
		System.out.println(stopWatch.getElapsedTime() + "ms");
	}
	
	public static void sort(int[] list) {
		
		for(int i=0;i<list.length-1;i++){
			int currentMax=list[i];
			int currentMaxIndex=i;
			
			for(int j=i+1;j<list.length;j++){
				if(currentMax<list[j]){
					currentMax=list[j];
					currentMaxIndex=j;
				}
			}
			
			if(currentMaxIndex !=i){
				list[currentMaxIndex]=list[i];
				list[i]=currentMax;
			}
		}
	}

}

class StopWatch{
	private Date startTime;
	private Date endTime;
	
	public StopWatch() {
		startTime=new Date();
	}
	
	public void start() {
		startTime=new Date();
	}
	
	public void stop() {
		endTime=new Date();
	}
	
	public long getElapsedTime() {
		return endTime.getTime()-startTime.getTime();
	}
	
	public Date getStartTime() {
		return startTime;
	}

	public Date getEndTime() {
		return endTime;
	}
}
