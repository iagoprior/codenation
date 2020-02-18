package br.com;

import br.com.estruturas.EstruturaRepeticao;
import br.com.tarefas.ArrayTarefas;
import br.com.tarefas.ListaTarefas;
import br.com.tarefas.Tarefa;
import br.com.variaveis.Primitivos;

public class Principal {

    public static void main(String[] args){

        //String nome="Codenation";
        //System.out.println("Hello " + nome);
        //String texto = "Meu texto";

        // Primitivos
        //Primitivos primitivos = new Primitivos();
        //System.out.println(primitivos.longo);

        //System.out.println("A tarefa tem " + tarefa1.obterTamanhoTarefa() + " caracteres" );


        // Listas e Arrays //

        //System.out.println("Minhas Tarefas");
        //System.out.println("--------------");
        ListaTarefas tarefas = new ListaTarefas();
        //Tarefa tarefa1 = new Tarefa( "Regar as plantas logo depois do jantar");
        //Tarefa tarefa2 = new Tarefa( "Estudar");
        //Tarefa tarefa3 = new Tarefa( "Trabalhar");
        //tarefas.adicionar(tarefa1);
        //tarefas.adicionar(tarefa2);
        //tarefas.adicionar(tarefa3);
        //tarefas.exibirTarefas();

       // tarefas.remover(tarefa1);
       // tarefas.remover(tarefa2);


       // System.out.println("Minhas Tarefas após remover");
       // System.out.println("--------------");
       // tarefas.exibirTarefas();


        System.out.println("Minhas Tarefas");
        System.out.println("--------------");
        tarefas.adicionar("Regar as Plantas logo depois da hora do jantar");
        tarefas.adicionar("Estudar");
        tarefas.adicionar("Trabalhar");
        tarefas.exibirTarefas();

        //Tarefa tarefa = tarefas.buscar("Estudar");
        //tarefa.exibirTarefa();
       //Estrusturas de Repetição

       // EstruturaRepeticao r = new EstruturaRepeticao();
       // r.imprimirNumeros(10);
        // EstruturaRepeticao r = new EstruturaRepeticao();
        //r.imprimirNumerosEnquanto(2);
        //EstruturaRepeticao r = new EstruturaRepeticao();
        //r.imprimirNumeroDoWhile(10);
    }
}
