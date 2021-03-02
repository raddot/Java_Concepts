package assignments.flowcontrolassignment;

import java.util.Scanner;

public class FlowControlAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer");
		int n = sc.nextInt();
		boolean flag=true;

		for (int i = 2; i < n-1; i++) {

			if(n%i==0) {
				flag=false;
				break;
			}
			
			
		}
		
		if(flag) {
			
			System.out.println("Prime");
		}
		else {
			
			System.out.println("Not Prime");
		}

	}

}
