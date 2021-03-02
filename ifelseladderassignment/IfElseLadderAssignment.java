package assignments.ifelseladderassignment;

import java.util.Scanner;

public class IfElseLadderAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter maths marks :- ");
		int maths = sc.nextInt();
		System.out.println("Enter physics marks :- ");
		int physics = sc.nextInt();
		System.out.println("Enter chemistry marks :- ");
		int chemistry = sc.nextInt();

		if (physics < 35 || maths < 35 || chemistry < 35) {

			System.out.println("Fail");

		} else {

			int avg = (physics + maths + chemistry) / 3;

			if (avg <= 59) {
				System.out.println("Grade:- C");
			} else if (avg <= 69) {
				System.out.println("Grade:- B");
			} else {
				System.out.println("Grade:- A");
			}

		}

	}

}

/*
 * Output:-
 * 
 * Enter maths marks :- 60
 * Enter physics marks :- 78 
 * Enter chemistry marks :- 82
 * Grade:- A
 * 
 */
