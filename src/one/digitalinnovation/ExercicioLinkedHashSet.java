package one.digitalinnovation;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExercicioLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

        //Adicionando os números
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        //Navegando pela set
        System.out.println("Navegando com o iterator");

        Iterator<Integer> iteratorNumeros = numeros.iterator();
        while (iteratorNumeros.hasNext()){
            System.out.println(iteratorNumeros.next());
        }

        System.out.println("\t--------------------\t");

        System.out.println("Navegando com o foreach");
        for (Integer numeros1 : numeros) {
            System.out.println(numeros1);
        }
        System.out.println("\t--------------------\t");

        //Removendo o primeiro item do set
        numeros.remove(3);
        System.out.println(numeros);
        System.out.println("\t--------------------\t");

        //Adicionando o número 23 ao set
        numeros.add(23);
        System.out.println(numeros);
        System.out.println("\t--------------------\t");

        //Verificando o tamanho do set
        System.out.println(numeros.size());
        System.out.println(numeros);
        System.out.println("\t--------------------\t");

        //Verificando se o set está vazio
        System.out.println("Está vazio: " + numeros.isEmpty());
    }
}
