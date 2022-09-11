import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap so luong: ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        }while (size>30);

        arr = new int[size];
        int i = 0;
        while (i<arr.length) {
            System.out.print("Enter a mark for student "+(i+1)+": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]+"\t");
            if (arr[j]>=5 &&arr[j]<=10)
                count++;
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
