
package calc1;

import java.util.Scanner;

public class Calc1 {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        double peso, alt, res;
        System.out.println("Informe seu peso: ");
        peso = grava.nextDouble();
        System.out.println("Informe sua altura: ");
        alt = grava.nextDouble();
        res = (peso / (alt * alt));
        System.out.format("Seu IMC é: " + "%.2f",res);
        if(res <= 18.5){
            System.out.println("\n Abaixo do peso.");
                    
        }else if(res <=24.9) 
            {System.out.println("\n Peso normal");
            }
        else if(res <=29.9){
            System.out.println("\n Sobrepeso.");
                    
        }else if(res <=34.9)
            {System.out.println("Obesidade leve");
            }
        else if(res <= 39.9){
            System.out.println("Obesidade Moderada.");        
            }
        else {System.out.println("Obesidade Morbida");
            }
        
    } 
}
