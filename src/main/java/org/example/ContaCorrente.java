package org.example;

public class ContaCorrente {

        private String cpf;
        private String nome;
        private double saldo;

        public ContaCorrente(String cpf, String nome, double saldo) {
            this.cpf = cpf;
            this.nome = nome;
            this.saldo = saldo;
        }
        public void sacar(double valor) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque realizado com sucesso! Saldo atual: " + saldo);
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        }

        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito realizado com sucesso! Saldo atual: " + saldo);
            } else {
                System.out.println("Valor de depósito inválido.");
            }
        }

        public void transferir(ContaCorrente contaDestino, double valor) {
            if (valor <= saldo) {
                saldo -= valor;
                contaDestino.depositar(valor);
                System.out.println("Transferência realizada com sucesso! Saldo atual: " + saldo);
            } else {
                System.out.println("Saldo insuficiente para transferência.");
            }
        }

        public double verSaldo() {
            return saldo;
        }
}
