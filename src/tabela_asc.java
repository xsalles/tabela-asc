import java.util.Arrays;
import java.util.Scanner;

public class tabela_asc {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String phrase;

    System.out.println("Digite uma frase que deseja saber o valor na tabela ASC");
    phrase = sc.next();

    byte[] result = phrase.getBytes();

    System.out.println("O valor que tem na sua frase de acordo com a tabela ASC é " + Arrays.toString(result));
  }
}
