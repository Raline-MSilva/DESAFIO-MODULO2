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
            System.out.println("Digite 3: Para Remover um Funcionário da lista usando o CPF");
            System.out.println("Digite 4: Para Sair do Programa de Cadastro");
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

                    // não permite inserir um funcionário com o CPF repetido.
                    if (funcionarios.containsKey(cpf)) {
                        System.out.println("CPF já se encontra em nosso sistema!");
                        System.out.println("Favor digitar um outro CPF: ");
                        cpf = leitor.nextLine();
                    }

                    funcionarios.put(cpf, " Nome: " + nome + " Telefone: " + telefone + " Email: " + email);
                    break;
                }
                case 2: {
                    for (String lista : funcionarios.keySet()) {
                        System.out.println("Contato: " + funcionarios.get(lista) + "." + " CPF: " + lista + ".");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Por favor, digite o CPF a ser deletado: ");
                    String cpfDeletado = "";
                    String cpfASerDeletado = leitor.nextLine();

                    for (String lista : funcionarios.keySet()) {
                        if (lista.contains(cpfDeletado)) {
                            System.out.println("CPF deletado com Sucesso. ");
                            cpfDeletado = cpfASerDeletado;
                        }
                    }
                    break;

                }
                case 4: {
                    chave = 4;
                    break;
                }

                default: {
                    System.out.println("Por favor digite um valor que esteja dentro do Menu!");
                    break;
                }
            }
        }
    }
}

