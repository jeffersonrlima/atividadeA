package cap02;
import javax.swing.JOptionPane;
public class Questa03 {
    public static void main(String[] args) {
        String auxiliar;
        double valorTransacao, venal, percentualImposto, total;
        auxiliar = JOptionPane.showInputDialog("Informe o valor de Transação");
        valorTransacao = Double.parseDouble(auxiliar);
        auxiliar = JOptionPane.showInputDialog("Informe o valor Venal");
        venal = Double.parseDouble(auxiliar);
        auxiliar = JOptionPane.showInputDialog("Informe o percentual");
        percentualImposto= Double.parseDouble(auxiliar);
        if (valorTransacao > venal){
            total = valorTransacao * percentualImposto/100;
            JOptionPane.showMessageDialog(null, "O  valor total do imposto é de: R$"+ total);
        }
        else {
            total = venal * percentualImposto/100;
            JOptionPane.showMessageDialog(null, "O  valor total do imposto é de: R$"+ total);
        }
    }
}
