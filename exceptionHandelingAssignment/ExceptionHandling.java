package assignments.exceptionHandelingAssignment;

public class ExceptionHandling {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);	
		}catch(InterruptedException e) {
			try {
				throw new NewExceptions();
			} catch (NewExceptions e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

}

