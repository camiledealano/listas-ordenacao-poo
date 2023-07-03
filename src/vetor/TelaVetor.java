package vetor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TelaVetor extends JFrame {

    private JTextArea textArea;
    private JButton btnAZ;

    public TelaVetor() {
        setSize(700, 500);
        setTitle("Tela de Array");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        criarComponentes();
        setVisible(true);
    }

    private void criarComponentes() {
        textArea = new JTextArea();
        textArea.setBounds(10, 10, 350, 440);
        getContentPane().add(textArea);

        btnAZ = new JButton();
        btnAZ.setBounds(380, 10, 80, 40);
        getContentPane().add(btnAZ);

    }

    
}
