package utils;

import java.util.ArrayList;

public interface IMetodosOrdenacao {

    ArrayList<String> ordenaAZ(ArrayList<String> nomes);

    ArrayList<String> ordenaZA(ArrayList<String> nomes);

    ArrayList<String> inverter(ArrayList<String> nomes);

    ArrayList<String> removerDuplicados(ArrayList<String> nomes);

    ArrayList<String> removerVazios(ArrayList<String> nomes);

    ArrayList<String> aplicarTrim(ArrayList<String> nome);

    ArrayList<String> converterMaiusculo(ArrayList<String> nome);

    ArrayList<String> converterMinusculo(ArrayList<String> nome);

    ArrayList<String> capitalizar(ArrayList<String> nomes);
}
