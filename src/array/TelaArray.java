package array;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;

import utils.IMetodosOrdenacao;


public class TelaArray extends JFrame implements IMetodosOrdenacao {

    private Font font = new Font(Font.SANS_SERIF, Font.BOLD, 13);
    private Color background = new Color(242, 242, 242);
    private Color foreground = new Color(111, 20, 149);

    private JTextArea textArea;
    private JButton btnAZ;
    private JButton btnZA;
    private JButton btnInverter;
    private JButton btnRemoverDuplicados;
    private JButton btnRemoverVazios;
    private JButton btnAplicarTrim;
    private JButton btnConverterMaiusculo;
    private JButton btnConverterMinusculo;
    private JButton btnConverterCapitalizar;

    public TelaArray() {
        setSize(700, 500);
        setTitle("Tela de Vetor");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        criarComponentes();
        setVisible(true);
    }

    private void criarComponentes() {
        JLabel labelAviso = new JLabel();
        labelAviso.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 11));
        labelAviso.setText("Dica: Separe as palavras por vírgula!");
        labelAviso.setBounds(10, 10, 300, 15);
        getContentPane().add(labelAviso);

        textArea = new JTextArea();
        textArea.setBounds(10, 30, 350, 440);
        textArea.setBorder(BorderFactory.createTitledBorder("Digite aqui"));
        getContentPane().add(textArea);

        acoesBotoes();

        btnAZ.setBounds(400, 10, 250, 30);
        btnAZ.setFont(font);
        btnAZ.setText("Ordenar A-Z");
        btnAZ.setBackground(background);
        btnAZ.setForeground(foreground);      
        btnAZ.setBorder(BorderFactory.createLineBorder(foreground, 2));
        getContentPane().add(btnAZ);

        btnZA.setBounds(400, 50, 250, 30);
        getContentPane().add(btnZA);

        btnInverter.setBounds(400, 90, 250, 30);
        getContentPane().add(btnInverter);

        btnRemoverDuplicados.setBounds(400, 150, 250, 30);
        getContentPane().add(btnRemoverDuplicados);

        btnRemoverVazios.setBounds(400, 190, 250, 30);
        getContentPane().add(btnRemoverVazios);

        btnAplicarTrim.setBounds(400, 230, 250, 30);
        getContentPane().add(btnAplicarTrim);

        btnConverterMaiusculo.setBounds(400, 290, 250, 30);
        getContentPane().add(btnConverterMaiusculo);

        btnConverterMinusculo.setBounds(400, 330, 250, 30);
        getContentPane().add(btnConverterMinusculo);

        btnConverterCapitalizar.setBounds(400, 370, 250, 30);
        getContentPane().add(btnConverterCapitalizar);

    }

    private void acoesBotoes() {
        btnAZ = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> nomesOrdenadosAZ = ordenaAZ(getListaNomes());
                textArea.setText(String.join(",", nomesOrdenadosAZ));
            }
        });

        btnZA = new JButton(new AbstractAction("Ordenar de Z-A") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> nomesOrdenadosZA = ordenaZA(getListaNomes());
                textArea.setText(String.join(",", nomesOrdenadosZA));
            
            }
        });

        btnInverter = new JButton(new AbstractAction("Inverter") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> nomesInvertidos = inverter(getListaNomes());
                textArea.setText(String.join(",", nomesInvertidos));
            }
        });

        btnRemoverDuplicados = new JButton(new AbstractAction("Remover Duplicados") {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        btnRemoverVazios = new JButton(new AbstractAction("Remover Vazios") {
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
        });

        btnAplicarTrim = new JButton(new AbstractAction("Aplicar Trim") {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        btnConverterMaiusculo = new JButton(new AbstractAction("Converter maiúsculo") {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                
            }
        });

        btnConverterMinusculo = new JButton(new AbstractAction("Converter minúsculo") {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                
            }
            
        });

        btnConverterCapitalizar = new JButton(new AbstractAction("Converter capitalizar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                
            }
        });
    }

    private ArrayList<String> getListaNomes() {
        return new ArrayList<>(Arrays.asList(textArea.getText().split(",")));
    }

    @Override 
    public ArrayList<String> ordenaAZ(ArrayList<String> nomes) {
        Collections.sort(nomes);
        return nomes;
    }

    @Override 
    public ArrayList<String> ordenaZA(ArrayList<String> nomes) {
        Collections.reverse(nomes);;
        return nomes;
    }

    @Override
    public ArrayList<String> inverter(ArrayList<String> nomes) {
        Collections.swap(nomes, 0, nomes.size() - 1);
        return nomes;
    }
    
}
