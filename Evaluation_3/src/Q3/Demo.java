package Q3;
import java.util.Scanner;

public class Demo {
	
	void showDetails(Month m){
		switch(m) {
			case JAN : System.out.println("This is the 1st Month of the Year January");
			break;
			case FEB: System.out.println("This is the 2nd Month of the Year Feb");
			break;
		
			default:System.out.println("Enter Vaild Month");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String mo = sc.next();
		
		Month mon = Month.valueOf(mo);
		
		new Demo().showDetails(mon);
		
		sc.close();

	}

}
