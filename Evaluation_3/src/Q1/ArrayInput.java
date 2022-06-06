package Q1;
import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int e = sc.nextInt();
		System.out.println("Enter the elements in the array");
		int[] arr = new int[e];
		for(int i=0; i<e; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Enter the index of the array element you want to access");
		int index = sc.nextInt();
		try {
			System.out.println("The array element at index "+index+" = "+arr[index]);
			
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(NumberFormatException exc) {
			System.out.println("java.lang.NumberFormatException");
		}
		sc.close();
	}
}
