package cap03;
import javax.swing.JOptionPane;
public class Questao02 { 
    public static void main(String[] args) {
        int resistencia[] = new int[4];
        int maior = 0, menor = 0, r1,r2,r3,r4, aux = 0;
        String auxiliar;
        for (int i=0; i<4;i++){
            auxiliar = JOptionPane.showInputDialog("Informe a resistencia "+ (i+1));
            resistencia[i] = Integer.parseInt(auxiliar);
            if(resistencia[i] > maior){
                maior = resistencia[i];
            }
        }
        for(int j = 0; j<4; j++){
		for(int x = 0; x<3; x++){
			if(resistencia[j] < resistencia[x + 1]){
				aux = resistencia[x];
				resistencia[x] = resistencia[x+1];
				resistencia[x+1] = aux;
			}
		}
	}
        r1 = resistencia[0];
        r2 = resistencia[1];
        r3 = resistencia[2];
        r4 = resistencia[3];
        
        JOptionPane.showMessageDialog(null, "Resistencias fornecidas:\n" +r1+", "+r2+", "+r3+", "+r4+", " + "\nA maior resistencia é: "+ maior + "\nA menor resistencia é: "+ r4);
    }
    
}

