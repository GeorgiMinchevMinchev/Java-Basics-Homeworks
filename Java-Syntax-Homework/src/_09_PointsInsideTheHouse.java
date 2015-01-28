import java.util.Scanner;


public class _09_PointsInsideTheHouse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the coordinates of the point : ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		boolean insideHouse = false;

		boolean insideTriangle = false;
		
		if (isInside(12.5, 8.5, 17.5, 3.5, x, y) && isInside(17.5, 3.5, 22.5, 8.5, x, y) && isInside(22.5, 8.5, 12.5, 8.5, x, y)) {
			insideTriangle = true;
		}		
		
		if (insideTriangle) {
			insideHouse = true;
		}
		else if (x >= 12.5 && x <= 17.5 && y >= 8.5 && y <= 13.5) {
			insideHouse = true;
		}
		else if (x >= 20 && x <= 22.5 && y >= 8.5 && y <= 13.5) {
			insideHouse = true;
		}
		
		if (insideHouse) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
	}

	private static boolean isInside(double aX, double aY, double bX, double bY, double x, double y) {
		return ((bX - aX) * (y - aY) - (bY - aY) * (x - aX)) >= 0;
	}
		
}
