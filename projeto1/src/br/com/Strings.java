package br.com;

public class Strings {
    public static void main(String[] args) {
        String ola = "Alo mundo Java";
        String nome = "Estamos vivos";

        System.out.println(ola + "\n" + nome);

        int i;
        for (i = 48; i <= 57; i++) {
            System.out.printf("%c", i);
        }
        System.out.printf("\n");

        for (i = 65; i <= 90; i++) {
            System.out.printf("%c", i);
        }
        System.out.printf("\n");

        for (i = 97; i <= 122; i++) {
            System.out.printf("%c", i);
        }
        System.out.printf("\n");

        char c;
        int n;

        for (c = '0'; c <= '9'; c++) {
            n = c - 48;
            System.out.printf("%d = %d\n", n, (n + 3));
        }

        for (c = 'a'; c <= 'z'; c++) {
            n = c - 48;
            System.out.printf("%d = %d\n", n, (n + 3));
        }

        String textomin = "";
        String texto = "prendera Java gera felicidade";
        textomin = texto.toLowerCase();
        System.out.println(textomin);
        char caractere;
        String carac = "";

        for (i = 0; i < textomin.length(); i++) {
            caractere = textomin.charAt(i);
            if (caractere >= '0' && caractere <= '9') {
                carac = carac + caractere;
            } else if (caractere == ' '){
                carac = carac + caractere;


            } else {
                caractere = (char) (caractere + 3);
                carac = carac + caractere;

            }

        }
        System.out.println("Resultado:" + carac);
    }
}


