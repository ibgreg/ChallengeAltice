package br.com.ibgregorio;

import java.util.Scanner;

public class Palindromo {
    public static void main (String[] args) {
        String o = "";
        String r = "";
        Scanner in = new Scanner(System.in);

        System.out.print("Palavra a verificar > ");
        o = in.nextLine();

        for (int i = 0; i < o.length(); i++) {
            r=o.charAt(i)+r;
        }

        if(o.equals(r))
            System.out.println("A palavra "+o+" é um palíndromo!");
        else
            System.out.println("A palavra "+o+" não é um palíndromo!");

    }
}

