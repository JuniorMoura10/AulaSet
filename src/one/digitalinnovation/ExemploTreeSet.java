package one.digitalinnovation;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {

        TreeSet<String> arvoreCapitais = new TreeSet<>();

        //Adicionando as Capitais
        arvoreCapitais.add("Porto Alegra");
        arvoreCapitais.add("Florianópolis");
        arvoreCapitais.add("Curitiba");
        arvoreCapitais.add("São Paulo");
        arvoreCapitais.add("Fortaleza");
        arvoreCapitais.add("Recife");

        System.out.println(arvoreCapitais);
        System.out.println("\t\n---------------------\t\n");

        //Retorna a primeira capital no topo da árvore
        System.out.println(arvoreCapitais.first());

        //Retorna a última capital no final da árvore
        System.out.println(arvoreCapitais.last());
        System.out.println("\t\n---------------------\t\n");

        //Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(arvoreCapitais.lower("Florianópolis"));
        System.out.println(arvoreCapitais);
        System.out.println("\t\n---------------------\t\n");

        //Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(arvoreCapitais.higher("Florianópolis"));
        System.out.println(arvoreCapitais);
        System.out.println("\t\n---------------------\t\n");

        //Retorna a primeira capital no topo da árvore, removendo do set
        System.out.println(arvoreCapitais.pollFirst());
        System.out.println(arvoreCapitais);
        System.out.println("\t\n---------------------\t\n");

        //Retorna a última capital no fim da árvore, removendo do set
        System.out.println(arvoreCapitais.pollLast());
        System.out.println(arvoreCapitais);
        System.out.println("\t\n---------------------\t\n");

        //Navega por todos os itens da árvore
        System.out.println("Navegando com iterator");
        Iterator<String> arvore = arvoreCapitais.iterator();
        while (arvore.hasNext()){
            System.out.println(arvore.next());
        }
        System.out.println("\t\n---------------------\t\n");

        System.out.println("Navegando com  foreach");
        for (String arvore1 : arvoreCapitais) {
            System.out.println(arvore1);
        }



    }
}
