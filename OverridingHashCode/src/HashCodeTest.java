
public class HashCodeTest {
 int number;
 String name;
 
 public HashCodeTest(int number, String name) {
	super();
	this.number = number;
	this.name = name;
}


 
	public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}



	@Override
public int   hashCode() {
	// TODO Auto-generated method stub
	return number;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashCodeTest hcode=new HashCodeTest(10,"Arjun");
		
		System.out.println(hcode.hashCode());
		System.out.println(hcode.toString());		
	
	}

}
