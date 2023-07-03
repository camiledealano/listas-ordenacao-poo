package array;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import array.classes.IOrdenacao;

public class TelaArray extends JFrame implements IOrdenacao {
    
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
        // labelzinho separe os nomes por enter
        textArea = new JTextArea();
        textArea.setBounds(10, 10, 350, 440);
        getContentPane().add(textArea);

        acoesBotoes();

        btnAZ.setBounds(400, 10, 250, 30);
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

        btnAZ = new JButton(new AbstractAction("Ordenar de A-Z") {
            @Override
            public void actionPerformed(ActionEvent e) {
                //ok
                ArrayList<String> nomesOrdenados = IOrdenacao.ordenaAZ(pegarListaNomes());
                textArea.setText(String.join(",", nomesOrdenados));
            }
        });

        btnZA = new JButton(new AbstractAction("Ordenar de Z-A") {
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
        });

        btnInverter = new JButton(new AbstractAction("Inverter") {
            @Override
            public void actionPerformed(ActionEvent e) {
            
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

    private ArrayList<String> pegarListaNomes() {
        return new ArrayList<>(Arrays.asList(textArea.getText().split(",")));
    }
}
