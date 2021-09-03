package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    //Crie um programa para gerenciar uma lista de funcionários de uma empresa,
    //cada funcionário tem nome, telefone, email e CPF.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String, String> funcionarios = new HashMap<String, String>();
        int chave = 0;
        System.out.println("Bem vindo ao Cadastro de Funcionários!");
        int opcao = 0;

        //permite adicionar mais de um funcionário e apresenta um menu para decidir se deverá:
        while (chave == 0) {
            System.out.println("Digite 1: Para Cadastrar um novo Funcionário");
            System.out.println("Digite 2: Para Exibir a lista de Funcionários cadastrados");
            System.out.println("Digite 3: Para Sair do Programa de Cadastramento");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1: {
                    System.out.println("Por favor, digite o nome completo do funcionário: ");
                    String nome = leitor.nextLine();
                    System.out.println("Agora digite o telefone: ");
                    String telefone = leitor.nextLine();
                    System.out.println("Digite o email: ");
                    String email = leitor.nextLine();
                    System.out.println("Por fim, digite o CPF: ");
                    String cpf = leitor.nextLine();

                    funcionarios.put(cpf, " Nome: " + nome + " Telefone: " + telefone + " Email: " + email);
                    break;
                }
                case 2: {
                    System.out.println(funcionarios);
                    break;
                }
                case 3: {
                    chave = 3;
                    break;
                }
                default: {
                    System.out.println("É preciso digitar um valor válido!");
                    break;
                }
            }
        }
    }
}
