package Main;

import exercicios.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Estagio_Ribeirao_Preto_2024_Class_Main {
    public static void main(String[] args) {
        // código dos exercicios está no pacote exercicios dentro da classe respectiva ao exercício


        Exercicio1 exercicio1 = new Exercicio1();
        System.out.println("---- EXERCÍCIO 1 ----");
        System.out.println("      soma: " + exercicio1.imprimirSoma());
        // valor da soma = 91
        System.out.println("----------------------");
        System.out.println();


        Exercicio2 exercicio2 = new Exercicio2();
        System.out.println("---- EXERCÍCIO 2 ----");
        if (exercicio2.isFibonacci() == true){
            System.out.println("O número informado pertence à sequência");
        }else{
            System.out.println("O número informado não pertence à sequência");
        }
        System.out.println("----------------------");
        System.out.println();


        Exercicio3 exercicio3 = new Exercicio3();
        System.out.println("---- EXERCÍCIO 3 ----");
        System.out.println("Leta a:");
        System.out.println(exercicio3.ElementoA());

        System.out.println("Leta b:");
        System.out.println(exercicio3.ElementoB());

        System.out.println("Leta c:");
        System.out.println(exercicio3.ElementoC());

        System.out.println("Leta d:");
        System.out.println(exercicio3.ElementoD());

        System.out.println("Leta e:");
        System.out.println(exercicio3.ElementoE());

        System.out.println("Leta f:");
        System.out.println("A resposta para essa questão é 200, pois todos os números começam comm a inicial D");
        System.out.println();

        System.out.println("----------------------");
        System.out.println("---- EXERCÍCIO 4 ----");
        Exercício4 exercício4 = new Exercício4();
        System.out.println("Resolução: " + exercício4.interruptores());

        System.out.println("----------------------");
        System.out.println("---- EXERCÍCIO 5 ----");
        Exercicio5 exercicio5 = new Exercicio5();
        System.out.println("Palavra invertida: " + exercicio5.InversorDeString());
        System.out.println("----------------------");




    }
}
