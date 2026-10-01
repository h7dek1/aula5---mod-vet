import javax.swing.JOptionPane;
//Criar e coletar um vetor[50] inteiro. Calcular e exibir:
// a) a média dos valores entre 10 e 200​‌
// b) a soma dos números impares
public class ModVet01 {
    public static void main(String[] args) {
        int[] vetor = new int[50];
        int somaImpares = 0;
        int somaMedia = 0;
        int contMedia = 0;

        for (int i = 0; i < vetor.length; i++) { 
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posição " + i + ":"));
            
        if (vetor[i] % 2 != 0) { // Soma dos ímpares
            somaImpares += vetor[i];
        }
        if (vetor[i] >= 10 && vetor[i] <= 200) { // Valores entre 10 e 200
            somaMedia += vetor[i];
            contMedia++;
        }
    }
        double media = 0;
        if (contMedia > 0) {
            media = (double) somaMedia / contMedia;
    }
        JOptionPane.showMessageDialog(null,"Média dos valores entre 10 e 200 = " + media + "\nSoma dos números ímpares = " + somaImpares);
    }
}
