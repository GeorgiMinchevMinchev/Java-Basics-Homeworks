import java.util.Scanner;


public class _07_CountOfBitsOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer number : ");
		int a = input.nextInt();
		
		System.out.printf("Number of one bits is %d", Integer.bitCount(a));
	}

}
