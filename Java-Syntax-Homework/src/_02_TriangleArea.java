import java.util.Scanner;


public class _02_TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the coordinates of the first point : ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.print("Enter the coordinates of the second point : ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		System.out.print("Enter the coordinates of the third point : ");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double triangleArea = 0;
		
		triangleArea = Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2);
		
		System.out.println(Math.round(triangleArea));
	}

}
