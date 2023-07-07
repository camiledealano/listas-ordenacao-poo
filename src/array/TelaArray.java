package array;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.stream.Collectors;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import utils.IMetodosOrdenacao;

public class TelaArray extends JFrame implements IMetodosOrdenacao {

    private Font font = new Font(Font.SANS_SERIF, Font.BOLD, 13);
    private Font fontTextArea = new Font(Font.SANS_SERIF, Font.PLAIN, 13);
    private Color background = new Color(242, 242, 242);
    private Color foreground = new Color(148, 24, 129);
    private Color corComplementar = new Color(153, 224, 130);
    private Cursor cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);

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
        setSize(700, 455);
        setTitle("Ordenação com Collections");
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        criarComponentes();
        setVisible(true);
    }

    private void criarComponentes() {
        JLabel labelDica = new JLabel();
        labelDica.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 11));
        labelDica.setText("Dica: Separe as palavras por vírgula!");
        labelDica.setBounds(10, 10, 300, 15);
        getContentPane().add(labelDica);

        textArea = new JTextArea();
        textArea.setBounds(10, 30, 350, 372);

        Border matteBorder = BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(227, 168, 2));
        String titulo = "Digite aqui";
        Border titledBorder = BorderFactory.createTitledBorder(matteBorder, titulo);
        ((TitledBorder) titledBorder).setTitleColor(new Color(58, 93, 230));
        ((TitledBorder) titledBorder).setTitleFont(font);
        textArea.setBorder(titledBorder);

        textArea.setFont(fontTextArea);
        textArea.setBackground(background);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        getContentPane().add(textArea);

        acoesBotoes();

        btnAZ.setBounds(400, 10, 250, 30);
        btnAZ.setFont(font);
        btnAZ.setText("Ordenar A-Z");
        btnAZ.setBackground(background);
        btnAZ.setForeground(foreground);
        btnAZ.setBorder(BorderFactory.createLineBorder(corComplementar, 2));
        btnAZ.setCursor(cursor);
        btnAZ.setFocusable(false);
        getContentPane().add(btnAZ);

        btnZA.setBounds(400, 50, 250, 30);
        btnZA.setFont(font);
        btnZA.setText("Ordenar Z-A");
        btnZA.setBackground(background);
        btnZA.setForeground(foreground);
        btnZA.setBorder(BorderFactory.createLineBorder(corComplementar, 2));
        btnZA.setCursor(cursor);
        btnZA.setFocusable(false);
        getContentPane().add(btnZA);

        btnInverter.setBounds(400, 90, 250, 30);
        btnInverter.setFont(font);
        btnInverter.setText("Inverter");
        btnInverter.setBackground(background);
        btnInverter.setForeground(foreground);
        btnInverter.setBorder(BorderFactory.createLineBorder(corComplementar, 2));
        btnInverter.setCursor(cursor);
        btnInverter.setFocusable(false);
        getContentPane().add(btnInverter);

        btnRemoverDuplicados.setBounds(400, 150, 250, 30);
        btnRemoverDuplicados.setFont(font);
        btnRemoverDuplicados.setText("Remover Duplicados");
        btnRemoverDuplicados.setBackground(background);
        btnRemoverDuplicados.setForeground(foreground);
        btnRemoverDuplicados.setBorder(BorderFactory.createLineBorder(corComplementar, 2));
        btnRemoverDuplicados.setCursor(cursor);
        btnRemoverDuplicados.setFocusable(false);
        getContentPane().add(btnRemoverDuplicados);

        btnRemoverVazios.setBounds(400, 190, 250, 30);
        btnRemoverVazios.setFont(font);
        btnRemoverVazios.setText("Remover Vazios");
        btnRemoverVazios.setBackground(background);
        btnRemoverVazios.setForeground(foreground);
        btnRemoverVazios.setBorder(BorderFactory.createLineBorder(corComplementar, 2));
        btnRemoverVazios.setCursor(cursor);
        btnRemoverVazios.setFocusable(false);
        getContentPane().add(btnRemoverVazios);

        btnAplicarTrim.setBounds(400, 230, 250, 30);
        btnAplicarTrim.setFont(font);
        btnAplicarTrim.setText("Aplicar Trim");
        btnAplicarTrim.setBackground(background);
        btnAplicarTrim.setForeground(foreground);
        btnAplicarTrim.setBorder(BorderFactory.createLineBorder(corComplementar, 2));
        btnAplicarTrim.setCursor(cursor);
        btnAplicarTrim.setFocusable(false);
        getContentPane().add(btnAplicarTrim);

        btnConverterMaiusculo.setBounds(400, 290, 250, 30);
        btnConverterMaiusculo.setFont(font);
        btnConverterMaiusculo.setText("Converter para Maiúsculo");
        btnConverterMaiusculo.setBackground(background);
        btnConverterMaiusculo.setForeground(foreground);
        btnConverterMaiusculo.setBorder(BorderFactory.createLineBorder(corComplementar, 2));
        btnConverterMaiusculo.setCursor(cursor);
        btnConverterMaiusculo.setFocusable(false);
        getContentPane().add(btnConverterMaiusculo);

        btnConverterMinusculo.setBounds(400, 330, 250, 30);
        btnConverterMinusculo.setFont(font);
        btnConverterMinusculo.setText("Converter para Minúsculo");
        btnConverterMinusculo.setBackground(background);
        btnConverterMinusculo.setForeground(foreground);
        btnConverterMinusculo.setBorder(BorderFactory.createLineBorder(corComplementar, 2));
        btnConverterMinusculo.setCursor(cursor);
        btnConverterMinusculo.setFocusable(false);
        getContentPane().add(btnConverterMinusculo);

        btnConverterCapitalizar.setBounds(400, 370, 250, 30);
        btnConverterCapitalizar.setFont(font);
        btnConverterCapitalizar.setText("Capitalizar");
        btnConverterCapitalizar.setBackground(background);
        btnConverterCapitalizar.setForeground(foreground);
        btnConverterCapitalizar.setBorder(BorderFactory.createLineBorder(corComplementar, 2));
        btnConverterCapitalizar.setCursor(cursor);
        btnConverterCapitalizar.setFocusable(false);
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

        btnZA = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> nomesOrdenadosZA = ordenaZA(getListaNomes());
                textArea.setText(String.join(",", nomesOrdenadosZA));

            }
        });

        btnInverter = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> nomesInvertidos = inverter(getListaNomes());
                textArea.setText(String.join(",", nomesInvertidos));
            }
        });

        btnRemoverDuplicados = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> nomesSemDuplicatas = removerDuplicados(getListaNomes());
                textArea.setText(String.join(",", nomesSemDuplicatas));
            }
        });

        btnRemoverVazios = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> nomesVaziosRemovidos = removerVazios(getListaNomes());
                textArea.setText(String.join(",", nomesVaziosRemovidos));
            }
        });

        btnAplicarTrim = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> nomesComTrim = aplicarTrim(getListaNomes());
                textArea.setText(String.join(",", nomesComTrim));
            }
        });

        btnConverterMaiusculo = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> nomesMaiusculo = converterMaiusculo(getListaNomes());
                textArea.setText(String.join(",", nomesMaiusculo));

            }
        });

        btnConverterMinusculo = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> nomesMinusculo = converterMinusculo(getListaNomes());
                textArea.setText(String.join(",", nomesMinusculo));

            }

        });

        btnConverterCapitalizar = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> nomesCapitalizados = capitalizar(getListaNomes());
                textArea.setText(String.join(",", nomesCapitalizados));

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
        Collections.sort(nomes, (n1, n2) -> n2.compareTo(n1));
        ;
        return nomes;
    }

    @Override
    public ArrayList<String> inverter(ArrayList<String> nomes) {
        Collections.swap(nomes, 0, nomes.size() - 1);
        return nomes;
    }

    @Override
    public ArrayList<String> removerDuplicados(ArrayList<String> nomes) {
        return (ArrayList<String>) nomes.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    @Override
    public ArrayList<String> removerVazios(ArrayList<String> nomes) {
        if (nomes.contains("")) {
            nomes.removeAll(nomes.stream()
                    .filter(n -> n.equals(""))
                    .collect(Collectors.toList()));
        }

        return nomes;
    }

    @Override
    public ArrayList<String> aplicarTrim(ArrayList<String> nomes) {
        return new ArrayList<String>(
                nomes.stream()
                        .map(String::trim)
                        .collect(Collectors.toList()));
    }

    @Override
    public ArrayList<String> converterMaiusculo(ArrayList<String> nomes) {
        for (String nome : nomes) {
            String newValue = nome.toUpperCase(Locale.ROOT);
            nomes.set(nomes.indexOf(nome), newValue);
        }

        return nomes;
    }

    @Override
    public ArrayList<String> converterMinusculo(ArrayList<String> nomes) {
        for (String nome : nomes) {
            String newValue = nome.toLowerCase(Locale.ROOT);
            nomes.set(nomes.indexOf(nome), newValue);
        }

        return nomes;
    }

    @Override
    public ArrayList<String> capitalizar(ArrayList<String> nomes) {
        return (ArrayList<String>) nomes.stream()
        .map(nome -> {
            String caracterMaiusculo = nome.substring(0, 1).toUpperCase();
            String restanteNome = nome.substring(1);
            return caracterMaiusculo + restanteNome;
        })
        .collect(Collectors.toList());
    }
}