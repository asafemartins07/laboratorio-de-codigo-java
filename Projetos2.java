import java.util.Scanner;
public class Projetos2 {
  public static void main(String[] args) {
 Scanner entrada = new Scanner(System.in);

String saudacao = "Olá, Mundo";
System.out.println(saudacao);

System.out.println("Digite seu nome: ");
String nome = entrada.nextLine();
System.out.printf("Olá %s. Sobre o que é sua dúvida", nome);
System.out.print("Escolha um assunto: Python, Matemática ou História? ");
String resposta = entrada.nextLine().toLowerCase();


switch(resposta){
  case "python":
    System.out.println("Ótimo, vamos falar sobre código");
    break;
  case "física":
    case "fisica":
    System.out.println("Bora ver as estrelas");
    break;

  case "matemática":
    case "matematica":
    System.out.println("Vamos praticar exercícios");
    break;
  default:
    System.out.println("uhm, não sei falar sobre este tema");
    

    
}

}
}