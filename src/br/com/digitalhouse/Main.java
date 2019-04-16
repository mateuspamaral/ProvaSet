package br.com.digitalhouse;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Instanciando
        Set<Integer> listaDeNumeros = new HashSet<>();

        //Ficar de olho no Set, ele não vai contabilizar chaves iguais... Veja o caso da chave 10
        listaDeNumeros.add(43);
        listaDeNumeros.add(10);
        listaDeNumeros.add(5);
        listaDeNumeros.add(3);
        listaDeNumeros.add(6);
        listaDeNumeros.add(10);
        listaDeNumeros.add(9);

        for (Integer numero : listaDeNumeros) {
            System.out.println(numero);
        }

        Prova prova = new Prova();

        System.out.println("Soma dos números: ");
        prova.somaTotal(listaDeNumeros);

    }
}
