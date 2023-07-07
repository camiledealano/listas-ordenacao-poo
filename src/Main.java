import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

import array.TelaArray;
import vetor.TelaVetor;

public class Main {

    private static Font font = new Font(Font.SANS_SERIF, Font.BOLD, 13);
    private static Color background = new Color(242, 242, 242);
    private static Color foreground = new Color(148, 24, 129);
    private static Color corComplementar = new Color(153, 224, 130);
    private static Cursor cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);

    public static void main(String[] args) {
        JFrame frame = new JFrame("Trabalho");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton arrayButton = new JButton("Array");
        arrayButton.setBounds(10, 10, 150, 30);
        arrayButton.setFont(font);
        arrayButton.setBackground(background);
        arrayButton.setForeground(foreground);
        arrayButton.setBorder(BorderFactory.createLineBorder(corComplementar, 2));
        arrayButton.setCursor(cursor);
        arrayButton.setFocusable(false);

        JButton vetorButton = new JButton("Vetor");
        vetorButton.setBounds(40, 10, 150, 30);
        vetorButton.setFont(font);
        vetorButton.setBackground(background);
        vetorButton.setForeground(foreground);
        vetorButton.setBorder(BorderFactory.createLineBorder(corComplementar, 2));
        vetorButton.setCursor(cursor);

        frame.getContentPane().add(arrayButton);
        frame.getContentPane().add(vetorButton);

        frame.setLayout(new java.awt.FlowLayout());
        frame.setSize(300, 100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        arrayButton.addActionListener(e -> {
            System.out.println("ARRAY!");
            TelaArray telaArray = new TelaArray(); 
        });
        vetorButton.addActionListener(e -> {
            System.out.println("VETOR!");
            TelaVetor telaVetor = new TelaVetor(); 
        });
    }
}