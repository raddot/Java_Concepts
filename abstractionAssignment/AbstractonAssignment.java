package assignments.abstractionAssignment;

public class AbstractonAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TouchScreenLaptop tsl1=new HPNotebook();
		TouchScreenLaptop tsl2=new DellNotebook();

		tsl1.scroll();
		tsl1.click();
		
		tsl2.scroll();
		tsl2.click();
		
	}

}
