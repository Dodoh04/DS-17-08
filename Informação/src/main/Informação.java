
package main;

import java.util.Scanner;


public class Informação {


    public static void main(String[] args) {
       Scanner grava = new Scanner(System.in);
       
       System.out.println("Digite seu nome: ");
       String nome = grava.next();
       
       System.out.println("Informe sua idade: ");
       double idade = grava.nextDouble();
       
       idade += idade * 365;
       double hr = idade * 24; 
       
       System.out.println("Você viveu " + idade + "dias");
       System.out.println("E " + hr + " horas.");
              
    }
    
}
