package assignments.threadAssignment;

public class EvenNumberThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print("Thread " + this.getName() + " current number :- " + i);
			}
		}
	}

}
