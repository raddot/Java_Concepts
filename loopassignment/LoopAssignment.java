package assignments.loopassignment;

import java.util.Scanner;

public class LoopAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter an integer");
		int n=sc.nextInt();
		for(int i=1;i<n;i++) {
			
			
			if (i%10==0)
				continue;
			if(i>100)
				break;
			System.out.println(i);
		}
		

	}

}
