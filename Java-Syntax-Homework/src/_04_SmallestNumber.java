import java.util.Scanner;


public class _04_SmallestNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		double first = input.nextDouble();
		
		System.out.print("Enter second number : ");
		double second = input.nextDouble();
		
		System.out.print("Enter third number : ");
		double third = input.nextDouble();
		
		double smallest = first;
		
		if (second < smallest) {
			smallest = second;
		}
		if (third < smallest) {
			smallest = third;
		}
		
		System.out.println(smallest);
	}

}
