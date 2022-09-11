import java.util.Scanner;

public class MinInArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap do dai cua mang: ");
        int size;
        size = scanner.nextInt();
        int arr[] = new int[size];
        int newArr[] = AddElement(arr, size);

        System.out.printf("%-20s%s", "Các phần tử có trong mảng: ", "");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
        System.out.print(" phan tu nho nhat trong mang vua nhap la " + FindMinArray(newArr));

    }


    public static int[] AddElement(int[]arr, int size){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap phan tu thu " + (i+1) +" la: ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int FindMinArray (int[] newArr) {
        int min;
        min = newArr[0];
        for (int i = 0; i < newArr.length; i++) {
            if (min < newArr[0]) {
                min = newArr[0];
            }
        }
        return min;
    }
}
