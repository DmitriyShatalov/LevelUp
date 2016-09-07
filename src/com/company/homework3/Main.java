package com.company.homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        System.out.println("N = " + N);
        makeBrack(N, "", 0, 0);
        System.out.print("test1");
    }

    static private void makeBrack(int N, String str, int OpenBracket, int CloseBracket) {

        if (check(N, OpenBracket, CloseBracket)) {
            System.out.println(str);
        }

        if (OpenBracket < N) {
            makeBrack(N, str + "(", OpenBracket + 1, CloseBracket);
        }

        if (CloseBracket < OpenBracket) {
            makeBrack(N, str + ")", OpenBracket, CloseBracket + 1);
        }
    }

    static private boolean check(int N, int OpenBracket, int CloseBracket) {return OpenBracket + CloseBracket == 2*N;}
}
