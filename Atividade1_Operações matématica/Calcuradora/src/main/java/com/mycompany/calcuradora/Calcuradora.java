/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcuradora;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Calcuradora {

    public static void main(String[] args) {
        
        //variaveis
        double num1 = 25.5; //double: casas depois da virgula
        double num2 = 5.5;
        //variaveis 2
        double lado1 = 6.5;// numeros para o quadrado
        double lado2 = 6.5;
        //variaveis 3
        int base = 10; // "int" para os numeros inteiro do triangulo e retangulo
        int altura = 20;
        
        //variaveis 4
        int db = 30; //dados para a aarea do losango
        int dh = 50;
        int dois = 2; //dado para dividir
        
        //variaveis 5 circuferencia
        double pi = 3.14;
        int raio = 5;
        
        //variaveis 6 média
        int num3 = 6;
        int num4 = 7;
        int num5 = 9;
        int tres = 3;
        
        
        //quadrado
        double area1 = lado1*lado2;
        //retângulo
        int area2 = base*altura;
        //losango
        int area3 = db*dh/dois;
        //triangulo
        int area4 = base*altura/dois;
        //circuferência
        double area5 = raio*raio*pi;
        //média
        double media = (num3 + num4 + num5) /tres;
        
        
        
        //operações 2
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num2 != 0 ? num1 /num2 : Double.NaN; //! = diferente, 
        
        //resultados
        System.out.println("resultado das operacoes");
        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + (num2 != 0 ? divisao: 
                "indefinida (divisão por zero)"));
        System.out.println("Area do quadrado: " + area1);
        System.out.println("Area do retangulo: " + area2);
        System.out.println("Area do losango: " + area3);
        System.out.println("Area do triangulo: " + area4);
        System.out.println("Area da Circuferencia: " + area5);
        System.out.println("Media: " + media);   
    }
    
}
