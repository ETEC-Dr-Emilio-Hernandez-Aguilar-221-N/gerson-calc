/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;


import java.util.Scanner;

/**
 *
 * @author casa
 */
public class CalculadoradeJuros {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Qual o valor do empréstimo?: ");
        double valor = entrada.nextDouble();
        
        System.out.printf("Qual a taxa de juros ao mês?: ");
        double juros = entrada.nextDouble();
        
        System.out.printf("Qual o prazo em meses?: ");
        int meses = entrada.nextInt();
        
        // j=(c*(i/100)*n)
        //juros simples(só o valor dos juros em R$)
        
        System.out.printf("O valor dos juros é: " + (valor*(juros/100)*meses));
        
    }
    
}
