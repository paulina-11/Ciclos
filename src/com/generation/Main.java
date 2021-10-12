package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //ciclo For sirve para repetir un bloque de codigo n veces
        //sabemos el numero de vueltas que dara el codigo
      /*  for(contador = 0; contador < numero; contador++){
            condigo que se repite
        }
        //El contador puede ir de 0 a cierto numero de cierto numero
        // a 100
        //El contador++ es el que aumenta o decrementa*/

     /*

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        //recupero el valor que escribe el usuario
        int numero = sc.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(numero + "x" + i + "=" + (numero*i));

            break detiene hasta el numero que asignamos
            se detiene en el numero 8
            if(i==8){
            break;
            }

        detiene y pasa a lo siguiente

        Pasa a la siguiente iteración sim terminar de ejecutar el codigo debajo
        Solo imprime los numero impares
            if (i%2 == 0){
            continue;
        }
*//*
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int numero = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int suma = 1;
        System.out.println(num1);
        for (int i = 1; i < numero; i++) {
            System.out.println(suma);
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;

        }
*/
       /* // no sabemos el numero de vueltas que dara el codigo
        while (codicion){
            //codigo
        }*/
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina el numero secreto");
        int numero = sc.nextInt();
        int numeroSecreto = 33;

        while(numero != numeroSecreto){
            System.out.println("Adivina el numero secreto.Ingresa un numero");
            numero = sc.nextInt();
        }
        sc.close();

        System.out.println("Felicidades adivinaste el numero secreto");
*/
        //ciclo do while por lo menos una vez

     /*
        do{

        } while (condiconal){

        }*/

       /* Scanner sc = new Scanner(System.in);
        int numero = 0;
        int numeroSecreto = 33;

        do{
            System.out.println("Adivina el numero secreto");
            numero= sc.nextInt();
        } while (numero != numeroSecreto);
        sc.close();
        System.out.println("Felicidades adivinaste el numero secreto");
*/
/*

        int factorial = 1;
        int num;
        Scanner numero = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = numero.nextInt();
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();
        int factorial = 1;
        int i = 1;
        if (numero != 0){
            while (i <= numero){
                factorial = factorial *i;
                i++;
            }

        }
            System.out.println("El numero factorial es:" + factorial);






    }
}
