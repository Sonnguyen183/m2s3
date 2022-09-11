public class Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("tong cua duong cheo thu nhat la: ");
        System.out.println("tong cua duong cheo thu nhat la " + sumDia1(arr));
        System.out.println("tong cua duong cheo thu hai la " + sumDia2(arr));
    }
    public static int sumDia1(int[][] arr){
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1+= arr[i][i];
        }
        return sum1;
    }
    public static int sumDia2(int[][] arr){
        int sum2 =0;
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[arr.length-1-i][i];
        }
        return sum2;
    }

}
