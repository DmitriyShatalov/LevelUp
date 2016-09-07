package com.company.homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        System.out.println("N = " + N);
        run_back(N);
    }
    static private int next_back(int[]arr, int l){
        int i = l;
        do i--;
        while (i > 0 && arr[i] <= 1);
        arr[i]--;

        int sum = 0; int c = 0;
        while (arr[c] > 0)
            sum = sum + arr[c++];

        int value = arr[i];
        do i++;
        while (arr[i] >= value);
        if (arr[i] == 0)
            c++;
        arr[i]++;

        return c;
    }

    static private void run_back(int n){
        int [] arr = new int [n];
        int l = 1;
        arr[0] = n;

        printSplit(arr, n, n);

        do
        {
            l = next_back(arr, l);
            printSplit(arr, l, n);
        }
        while (l < n);
    }

    static private void printSplit(int [] arr, int l, int n){
        boolean sw = false;

        System.out.print(n + " = ");

        for (int i = 0; i < l; i++){

            if(arr[i] == 0) break;

            if(sw)
            {
                System.out.print(" + ");
            }
            sw = true;
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }
}
