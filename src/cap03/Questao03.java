package cap03;
import javax.swing.JOptionPane;
public class Questao03 {
    public static void main(String[] args) {
        String login, senha;
        for (int i=2;i>=0;i--){
            login = JOptionPane.showInputDialog("Informe o login");
            senha = JOptionPane.showInputDialog("Informe a Senha");
            if ("java8".equals(login) && "java8".equals(senha)){
                JOptionPane.showMessageDialog(null, "Login e Senhas aceitos");
                break;
            }
            else{
                JOptionPane.showMessageDialog(null, "Verifique login e senhas\nVocê tem mais "+ i + " tentativas");    
            }

        }
        
    }
}
