
package cap03;
import javax.swing.JOptionPane;
public class Questao5 {
    public static void main(String[] args) {
        String atividade;
        atividade = JOptionPane.showInputDialog("Digite uma opção:\n" +
				"1-Exercicio 1\n" +
				"2-Exercicio 2\n" +
				"3-Exercicio 3\n" +
				"4-Exercicio 4\n");
        switch(atividade){
            case "1":
                Questao01.main(new String[]{});
                break;
            case "2":
                Questao02.main(new String[]{});
                break;
            case "3":
                Questao03.main(new String[]{});
                break;
            case "4":
                Questao04.main(new String[]{});
                break;
            default:
                JOptionPane.showMessageDialog(null, "Informe uma atividade válida");
        }
    }
}
