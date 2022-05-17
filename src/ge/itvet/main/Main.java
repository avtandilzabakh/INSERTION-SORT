package ge.itvet.main;

import java.util.Arrays;

public class Main {
    public static void sort(int... a) {
        for (int j = 1; j < a.length; j++) {
            int key = a[j];
            int i = j - 1;
            while (i >= 0 && a[i] > key) {
                a[i + 1] = a[i];
                i = i - 1;

            }
            a[i + 1] = key;
        }
        System.out.println(Arrays.toString(a));

    }

    public static void main(String[] args) {
        sort(5, 2, 4, 6, 1, 3);

    }
}
