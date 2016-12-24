package cap02;
import java.io.*;
public class Questao01 {
    public static void main(String[] args) throws IOException {
        String auxiliar;
        float valor, valorDesconto, total;
        BufferedReader entrada;
        try {
        System.out.print("Digite o valor do produto: ");
        entrada = new BufferedReader(new InputStreamReader(System.in));
        auxiliar = entrada.readLine();
        valor = Float.parseFloat(auxiliar);
        System.out.print("Digite o valor do desconto: ");
        auxiliar = entrada.readLine();
        valorDesconto = Float.parseFloat(auxiliar);
        total = valor * (valorDesconto / 100);
        System.out.println("O valor do desconto é: " + total);
        } catch (NumberFormatException erro){
            System.out.println("Erro" + erro.toString());
        }
    }
}
