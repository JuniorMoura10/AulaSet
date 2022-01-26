package one.digitalinnovation;

import java.util.HashSet;
import java.util.Iterator;

public class ExercicioHashSet {

    public static void main(String[] args) {

        HashSet<Integer> numeros = new HashSet<>();

        //Adicionando os itens ao set
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        System.out.println(numeros);

        //Navefando no set
        System.out.println("Navegando com o iterator");
        Iterator<Integer> iteratorNumeros = numeros.iterator();
        while (iteratorNumeros.hasNext()){
            System.out.println(iteratorNumeros.next());
        }
        System.out.println("\t\n----------------\t\n");

        System.out.println("Navegando com o foreach");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        System.out.println("\t\n----------------\t\n");

        //Removendo o primeiro item do set
        numeros.remove(3);
        System.out.println(numeros);
        System.out.println("\t\n----------------\t\n");

        //Adicione um novo número no set: 23
        numeros.add(23);
        System.out.println(numeros);
        System.out.println("\t\n----------------\t\n");

        //Verifique o tamanho do set
        System.out.println(numeros.size());
        System.out.println(numeros);
        System.out.println("\t\n----------------\t\n");

        //Verifique se o set está vazio
        System.out.println("Está vazio: " + numeros.isEmpty());
    }
}
