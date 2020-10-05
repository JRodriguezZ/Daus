package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas veces quieres tirar los dados?");
        int tiradas = scanner.nextInt();
        int[] n = new int[13];

        for (int i = 0; i < tiradas; i++) {
            int dau1 = (int)((Math.random() * 6) + 1);
            int dau2 = (int)((Math.random() * 6) + 1);
            n[dau1+dau2]++;

        }
        System.out.print("Lanzando dados");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println(".");
        Thread.sleep(2000);

        for (int j = 2; j < n.length; j++) {
            System.out.println("La combinacion " + j + " ha salido " + n[j] + " veces");
        }
    }
}
