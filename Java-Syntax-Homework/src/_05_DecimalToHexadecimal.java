import java.util.Scanner;


public class _05_DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive integer number : ");
		int num = input.nextInt();
		
		System.out.println("Hex = " + Integer.toHexString(num));
	}

}
