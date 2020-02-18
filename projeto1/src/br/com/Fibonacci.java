package br.com;




import br.com.tarefas.ListaFibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 14; i++) {
            System.out.print("(" + i + "):" + ListaFibonacci.fibo(i) + "\t");
        }

    }
}



