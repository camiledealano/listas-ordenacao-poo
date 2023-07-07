import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import array.TelaArray;
import vetor.TelaVetor;

public class Main {

    private static JFrame tela;
    private static final Font font = new Font(Font.SANS_SERIF, Font.BOLD, 12);
    private static final Color background = new Color(242, 242, 242);
    private static final Color foreground = new Color(148, 24, 129);
    private static final Color corComplementar = new Color(153, 224, 130);
    private static final Cursor cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
    private static final JLabel lblOrientacao = new JLabel("Clique nas opções abaixo para abrir as telas!");
    private static final JButton btnArray = new JButton("Ordenação com ArrayList");
    private static final JButton btnVetor = new JButton("Ordenação com vetor");



    public static void main(String[] args) {
        criarComponentes();
        tela = new JFrame("Trabalho POO - Ordenação e Listas");
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLayout(null);
        tela.setSize(300, 150);
        tela.getContentPane().add(lblOrientacao);
        tela.getContentPane().add(btnArray);
        tela.getContentPane().add(btnVetor);
        tela.setVisible(true);
    }

    private static void criarComponentes() {
        lblOrientacao.setFont(font);
        lblOrientacao.setBounds(15, 0, 345, 30);

        btnArray.setBounds(40, 35, 200, 25);
        btnArray.setFont(font);
        btnArray.setBackground(background);
        btnArray.setForeground(foreground);
        btnArray.setBorder(BorderFactory.createLineBorder(corComplementar, 2));
        btnArray.setCursor(cursor);
        btnArray.setFocusable(false);
        btnArray.addActionListener(acao -> {
            TelaArray telaArray = new TelaArray();
        });

        btnVetor.setBounds(40, 65, 200, 25);
        btnVetor.setFont(font);
        btnVetor.setBackground(background);
        btnVetor.setForeground(foreground);
        btnVetor.setBorder(BorderFactory.createLineBorder(corComplementar, 2));
        btnVetor.setCursor(cursor);
        btnVetor.setFocusable(false);
        btnVetor.addActionListener(acao -> {
            TelaVetor telaVetor = new TelaVetor();
        });
    }
}