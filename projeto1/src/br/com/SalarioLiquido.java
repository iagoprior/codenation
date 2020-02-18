package br.com;

public class SalarioLiquido {

    public static void main(String[] args) {
        double salarioBase = 1800.00;
        double descontoINSS = salarioBase - calcularInss(salarioBase);
        double descontoIRFF = descontoINSS - calcularIRRf(descontoINSS);
        return Math.round(descontoIRFF);
    }


            public double calcularInss(double salarioBase) {
                double desconto;
                double salarioDescontadoINSS;

                if (salarioBase <= 1500.00) {
                    desconto = 8.0;
                    salarioDescontadoINSS = desconto * (salarioBase / 100);
                } else if (salarioBase <= 4000.00) {
                    desconto = 9.0;
                    salarioDescontadoINSS = desconto * (salarioBase / 100);
                } else {
                    desconto = 11.0;
                    salarioDescontadoINSS = desconto * (salarioBase / 100);
                }

                return salarioDescontadoINSS;
            }

            private double calcularIRRf(double salarioBase) {
                double desconto;
                double salarioDescontadoIRFF;
                if (salarioBase <= 3000.00) {
                    desconto = 0.0;
                    salarioDescontadoIRFF = desconto * (salarioBase / 100);
                } else if (salarioBase <= 6000.00) {
                    desconto = 7.5;
                    salarioDescontadoIRFF = desconto * (salarioBase / 100);
                } else {
                    desconto = 15.0;
                    salarioDescontadoIRFF = desconto * (salarioBase / 100);
                }
                return salarioDescontadoIRFF;
            }
    }
}

