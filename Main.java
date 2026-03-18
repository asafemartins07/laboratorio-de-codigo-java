import java.util.Scanner;

public class Main { // classe principal
  public static void main(String[] args) { // função principal
    String nomePet = "Brunno"; // CADEIA DE TEXTO
    double idade = 0.5;
    String cor = "Mancha marrom no rosto com pelagem branca e manchas marrons pelo corpo";
    boolean vacinado = true; // false
    // TIPO -> VERDADEIRO OU FALSO
    System.out.println("Nome do Pet: " + nomePet);
    System.out.println("Idade: " + idade + " meses");
    System.out.println("Cor: " + cor);
    System.out.println("Vacinado?" + vacinado);

    Scanner leitura = new Scanner(System.in);
    System.out.println("Digite a raça do gatinho: ");
    String raca = leitura.nextLine();
    System.out.println("Raça do Pet: " + raca);
    leitura.close();

    // continua a lógica abaixo
    for (int i = 1; i<=5; i++){
      System.out.println("Número: "+ i );
    }
    for (int i = 0; i < nomePet.length(); i++){
      System.out.println(nomePet.charAt(i));
    }
    
  }
}
