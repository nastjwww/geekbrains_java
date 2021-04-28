public class HomeWorkApp {
    HomeWorkApp() {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void main(String[] args) {
        new HomeWorkApp();
    }

    // #2
    private void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    // #3
    private void checkSumSign() {
        int a = 0;
        int b = 666;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // #4
    private void printColor() {
        int value = 10;
        String color;

        if (value <= 0) {
            color = "Красный";
        } else if(value > 0 && value <= 100) {
            color = "Желтый";
        } else {
            color = "Зеленый";
        }

        System.out.println(color);
    }

    // #5
    private void compareNumbers() {
        int a = 777;
        int b = 666;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
