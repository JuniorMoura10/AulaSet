package one.digitalinnovation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();

        //Adiciona as notas no Set
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        System.out.println(notasAlunos);
        System.out.println("\t\n-----------------------\t\n");

        //Remove a nota do Set
        notasAlunos.remove(3.8);

        System.out.println(notasAlunos);
        System.out.println("\t\n-----------------------\t\n");

        //Retorna a quantidade de itens do Set
        System.out.println(notasAlunos.size());
        System.out.println(notasAlunos);
        System.out.println("\t\n-----------------------\t\n");

        //Navega em todos os itens do Set
        System.out.println("Navegando com iterator");
        Iterator<Double> notas = notasAlunos.iterator();
        while (notas.hasNext()){
            System.out.println(notas.next());
        }
        System.out.println("\t\n-----------------------\t\n");


        System.out.println("Navegando com foreach:");
        for (Double notas1 : notasAlunos) {
            System.out.println(notas1);
        }
        System.out.println("\t\n-----------------------\t\n");

        //Esvaziando o HashSet
        notasAlunos.clear();
        System.out.println(notasAlunos);
        System.out.println("\t\n-----------------------\t\n");

        //Verificando se o Set está vazio
        boolean estaVazio = notasAlunos.isEmpty();
        System.out.println(estaVazio);

    }
}
