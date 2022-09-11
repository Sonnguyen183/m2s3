import java.util.Scanner;

public class Eraser {
    public static void main(String[] args) {
        System.out.println("Nhap vao so nguyen gom N phan tu:");

        Scanner input = new Scanner (System.in);

        System.out.println("Nhap vao so phan tu cua mang:");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i=0; i < array.length ; i++) {
            System.out.printf("Nhap vao gia tri cua phan tu thu %d: ", (i+1));
            array[i] = input.nextInt();
        }

        System.out.println();

        System.out.printf("%-20s%s", "Cac gia tri cua mang: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }


        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao phan tu can xoa:");
        int x = sc.nextInt();
        int[] newArray = arrayEraser(array, x);



        System.out.printf("%-20s%s", "Cac gia tri cua mang: ", "");
        for (int j = 0; j < newArray.length; j++) {
            System.out.print(newArray[j] + "\t");
        }
    }

    public static int[] arrayEraser(int[] array, int x) {
        int indexX =0;
        for (int i=0; i<array.length; i++) {
            if (array[i] == x) indexX = i;
        }
        int[] newArray = new int[array.length-1];
        for(int i=0; i<newArray.length; i++){
            if (i < indexX) newArray[i] = array[i];
            else if (i >= indexX) newArray[i] = array [i+1];
        }
        return newArray;
    }
}
