/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividades;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Atividades {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
       
        System.out.println("Operações matemáticas");
        
       //Variaveis basicas
       int Faren1 = 32; //Número para mltiplicar os celsius
       int Numt1= 9;
       int Numt2= 5;

       //atividade 1, Operações matemáticas
         //operações
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        //soma, subtração, multiplicação, divisão
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;
        
        //resultados
        System.out.println("resultado das operações");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
       
       //Atividade 2, conversão de temperatura
      System.out.println("Conversão de temperatura");
      
      //Celsius para fahrenheit
       System.out.print("Digite o valor em Grau Celsius: ");
        double Grau =scanner.nextDouble();
        //Conta
        double Conversao= (Grau*Numt1/Numt2)+Faren1;
        
        //Resultado
        System.out.println("Valor em Fahrenheit: " + Conversao);
        
        //Fahreiht para kelvin
       System.out.print("Digite o valor em farenheit: ");
        double Fah =scanner.nextDouble();
        //Conta
        double Conversao2= (Fah - Faren1)*Numt2/Numt1 + 273.15;
        
        //Resultado
        System.out.println("Valor em Kelvin: " + Conversao2);
        
        //atividade 3, primo ou não
        System.out.println("Verificação de número primo");
        
        //Entrada de dados
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        boolean primo = true;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo && numero > 1) {
            System.out.println(" é um número primo." + numero);
        } else {
            System.out.println(" não é um número primo." + numero);
        }
        scanner.close();
    }
}
