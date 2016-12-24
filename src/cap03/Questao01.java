package cap03;
import javax.swing.JOptionPane;
public class Questao01 {
    public static void main(String[] args) {
       String nomeProduto, auxiliar;
       float valorProduto, total, desconto;
       nomeProduto = JOptionPane.showInputDialog("Informe o nome do produto");
       auxiliar = JOptionPane.showInputDialog("Informe o valor do Produto");
       valorProduto = Float.parseFloat(auxiliar);
       if (valorProduto >= 50 && valorProduto < 200){
           desconto = valorProduto *5/100;
           total = valorProduto - desconto;
           JOptionPane.showMessageDialog(null, "Nome do Produto: " + nomeProduto+ "\nValor Original do Produto: "+ valorProduto + "\nValor do Produto com desconto: "+ total);
       }
       else if (valorProduto >= 200 && valorProduto < 500){
           desconto = valorProduto *6/100;
           total = valorProduto - desconto;
           JOptionPane.showMessageDialog(null, "Nome do Produto: " + nomeProduto+ "\nValor Original do Produto: "+ valorProduto + "\nValor do Produto com desconto: "+ total);
       }
       else if (valorProduto >= 500 && valorProduto < 1000){
           desconto = valorProduto *7/100;
           total = valorProduto - desconto;
           JOptionPane.showMessageDialog(null, "Nome do Produto: " + nomeProduto+ "\nValor Original do Produto: "+ valorProduto + "\nValor do Produto com desconto: "+ total);
       }
       else if (valorProduto >= 1000){
           desconto = valorProduto *8/100;
           total = valorProduto - desconto;
           JOptionPane.showMessageDialog(null, "Nome do Produto: " + nomeProduto+ "\nValor Original do Produto: "+ valorProduto + "\nValor do Produto com desconto: "+ total);
       }
       else if (valorProduto < 50 && valorProduto >= 0){
           JOptionPane.showMessageDialog(null, "Nome do Produto: " + nomeProduto+ "\nValor Original do Produto: "+ valorProduto + "\nNão existe desconto para esse produto");
       }
       else if (valorProduto < 0){
           JOptionPane.showMessageDialog(null, "Tente Novamente");                 
       }
    }
}
