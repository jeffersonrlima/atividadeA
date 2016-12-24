package cap02;
import javax.swing.JOptionPane;
public class Questao04 {
    public static void main(String[] args) {
        float nota1, nota2, trabalho, media;
        String auxiliar;
        auxiliar = JOptionPane.showInputDialog("Informe a primeira nota");
        nota1 = Float.parseFloat(auxiliar);
        auxiliar = JOptionPane.showInputDialog("Informe a segunda nota");
        nota2 = Float.parseFloat(auxiliar);
        auxiliar = JOptionPane.showInputDialog("Informe a nota do trabalho");
        trabalho = Float.parseFloat(auxiliar);
        media = (nota1 + nota2 + trabalho)/3;
        JOptionPane.showMessageDialog(null, "A media é: " + media);
    }
    
}
