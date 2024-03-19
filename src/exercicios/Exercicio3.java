package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {
    int elementoA = 1 ;
    int elementoB = 2;
    int elementoC;

    public Exercicio3() {
    }

    /*
    3) Descubra a lógica e complete o próximo elemento:
        a) 1, 3, 5, 7, ___

        b) 2, 4, 8, 16, 32, 64, ____

        c) 0, 1, 4, 9, 16, 25, 36, ____

        d) 4, 16, 36, 64, ____

        e) 1, 1, 2, 3, 5, 8, ____

        f) 2,10, 12, 16, 17, 18, 19, ____
     */

    public List<Integer> ElementoA(){
        List<Integer> elemento = new ArrayList<>();
        while (elementoA <= 9 ){
            elemento.add(elementoA);
            elementoA = elementoA + 2;
        }
        return elemento;
    }

    public List<Integer> ElementoB(){
        List<Integer> elemento   = new ArrayList<>();
        while (elementoB <= 128){
            elemento.add(elementoB);
            elementoB = elementoB * 2;
        }
        return elemento;
    }

    public List<Integer> ElementoC(){
        List<Integer> elemento = new ArrayList<>();
        elementoC = 0;
        int quadrado = 0;
        while (quadrado < 49 ){
            for (int i = 0; i < 6; i++) {
                elementoC = elementoC + 1;
                quadrado = elementoC * elementoC;
                elemento.add(quadrado);
                elemento.removeIf(x -> x > 49);
            }
        }
        return elemento;
    }

    public List<Integer> ElementoD(){
        List<Integer> elemento = new ArrayList<>();
        elementoC = 0;
        int quadrado = 2;
        while (quadrado < 100 ){
            for (int i = 0; i < 6; i++) {
                elementoC = elementoC + 2;
                quadrado = elementoC * elementoC;
                elemento.add(quadrado);
                elemento.removeIf(x -> x > 100);
            }
        }
        return elemento;
    }

    public List<Integer> ElementoE(){
        List<Integer> elemento = new ArrayList<>();
        int aux = 0;
        int aux1 = 1;
        elemento.add(aux);
        for (int i = 0; i < 7; i++) {
            elemento.add(aux1);
            int next = aux + aux1;
            aux = aux1;
            aux1 = next;
        }
        return elemento;
    }




}
