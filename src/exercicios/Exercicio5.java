package exercicios;

import java.util.Scanner;

public class Exercicio5 {

    String palavra = "";

    public Exercicio5() {
    }

    public String InversorDeString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma string: ");
        String s = sc.nextLine();
        String[] vetor = new String[s.length()];
        int valor = s.length();
        String letra;
        String inverso = "";
        for (int i = 0; i < s.length(); i++) {
            letra = String.valueOf(s.charAt(i));
            valor = valor - 1;
            vetor[valor] = letra;
        }
        for (int i = 0; i < vetor.length; i++) {
            inverso = inverso + vetor[i];
        }
        return inverso;
    }
}
