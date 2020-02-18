package br.com.tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaFibonacci {
    public static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
