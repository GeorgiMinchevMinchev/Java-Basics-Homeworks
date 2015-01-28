import java.util.Scanner;


public class _01_RectangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the sides of the rectangle : ");
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.printf("The area of the rectangle is : %d", a * b);
	}

}
