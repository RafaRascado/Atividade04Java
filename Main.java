// Faça um programa que leia o nome, o sobrenome, a idade, em
// anos, e a naturalidade (cidade de nascimento) de uma pessoa.
// Depois, o programa deve dar a seguinte opção “Deseja
// visualizar dados completos?”. Se o caractere digitado pelo
// usuário for ‘S’ o programa deve imprimir na tela Nome,
// Sobrenome, idade e naturalidade. Se o caractere digitado pelo
// usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se
// o caractere não for nenhuma das outras opções acima o programa
// deve imprimir “Digitação errada. Tente Novamente”.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("Digite o seu nome: ");
    Scanner teclado = new Scanner(System.in);
    String nome = teclado.nextLine();

    System.out.println("Digite o seu sobrenome: ");
    Scanner tecladoSobrenome = new Scanner(System.in);
    String sobrenome = tecladoSobrenome.nextLine();

    System.out.println("Digite a sua idade: ");
    Scanner tecladoIdade = new Scanner(System.in);
    int idade = tecladoIdade.nextInt();

    System.out.println("Digite a sua naturalidade: ");
    Scanner tecladoNaturalidade = new Scanner(System.in);
    String naturalidade = tecladoNaturalidade.nextLine();

    System.out.println("Se deseja visualizar seu dados informe S se não Informe N");

    Scanner tecladoEscolha = new Scanner(System.in);
    String escolha = tecladoEscolha.nextLine();

    switch (escolha) {
      case "S":
        System.out.println(
            "Nome: " + nome + " Sobrenome: " + sobrenome + " Idade: " + idade + " Naturalidade: " + naturalidade);
        break;

      case "N":
        System.out.println("Não quero visualizar meus dados");
        break;

      default:
        System.out.println("Digitação errada. Tente Novamente");
    }
  }
}