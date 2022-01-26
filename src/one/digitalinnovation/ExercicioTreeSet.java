package one.digitalinnovation;

import java.util.Iterator;
import java.util.TreeSet;

public class ExercicioTreeSet {

    public static void main(String[] args) {

        TreeSet<Integer> numeros = new TreeSet<>();

        //Adicionando itens à árvore
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        //Navegando e exibindo os itens da árvore
        System.out.println("Navegando com foreach");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        System.out.println("\t---------------------\t");

        System.out.println("Navegando com iterator");
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("\t---------------------\t");

        //Removendo o primeiro item da árvore
        System.out.println(numeros.pollFirst());
        System.out.println(numeros);
        System.out.println("\t---------------------\t");

        //Adicionando o número 23 ao set
        numeros.add(23);
        System.out.println(numeros);
        System.out.println("\t---------------------\t");

        //Verificando o tamanho do set
        System.out.println(numeros.size());
        System.out.println(numeros);
        System.out.println("\t---------------------\t");

        //Verificando se o set está vazio
        System.out.println("Está vazio? " + numeros.isEmpty() + numeros);
    }
}
