import java.util.Scanner;


public class _06_FormattingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer a (0 <= a <= 500) : ");
		int a = input.nextInt();
		
		System.out.print("Enter a floating-point number b : ");
		double b = input.nextDouble();
		
		System.out.print("Enter a floating-point number c : ");
		double c = input.nextDouble();
		
		String binary = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
		
		System.out.printf("|%-10S|%s|%10.2f|%-10.3f",Integer.toHexString(a) , binary, b, c);
	}

}
