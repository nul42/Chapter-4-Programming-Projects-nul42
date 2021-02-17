package p4_2;

/**
Constructs the date of Easter Sunday.
*/
public class Easter {

	private int year = -1;
	private int month = -1;
	private int day = -1;

	/**
	 * Constructs an Easter object with the provided year.
	 * @param year_ the year provided.
	 */
	public Easter(int year_) {
		year = year_;
		int a = year % 19;
		int b = year / 100;
		int c = year % 100;
		int d = b / 4;
		int e = b % 4;
		int g = (8 * b + 13) / 25;
		int h = (19 * a + b - d - g + 15) % 30;
		int j = c / 4;
		int k = c % 4;
		int m = (a + 11 * h) / 319;
		int r = (2 * e + 2 * j - k - h + m + 32) % 7;
		int n = (h - m + r + 90) / 25;
		int p = (h - m + r + n + 19) % 32;
		
		month = n;
		day = p;
	}
	
	
   /**
      Gets the month of Easter Sunday
      @return month of Easter Sunday
   */
	public int getEasterSundayMonth() {//Note to self, could subtract values after the / to get the remainders instead of mod.
		return month;
	}

   /**
      Gets the date of Easter Sunday
      @return date of Easter Sunday
   */
	public int getEasterSundayDay() {
		return day;
	}
}
