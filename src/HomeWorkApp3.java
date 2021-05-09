import java.util.Arrays;

public class HomeWorkApp3 {
    HomeWorkApp3() {
        swapNumbers();
        initArrayLoop();
        multiplySmall();
        table();
        System.out.println(Arrays.toString(createArray(3, 7)));
        minMaxItems();
    }

    public static void main(String[] args) {
        new HomeWorkApp3();
    }

    // #1
    private void swapNumbers() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    // #2
    private void initArrayLoop() {
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    // #3
    private void multiplySmall() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    // #4
    private void table() {
        int[][] arr = new int[9][9];
        int len = arr.length;

        for(int i = 0; i < len; i++) {
            arr[i][i] = 1;
            arr[len - i - 1][i] = 1;
        }

        printArr(arr);
    }

    // #5
    private int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    // #6
    private void minMaxItems() {
        int[] arr = { 1, 666, 5, -999, 0};
        int min = arr[0], max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.print("min = " + min);
        System.out.println(", max = " + max);
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
