	public class TopInteger_10 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
          
	        int n = Integer.parseInt(scanner.nextLine());

	        for (int number = 1; number <= n; number++) {

	            if(isSumDigitsDivisible(number) && holdsOddDigit(number)) {
	                System.out.println(number);
	            }
	 
	        }
	    }

	    public static boolean isSumDigitsDivisible(int number) {

	        int sum = 0;

	        while (number > 0) {

	            int lastDigit = number  % 10;

	            sum += lastDigit;

	            number = number / 10;
	        }

	        /*if (sum % 8 == 0) {
	            return true;
	        }

	        else {
	            return false;
	        }*/
	        return sum % 8 == 0;
	 
	    }

	    private static boolean holdsOddDigit (int number) {
	        while (number > 0) {
	            int lastDigit = number % 10;

	            if (lastDigit % 2 == 1) {
	                return true;
	            }

	            number = number / 10;
	        }
	        return false;
	 
	    }
