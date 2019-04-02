package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n;

        System.out.print("Masukan Jumlah Deret : ");
        n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            int x = cari(i);
            System.out.print(x + " ");
            jumlah = jumlah+x;
        }
        System.out.println("\n Jumlah Deret : "+jumlah);
    }

    public static int cari(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return cari(n - 1) + cari(n - 2);
        }
    }
}
