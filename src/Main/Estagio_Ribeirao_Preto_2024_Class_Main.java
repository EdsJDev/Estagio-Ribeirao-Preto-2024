package Main;

import exercicios.*;

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
            System.out.println("O número informado pertence a sequência");
        }else{
            System.out.println("O número informado não pertence a sequência");
        }
        // resposta do exercicio 2 está na classe Exercicio2

        System.out.println("----------------------");
        System.out.println();


        Exercicio3 exercicio3 = new Exercicio3();
        System.out.println("---- EXERCÍCIO 3 ----");
        System.out.println("Leta a:");
        System.out.println(exercicio3.ElementoA());
        // resposta letra A: [1, 3, 5, 7, 9]

        System.out.println("Leta b:");
        System.out.println(exercicio3.ElementoB());
        // resposta letra B: [2, 4, 8, 16, 32, 64, 128]

        System.out.println("Leta c:");
        System.out.println(exercicio3.ElementoC());
        // resposta letra C: [1, 4, 9, 16, 25, 36, 49]

        System.out.println("Leta d:");
        System.out.println(exercicio3.ElementoD());
        // resposta letra D: [4, 16, 36, 64, 100]

        System.out.println("Leta e:");
        System.out.println(exercicio3.ElementoE());
        //resposta letra E: [0, 1, 1, 2, 3, 5, 8, 13]

        System.out.println("Leta f:");
        System.out.println("A resposta para essa questão é 200, pois todos os números começam comm a inicial D");
        // resposta letra F: A resposta para essa questão é 200, pois todos os números começam comm a inicial D


        System.out.println("----------------------");
        System.out.println();
        System.out.println("---- EXERCÍCIO 4 ----");
        Exercício4 exercício4 = new Exercício4();
        System.out.println("Resolução: " + exercício4.interruptores());
        /* resposta exercicio 4: Resolução: Na segunda sala, ligamos o interruptor 1 por 15 minutos, desligamos,
         e em seguida ligamos o interruptor 2 e vamos até a primeira sala. A lâmpada que estiver acesa corresponde
         ao interruptor 2, a que estiver quente ao interruptor 1, e a lâmpada que resta só pode ser do interruptor 3
        */

        System.out.println("----------------------");
        System.out.println();
        System.out.println("---- EXERCÍCIO 5 ----");
        Exercicio5 exercicio5 = new Exercicio5();
        System.out.println("Palavra invertida: " + exercicio5.InversorDeString());
        // resposta letra 5: está na classe Exercicio5
        System.out.println("----------------------");




    }
}
