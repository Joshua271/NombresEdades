package com.company;

import java.util.Scanner;

public class Main {

        /*En este segundo programa, se pide al usuario que ingrese el
        nombre completo de 6 personas con sus respectivas edades.
        */

    public static void main(String[] args) {

        String[] nombre = new String[6];
        int[] edad = new int[6];
        Scanner x = new Scanner(System.in);

        System.out.println("Ingrese el nombre y la edad de 6 personas distintas: ");

        for (int i=0;i<6;i++) {
            System.out.print("Nombre "+(i+1)+": ");
            nombre[i] = x.nextLine();
            System.out.print("Edad "+(i+1)+": ");
            edad[i] = x.nextInt();
            x.nextLine();
        }

        System.out.println(" ");
        System.out.println("Los datos ingresados fueron: ");

        for (int i=0;i<6;i++) {
            int num = i+1;
            System.out.println(num+". "+nombre[i]+" , "+edad[i]+" anios");
        }
    }
}
