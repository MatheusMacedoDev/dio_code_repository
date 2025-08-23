package org.matheus;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente venilton = new Cliente("Venilton");
        Cliente venilton1 = new Cliente("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        Conta cc1 = new ContaCorrente(venilton1);

        banco.getContas().add(cc);
        banco.getContas().add(cc1);
        banco.getContas().add(poupanca);

        banco.getContas().add(poupanca);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        System.out.println("\nLista de clientes:");
        banco.getAllClients().forEach(cliente -> System.out.println(cliente.getNome()));
    }

}