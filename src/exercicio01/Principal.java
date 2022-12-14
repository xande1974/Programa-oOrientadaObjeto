package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double saldo=0;
        int anos = 0;

        Locale us = Locale.US;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        String nome = sc.next();
        System.out.println("digite sua idade :");
        int idade = sc.nextInt();
        System.out.println("digite seu alvo: ");
        double alvo = sc.nextDouble();
        System.out.println("qual o valor da contribuicao: ");
        double contr = sc.nextDouble();

        while(saldo < alvo){
           saldo =(saldo + contr)*(1+10.0/100.0);
            System.out.println(saldo);

            anos++;

        }
        System.out.println("o contribuinte " + nome);
        System.out.println(" com uma idade de: " + idade);
        System.out.println(" precisara de: " + anos + " anos de contribuicao");






    }

}