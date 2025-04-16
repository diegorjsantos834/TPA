/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.calcuradoradeareas;

/**
 *
 * @author FATEC ZONA LESTE
 */
// calcuradora java

public class Calcuradora {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // função, static void é é uma combinação de palavras reservadas que definem a visibilidade e o comportamento de um método, não retorna valor. 
                                             //main: principal tela onde fica os codigos
                                             // String [para chamar algo]
        // TODO code application logic here
        //declarar as variaveis
        double num1 = 25.5; //double: casas depois da virgula
        double num2 = 5.5;
        
        //operações
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num2 != 0 ? num1 /num2 : Double.NaN; //! = diferente, 
        double resto = num1 % num2;
        
        //resultados
        System.out.println("resultado das operações");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + (num2 != 0 ? divisao: 
                "indefinida (divisão por zero)"));
        System.out.println("resto da divisao: " + resto);
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
