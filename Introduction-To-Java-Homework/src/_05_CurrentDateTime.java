import java.time.*;


public class _05_CurrentDateTime {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Current date is : " + today);
		LocalTime time = LocalTime.now();
		System.out.println("Current time is : " + time);
		
		System.out.println("The date in formatted output:");
		System.out.printf("%1$td/%1$tm/%1$tY %1$tH:%1$tM:%1$tS",LocalDateTime.now());
	}

}
