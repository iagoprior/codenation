package br.com.estruturas;

public class EstruturaCondicional {
    //if,else
    public void imprimirNome(String nome) {
        if (nome != null) {
            System.out.println("O nome é " + nome);
        } else {
            System.out.println("O nome é obrigatório");
        }
    }


    //if, else,if
    public void definirGrupoPorIdade(int idade) {
        if (idade < 12) {
            System.out.println("Grupo Infantil");
        } else if (idade < 18) {
            System.out.println("Grupo Juvenil");
        } else {
            System.out.println("Grupo Adulto");
        }
    }


    //switch
    public void SelecionarFruta(String fruta) {
        switch (fruta){
            case "Maçã":
                SelecionarFruta(fruta);
                break;
            case "Laranja":
                SelecionarFruta(fruta);
                break;
             default:
                System.out.println("Fruta não disponível");


        }
    }
}

