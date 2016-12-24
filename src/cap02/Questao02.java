
package cap02;
import java.util.Scanner;
public class Questao02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lider, lanterna, ultrapassar;
        System.out.print("Digite a pontuação do lider: ");
        lider = entrada.nextInt();
        System.out.print("Digite a pontuação do lanterna: ");
        lanterna = entrada.nextInt();
        ultrapassar = (lider - lanterna)/3;
        System.out.println("O numero de vitorias para que o lanterna alcance o lider é de: "+ ultrapassar);
    }
}
