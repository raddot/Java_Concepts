package assignments.arrayAssignment;

public class ArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String array[] = { "String1", "String2", "String3", "String4", "String5" };

		System.out.println("String array in reverse :- ");

		for (int i = array.length - 1; i >= 0; i--) {

			System.out.println("i:- " + i + " String :- " + array[i]);

		}

	}

}
