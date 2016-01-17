package Ch08;

public class EnhancingClassDate {
	private int month; // 1-12
	private int day; // 1-31 based on month
	private int year; // any year

	// constructor: call checkMonth to confirm proper value for month;
	// call checkDay to confirm proper value for day
	public EnhancingClassDate(int theMonth, int theDay, int theYear) {
		month = checkMonth(theMonth); // validate month
		year = theYear; // could validate year
		day = checkDay(theDay); // validate day

		System.out.printf("Date object constructor for date %s\n", this);
		System.out.println("Invalid day and month will set to 1");
	} // end Date constructor

	// utility method to confirm proper month value
	private int checkMonth(int testMonth) {
		if (testMonth > 0 && testMonth <= 12) // validate month
			return testMonth;
		else // month is invalid
		{
			return 1; // maintain object in consistent state
		} // end else
	} // end method checkMonth

	// utility method to confirm proper day value based on month and year
	private int checkDay(int testDay) {
		int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,
				31 };

		// check if day in range for month
		if (testDay > 0 && testDay <= daysPerMonth[month])
			return testDay;

		// check for leap year
		if (month == 2 && testDay == 29
				&& (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
			return testDay;

		else
			return 1; // maintain object in consistent state
	} // end method checkDay

	public void nextDay(String jugde, int amount) {

		int month_counter = 0;
		int year_counter = 0;
		for (int i = 0;; i++) {

			day++;
			day = checkDay(day);// add and set

			// judge it is over a month?
			if (i != 0 && checkDay(day) == 1) {
				if (jugde.equals("year")
						|| (jugde.equals("month") && month_counter <= amount))
				// 限定月数
				{
					month++;
					month = checkMonth(month);
					month_counter++;
					// judge it is over a year
					if (i != 0 && checkMonth(month) == 1) {
						if (jugde.equals("month") || jugde.equals(year)
								&& year_counter <= amount)
							year++;
						else
							break;
					}
				} else
					break;
			}
			System.out.println(toString());
		}

	}

	// return a String of the form month/day/year

	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
	} // end method toString
} // end class Date
