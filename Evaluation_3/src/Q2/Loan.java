package Q2;

public class Loan {
	public double calculateLoanAmount(Employee employeeObj) {
		
		double loan=0;
		
		if(employeeObj instanceof PermanentEmployee) {
			loan=employeeObj.salary*15/100;
			return loan;
		}
		if(employeeObj instanceof TemporaryEmployee) {
			loan=employeeObj.salary*10/100;
			return loan;
		}
		return 0;
		
	}
}
