
package cap03;
import javax.swing.JOptionPane;
public class Questao04 {
    public static void main(String[] args) {
        int numero;
        String auxiliar, tabuada = "";
        auxiliar = JOptionPane.showInputDialog("Informe o numero da tabuada");
        numero = Integer.parseInt(auxiliar);
        for(int i = 1; i< 11; i++){
            tabuada += numero + " x " + i + " = " + (numero * i) + "\n";
        }
        JOptionPane.showMessageDialog(null, tabuada);
    }
}
