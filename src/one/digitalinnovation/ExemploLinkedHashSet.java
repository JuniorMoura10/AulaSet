package one.digitalinnovation;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        //Adicionando os números no Set
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica);
        System.out.println("\t\n----------------------\t\n");

        //Remove o número do Set
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);
        System.out.println("\t\n----------------------\t\n");

        //Retorna a quantidade de itens do Set
        System.out.println(sequenciaNumerica.size());
        System.out.println(sequenciaNumerica);
        System.out.println("\t\n----------------------\t\n");

        //Navega em todos os itens do Set
        System.out.println("Navegando com o iterator");

        Iterator<Integer> numeros = sequenciaNumerica.iterator();
        while (numeros.hasNext()){
            System.out.println(numeros.next());
        }
        System.out.println("\t\n----------------------\t\n");

        System.out.println("Navegando com o foreach");

        for (Integer numeros1 : sequenciaNumerica) {
            System.out.println(numeros1);
        }
        System.out.println("\t\n----------------------\t\n");

        //Retorna se o Set está vazio ou não
        System.out.println("O Set está vazio? " + sequenciaNumerica.isEmpty());
    }
}
