public class HomeWorkApp2 {
    HomeWorkApp2() {
        System.out.print("Check sum of 10 & 10 is: ");
        System.out.println(checkSumLimit(10, 10));
        System.out.print("Check sum of 15 & 10 is: ");
        System.out.println(checkSumLimit(15, 10));

        System.out.print("Number -1 is positive: ");
        printPositive(-1);
        System.out.print("Number 0 is positive: ");
        printPositive(0);
        System.out.print("Number 777 is positive: ");
        printPositive(777);

        System.out.print("Number -1 is negative: ");
        System.out.println(isNegative(-1));
        System.out.print("Number 777 is negative: ");
        System.out.println(isNegative(777));

        printRepeat("Hello, world!", 5);
        printRepeat("Goodbye, world!", 3);

        System.out.print("2800 year is leap: ");
        System.out.println(isCustomYear(2800));
        System.out.print("2400 year is leap: ");
        System.out.println(isCustomYear(2004));
        System.out.print("2004 year is leap: ");
        System.out.println(isCustomYear(2004));
    }

    public static void main(String[] args) {
        new HomeWorkApp2();
    }

    // #1
    private boolean checkSumLimit(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // #2
    private void printPositive(int value) {
        System.out.println(value >= 0);
    }

    // #3
    private boolean isNegative(int value) {
        return value < 0;
    }

    // #4
    private void printRepeat(String str, int count) {
        for(int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    // #5
    private boolean isCustomYear(int year) {
        boolean custom = year % 4 == 0;

        if (custom) {
            if (year % 100 == 0 && year % 1000 != 400) {
                return false;
            }
            return true;
        }
        return false;
    }
}
