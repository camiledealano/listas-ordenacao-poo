package vetor;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;

import utils.IMetodosOrdenacao;
import vetor.Classes.Funcoes;

public class TelaVetor extends JFrame implements IMetodosOrdenacao {

    private Font font = new Font(Font.SANS_SERIF, Font.BOLD, 13);
    private Color background = new Color(242, 242, 242);
    private Color foreground = new Color(111, 20, 149);
    private Color foreground2 = new Color(132,71,255);
    private Color foreground3 = new Color(255,51,116);

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
    private String[] arlNomes;

    public TelaVetor() {
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
        textArea.setBounds(10, 30, 350, 420);
        textArea.setBorder(BorderFactory.createTitledBorder("Digite aqui"));
        getContentPane().add(textArea);

        acoesBotoes();

        btnAZ.setBounds(400, 30, 250, 30);
        btnAZ.setFont(font);
        btnAZ.setText("Ordenar A-Z");
        btnAZ.setBackground(background);
        btnAZ.setForeground(foreground);      
        btnAZ.setBorder(BorderFactory.createLineBorder(foreground, 2));
        getContentPane().add(btnAZ);

        btnZA.setBounds(400, 70, 250, 30);
        btnZA.setFont(font);
        btnZA.setText("Ordenar Z-A");
        btnZA.setBackground(background);
        btnZA.setForeground(foreground);      
        btnZA.setBorder(BorderFactory.createLineBorder(foreground, 2));
        getContentPane().add(btnZA);

        btnInverter.setBounds(400, 110, 250, 30);
        btnInverter.setFont(font);
        btnInverter.setText("Inverter");
        btnInverter.setBackground(background);
        btnInverter.setForeground(foreground);      
        btnInverter.setBorder(BorderFactory.createLineBorder(foreground, 2));
        getContentPane().add(btnInverter);

        btnRemoverDuplicados.setBounds(400, 170, 250, 30);
        btnRemoverDuplicados.setFont(font);
        btnRemoverDuplicados.setText("Remover Duplicados");
        btnRemoverDuplicados.setBackground(background);
        btnRemoverDuplicados.setForeground(foreground2);      
        btnRemoverDuplicados.setBorder(BorderFactory.createLineBorder(foreground2, 2));
        getContentPane().add(btnRemoverDuplicados);

        btnRemoverVazios.setBounds(400, 210, 250, 30);
        btnRemoverVazios.setFont(font);
        btnRemoverVazios.setText("Remover Vazios");
        btnRemoverVazios.setBackground(background);
        btnRemoverVazios.setForeground(foreground2);      
        btnRemoverVazios.setBorder(BorderFactory.createLineBorder(foreground2, 2));
        getContentPane().add(btnRemoverVazios);

        btnAplicarTrim.setBounds(400, 250, 250, 30);
        btnAplicarTrim.setFont(font);
        btnAplicarTrim.setText("Aplicar Trim");
        btnAplicarTrim.setBackground(background);
        btnAplicarTrim.setForeground(foreground2);      
        btnAplicarTrim.setBorder(BorderFactory.createLineBorder(foreground2, 2));
        getContentPane().add(btnAplicarTrim);

        btnConverterMaiusculo.setBounds(400, 310, 250, 30);
        btnConverterMaiusculo.setFont(font);
        btnConverterMaiusculo.setText("Converter maiúsculo");
        btnConverterMaiusculo.setBackground(background);
        btnConverterMaiusculo.setForeground(foreground3);      
        btnConverterMaiusculo.setBorder(BorderFactory.createLineBorder(foreground3, 2));
        getContentPane().add(btnConverterMaiusculo);

        btnConverterMinusculo.setBounds(400, 350, 250, 30);
        btnConverterMinusculo.setFont(font);
        btnConverterMinusculo.setText("Converter minúsculo");
        btnConverterMinusculo.setBackground(background);
        btnConverterMinusculo.setForeground(foreground3);      
        btnConverterMinusculo.setBorder(BorderFactory.createLineBorder(foreground3, 2));
        getContentPane().add(btnConverterMinusculo);

        btnConverterCapitalizar.setBounds(400, 390, 250, 30);
        btnConverterCapitalizar.setFont(font);
        btnConverterCapitalizar.setText("Converter capitalizar");
        btnConverterCapitalizar.setBackground(background);
        btnConverterCapitalizar.setForeground(foreground3);      
        btnConverterCapitalizar.setBorder(BorderFactory.createLineBorder(foreground3, 2));
        getContentPane().add(btnConverterCapitalizar);

    }

    private void acoesBotoes() {
        btnAZ = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    String texto = textArea.getText();
                    arlNomes = texto.split("\n");
    
                    arlNomes = Funcoes.OrdenaAZ(arlNomes);
    
                    StringBuilder resultado = new StringBuilder();

                    for (String s : arlNomes) {
                        System.out.println(s);
                        resultado.append(s).append("\n");
                    }
                    textArea.setText(resultado.toString());
    
            getContentPane().add(btnAZ);  
            }
        });

        btnZA = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textArea.getText();
                arlNomes = texto.split("\n");
                arlNomes = Funcoes.OrdenaZA(arlNomes);

                StringBuilder resultado = new StringBuilder();
                for (String s : arlNomes) {
                    resultado.append(s).append("\n");
                }

                textArea.setText(resultado.toString());
            }
        });

        btnInverter = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textArea.getText();
                arlNomes = texto.split("\n");
                String[] Invertido = Funcoes.Inverter(arlNomes);

                StringBuilder resultado = new StringBuilder();
                for (String s : Invertido) {
                    resultado.append(s).append("\n");
                }
                
                textArea.setText(resultado.toString());
            }
        });

        btnRemoverDuplicados = new JButton(new AbstractAction("Remover Duplicados") {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textArea.getText();
                arlNomes = texto.split("\n");
                String[] textoSemDuplicatas = Funcoes.removerDuplicatas(arlNomes);

                StringBuilder resultado = new StringBuilder();
                for (String s : textoSemDuplicatas) {
                    resultado.append(s).append("\n");
                }

                textArea.setText(resultado.toString());
            }
        });

        btnRemoverVazios = new JButton(new AbstractAction("Remover Vazios") {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textArea.getText();
                arlNomes = texto.split("\n");
                String[] textoSemVazios = Funcoes.removerVazios(arlNomes);

                StringBuilder resultado = new StringBuilder();
                for (String s : textoSemVazios) {
                    resultado.append(s).append("\n");
                }

                textArea.setText(resultado.toString());
            }
        });

        btnAplicarTrim = new JButton(new AbstractAction("Aplicar Trim") {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textArea.getText();
                arlNomes = texto.split(" ");
                String[] textosSemEspaco = Funcoes.aplicarTrim(arlNomes);

                StringBuilder resultado = new StringBuilder();
                textArea.setText(resultado.toString());

                for (String s : textosSemEspaco) {
                    resultado.append(s).append("");
                }
                System.out.println("Resultado: " + resultado);

                textArea.setText(resultado.toString());
            }            
        });

        btnConverterMaiusculo = new JButton(new AbstractAction("Converter maiúsculo") {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textArea.getText();
                arlNomes = texto.split("\n");
                String[] convertido = Funcoes.converterMaiusculo(arlNomes);
                StringBuilder resultado = new StringBuilder();
                for (String s : convertido) {
                    resultado.append(s).append("\n");
                }

                textArea.setText(resultado.toString());
            }
        });

        btnConverterMinusculo = new JButton(new AbstractAction("Converter minúsculo") {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textArea.getText();
                arlNomes = texto.split("\n");
                String[] convertido = Funcoes.converterMinusculo(arlNomes);
                StringBuilder resultado = new StringBuilder();
                for (String s : convertido) {
                    resultado.append(s).append("\n");
                }

                textArea.setText(resultado.toString());
            }
            
        });

        btnConverterCapitalizar = new JButton(new AbstractAction("Converter capitalizar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textArea.getText();
                arlNomes = texto.split("\n");
                String[] convertido = Funcoes.capitalizar(arlNomes);
                StringBuilder resultado = new StringBuilder();
                for (String s : convertido) {
                    resultado.append(s).append("\n");
                }

                textArea.setText(resultado.toString());
            }
        });
    }

    @Override
    public ArrayList<String> ordenaAZ(ArrayList<String> nomes) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ordenaAZ'");
    }

    @Override
    public ArrayList<String> ordenaZA(ArrayList<String> nomes) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ordenaZA'");
    }

    @Override
    public ArrayList<String> inverter(ArrayList<String> nomes) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inverter'");
    }

    @Override
    public ArrayList<String> removerDuplicados(ArrayList<String> nomes) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removerDuplicados'");
    }

    @Override
    public ArrayList<String> removerVazios(ArrayList<String> nomes) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removerVazios'");
    }

    @Override
    public ArrayList<String> aplicarTrim(ArrayList<String> nome) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'aplicarTrim'");
    }

    @Override
    public ArrayList<String> maiusculo(ArrayList<String> nome) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'maiusculo'");
    }

    @Override
    public ArrayList<String> minusculo(ArrayList<String> nome) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'minusculo'");
    }

    @Override
    public ArrayList<String> capitalizar(ArrayList<String> nome) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'capitalizar'");
    }    
}
