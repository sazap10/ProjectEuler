import java.util.*;
public class Problem19 {
	/**
	 * @return The number of times a Sunday appears as the first day of the month for the interval January 1901 -
	 *         December 2000
	 */
	
	public static int countNumberOfSundays() {
		int numberOfSundays = 0;

		Calendar cal = new GregorianCalendar();

		// We have been told that 1st of January, 1900 was a Monday
		cal.set(1900, Calendar.JANUARY, 1);
		int sundayValue = cal.get(Calendar.DAY_OF_WEEK) - 1;

		for (int year = 1901; year < 2001; year++)
			for (int month = Calendar.JANUARY; month <= Calendar.DECEMBER; month++) {
				cal.set(year, month, 1);
				if (cal.get(Calendar.DAY_OF_WEEK) == sundayValue)
					numberOfSundays++;
			}

		return numberOfSundays;
	}
	public static void main(String[] args) {
		Problem19 pr = new Problem19();
		System.out.println(countNumberOfSundays());
	}
}
