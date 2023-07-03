package array.classes;

import java.util.ArrayList;
import java.util.Collections;

public interface IOrdenacao {

    static ArrayList<String> ordenaAZ(ArrayList<String> nomes) {
        Collections.sort(nomes);
        return nomes;
    }

    // static ArrayList<String> ordenaZA (ArrayList<String> nomes) {

    // }

    

}
