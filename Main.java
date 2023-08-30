import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrString = scanner.nextLine().split(",");
        int[] arr = new int[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
            arr[i] = Integer.parseInt(arrString[i]);
        }
        int index = Integer.parseInt(scanner.nextLine());
        scanner.close();
        boolean result = multipliedBy10(arr, index);
        System.out.println(result);
    }

    private static boolean multipliedBy10(int[] arr, int index) {
        if (index >= arr.length - 1) {
            return false;
        }
        if (arr[index + 1] == arr[index] * 10) {
            return true;
        }
        return multipliedBy10(arr, index + 1);
    }
}