package Q2;

public class PermanentEmployee extends Employee{
	
	double basicPay;

	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay=basicPay;
		calculateSalary();
	}

	@Override
	void calculateSalary() {
		this.salary=basicPay-(basicPay*0.12);
	}
	
}
