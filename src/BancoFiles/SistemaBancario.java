package BancoFiles;

import java.util.Scanner;

public class SistemaBancario {

    static Scanner teclado = new Scanner(System.in);
    static double saldo = 1500;

    static void main() {
        String clientenome;
        int option;

        System.out.println("Como podemos te chamar?");
        clientenome = teclado.nextLine();
        System.out.println("Ola " + clientenome + "!");

        do {
            System.out.println("O que você deseja acessar?");
            System.out.println("""
                1 - Consultar saldo
                2 - Depositar
                3 - Sacar
                4 - Transferir
                5 - Sair
                """);

            option = teclado.nextInt();
            switch (option) {
                case 1: {
                    consultarSaldo();
                    break;
                }
                case 2: {
                    depositar();
                    break;
                }
                case 3: {
                    System.out.println("Você escolheu Sacar.");
                    break;
                }
                case 4: {
                    System.out.println("Você escolheu transferir.");
                    break;
                }
                case 5: {
                    System.out.println("Encerrando o sistema...");
                    break;
                }
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (option != 5);
    }

    static void consultarSaldo() {
        System.out.println("Você escolheu consultar o saldo.");
        System.out.println("Seu saldo disponível é de R$: " + saldo);
    }

    static void depositar(){
        System.out.println("Você escolheu depositar.");
    }
}
