package assignments.threadAssignment;

public class MainThread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EvenNumberThread ent=new EvenNumberThread();
		ent.setName("Even number Thread");
		ent.start();
		
		OddNumberThread ont = new OddNumberThread();
		ont.setName("Odd number Thread");
		ont.start();
		
		for (int i = 0; i <= 10; i++) {
				System.out.print("Main"+" current number :- "+i);
		}
		
		
	}

}
