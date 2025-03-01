package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval;

import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models.BankAccount;
import br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models.Client;

public class TestBankAccount {
    public static void main(String[] args) {
        var client = new Client("Sergio", "123.456.789-00");
        var account = new BankAccount(client, 1000.0);

        account.deposit(500);
        System.out.printf("Saldo apos deposito: %.2f\n", account.getBalance());

        boolean result = account.withdraw(2000.0);
        System.out.println("Saque de 2000 realizado? " + result);
        System.out.printf("Saldo apos tentativa de saque: %.2f\n", account.getBalance());

        boolean result2 = account.withdraw(1000.0);
        System.out.println("Saque de 1000 realizado? " + result2);
        System.out.printf("Saldo final : "+ account.getBalance());
    }
}