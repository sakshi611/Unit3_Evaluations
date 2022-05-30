package U4E2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of passengers");
		int p = sc.nextInt();
		System.out.println("Enter number  of kms");
		int kms = sc.nextInt();
		
		OLA ola= new OLA();
		
		Car car = ola.bookCar(p, kms);
       
		int tf =ola.calculateBill(car);
		System.out.println("Total Fare: "+tf);
		sc.close();
	}

}
