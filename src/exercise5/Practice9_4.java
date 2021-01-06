package exercise5;

import java.util.Random;
public class Practice9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random(1000);
		for(int i=0,n=0;i<50;i++,n++) {
			if(n==5) {
				System.out.println("");
				n=0;
			}
			System.out.print(random.nextInt(100)+"\t");
		}
	}

}
