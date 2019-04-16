package br.com.digitalhouse;

import java.util.Set;

public class Prova {
    //Instanciando
    private Integer total = 0;

    //Methods
    public void somaTotal(Set<Integer> conjuntoDeInteiros){
        for (Integer inteiro : conjuntoDeInteiros) {
            this.total += inteiro;
        }
        System.out.println(this.total);
    }
}
