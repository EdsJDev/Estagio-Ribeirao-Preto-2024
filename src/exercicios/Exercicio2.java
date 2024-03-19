package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    List<Integer> elemento = new ArrayList<>();

    public Exercicio2() {
    }

    public boolean isFibonacci(){
        EstruturaFibonacci();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para verificar na Estrutura Fibonacci ");
        int numero = sc.nextInt();
        if (elemento.contains(numero)){
            return true;
        }else{
            return false;
        }
    }

    public List<Integer> EstruturaFibonacci(){
        int aux = 0;
        int aux1 = 1;
        elemento.add(aux);
        for (int i = 0; i < 100; i++) {
            elemento.add(aux1);
            int next = aux + aux1;
            aux = aux1;
            aux1 = next;
        }
        return elemento;
    }
}
