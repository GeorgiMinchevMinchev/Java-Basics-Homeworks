import java.util.Scanner;


public class _08_CountEqualBitPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer number : ");
		int a = input.nextInt();

		char[] numChar = Integer.toBinaryString(a).toCharArray();
		int counter = 0;
		char currentBit = numChar[0];
		
		for (int i = 1; i < numChar.length; i++) {
			if (currentBit == numChar[i]) {
				counter++;
			}
			else {
				currentBit = numChar[i];
			}
		}
		
		System.out.printf("Count of equal bit pairs is : %d", counter);
	}

}
