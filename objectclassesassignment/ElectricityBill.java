package ObjectClassesAssignment;

public class ElectricityBill {

	int meterno;
	String name, address;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricityBill e = new ElectricityBill(123,"AAA","Pune");
                System.out.println(e);
               
               ElectricityBill e1 = new ElectricityBill(456,"BBB","Mumbai");
               System.out.println(e1);

	       System.out.println("The hash code is :"+e.hashCode());
	       Integer i=new Integer(e1.meterno);
	       Integer b=new Integer(e.meterno);
               System.out.println("Is meter no equal in two objects:"+i.equals(b));
               
	}	

	ElectricityBill(int meterno, String name, String address) {
		this.meterno = meterno;
		this.name = name;
		this.address = address;
	}

	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Meter no is :-" + meterno + " Name is :- " + name + " Address is " + address;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return meterno;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj==null) {
			return false;
		}
		
		if(new Integer(this.meterno)==obj) {
			
			return true;
		}
		
		return false;
	}

}
