package exercicios;

public class Exercicio1 {
     int indice = 13;
     int soma = 0;
     int k = 0;

    public Exercicio1() {
    }

    public int imprimirSoma(){
        while (k < indice){
            k = k + 1;
            soma = soma + k;
        }
        return soma;
    }
}
