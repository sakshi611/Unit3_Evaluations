package U4E2;

public class Car {

	int numberOfPassenger;
	int numberOfKms;
	
	
}

class Sedan extends Car{
	final int farePerKm =20;
	
}
class HatchBack  extends Car{
	final int farePerKm =15;
	
}
class OLA{

	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3) {
			Car c1 = new HatchBack();
			return c1;
		}
		else {
			Car s1 = new Sedan();
			return s1;
		}
		
	}

	public int calculateBill(Car car) {
		
		if(car instanceof Sedan ) {
			Sedan se1=(Sedan) car;
			int Total_fare = se1.numberOfKms * se1.farePerKm;
//			System.out.println(car.numberOfKms);
//			System.out.println(se1.numberOfKms);
			return Total_fare;
		}
		else{
			HatchBack hb1 = (HatchBack) car;
			int Total_fare1 = hb1.numberOfKms * hb1.farePerKm;
//			System.out.println(hb1.numberOfKms);
//			System.out.println(car.numberOfKms);
			return Total_fare1;
		}
	
	}
}