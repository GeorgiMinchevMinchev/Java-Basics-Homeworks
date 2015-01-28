import java.util.Arrays;
import java.util.Scanner;


public class _08_SortStringArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of strings : ");
		int n = input.nextInt();
		input.nextLine();
		String[] StrArray = new String[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter string %d : ", i + 1);
			StrArray[i] = input.nextLine();
		}
		
		Arrays.sort(StrArray);
		
		for (int i = 0; i < StrArray.length; i++) {
			System.out.println(StrArray[i]);
		}
	}

}
