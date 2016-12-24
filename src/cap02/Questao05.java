package cap02;
import java.util.Scanner;
public class Questao05 {
    public static void main(String[] args) {
        int idade, contribuicao, aposentadoriaAnos, faltam;
        String sexo;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe sua idade: ");
        idade = entrada.nextInt();
        System.out.print("Informe seu sexo (m/f): ");
        sexo = entrada.next();
        System.out.print("Informe a quantidade de anos trabalhados: ");
        contribuicao = entrada.nextInt();
        if( "m".equals(sexo)){
            aposentadoriaAnos = 30 - contribuicao;
            if (aposentadoriaAnos <= 0){
                System.out.println("Você já tem direito a aposentadoria");
            }
            if (idade >= 65){
                System.out.println("Você já tem direito a aposentadoria");
            }
            else {
                System.out.println("Falta "+ aposentadoriaAnos + " anos para sua aposentadoria");
            }
        }
        if ("f".equals(sexo)){
            aposentadoriaAnos = 30 - contribuicao;
            if (aposentadoriaAnos <= 0){
                System.out.println("Você já tem direito a aposentadoria");
            }
            if (idade >= 60){
                System.out.println("Você já tem direito a aposentadoria");
            }
            else {
                System.out.println("Falta "+ aposentadoriaAnos + " anos para sua aposentadoria");
            }
        }
    }
}
