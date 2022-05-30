package U4E2;

public class Student {

	int roll;
	String name;
	String address;
	int marks;

	
	Student(){
		
	}

	void setDetails(int roll, String name, String address, int marks) {
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}


//	public Student(int roll, String name, String address, int marks) {
//		this.roll = roll;
//		this.name = name;
//		this.address = address;
//		this.marks = marks;
//	}
	
}
