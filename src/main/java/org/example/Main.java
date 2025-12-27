package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       ContaCorrente contaMateus = new ContaCorrente("12345678901", "Mateus", 1000.0);
       ContaCorrente contaFlor = new ContaCorrente("10987654321", "Flor", 500.0);

        contaMateus.sacar(200.0);
        contaMateus.depositar(300.0);

        contaMateus.transferir(contaFlor, 150.0);
        System.out.println("Saldo Mateus: " + contaMateus.verSaldo());
        System.out.println("Saldo Flor: " + contaFlor.verSaldo());

    }

}