public class NumberOfDaysInMonth {
    public static void main(String[] args) {

        System.out.println("no of month="+getDaysInMonth(2,2021));
    }
    public static boolean isLeapYear(int year) {

        if ((year < 1) || (year >= 9999)) {
            return false;
        } else return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {

        if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))) {
            return -1;
        }
        else if (isLeapYear(year) && month == 2) {
            return 29;
        }

        return switch (month) {
            case 11, 4, 6, 9 -> 30;
            case 2 -> 28;
            default -> 31;
        };

    }
}