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

        System.out.println("Bem vindo ao Cadastramento de Funcionários!");
        System.out.println("Por favor, digite o nome completo do funcionário: ");
        String nome = leitor.nextLine();
        System.out.println("Agora digite o telefone: ");
        String telefone = leitor.nextLine();
        System.out.println("Digite o email: ");
        String email = leitor.nextLine();
        System.out.println("Por fim, digite o CPF: ");
        String cpf = leitor.nextLine();

        funcionarios.put(cpf, " Nome: " +nome+ " Telefone: " +telefone+ " Email: " + email);
        System.out.println(funcionarios);


    }
}
