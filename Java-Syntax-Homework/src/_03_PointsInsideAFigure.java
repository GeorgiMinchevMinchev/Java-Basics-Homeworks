import java.util.Scanner;


public class _03_PointsInsideAFigure {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the coordinates of the point : ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		boolean insideFigure = false;
		
		if (x >= 12.5 && x <= 22.5 && y >= 6 && y <= 8.5) {
			insideFigure = true;
		}
		else if (x >= 12.5 && x <= 17.5 && y >= 8.5 && y <= 13.5) {
			insideFigure = true;
		}
		else if (x >= 20 && x <= 22.5 && y >= 8.5 && y <= 13.5) {
			insideFigure = true;
		}
		
		if (insideFigure) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
	}

}
