package utils;

import java.util.ArrayList;

public interface IMetodosOrdenacao {

    ArrayList<String> ordenaAZ(ArrayList<String> nomes);

    ArrayList<String> ordenaZA(ArrayList<String> nomes);

    ArrayList<String> inverter(ArrayList<String> nomes);
    
}
