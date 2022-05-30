package U4E2;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many Student objects need to be created.");
		int input = sc.nextInt();
		
		Student[] st = new Student[input];

		
	for(int i=0; i<st.length;i++) {
		st[i] = new Student();
	}
	
	for(int i=1; i<=st.length;i++) {
		System.out.println("roll, name, address, marks of User"+i );
		
		st[i-1].setDetails(sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
	
	}
	for(int i=0; i<st.length;i++) {
		System.out.println(st[i].toString());
	}
	
	int avg=0;
	for(int i=0; i<st.length;i++) {
		avg += st[i].marks;
	}
	System.out.println("Average Marks: "+avg/st.length);
	
	
		
	
		
	}
}
