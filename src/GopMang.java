public class GopMang {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10};
        int[] c = new int[a.length+b.length];

        int[] newArray = CoppyArray(c, a, b);
        for (int e:
                newArray) {
            System.out.println(e);
        }

    }

    public static int [] CoppyArray(int[]c, int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = a.length; i < c.length; i++) {
            c[i] = b[i-a.length];
        }
        return c;
    }
}
