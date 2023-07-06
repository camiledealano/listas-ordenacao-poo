package vetor.Classes;

public class Funcoes{

    public static String[] OrdenaAZ(String[] vetor){
            int n = vetor.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (vetor[i].compareTo(vetor[j]) > 0) {
                        String temp = vetor[i];
                        vetor[i] = vetor[j];
                        vetor[j] = temp;
                    }
                }
            }
            return vetor;
        }

    public static String[] OrdenaZA(String[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j].compareTo(vetor[j + 1]) < 0) {
                    String temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        return vetor;
    }

    public static String[] Inverter(String[] arlNomes) {
        String[] linhasInvertidas = new String[arlNomes.length];

        for (int i = 0; i < arlNomes.length; i++) {
            linhasInvertidas[i] = arlNomes[arlNomes.length - 1 - i];
        }
        return linhasInvertidas;
    }

    public static String[] removerDuplicatas(String[] arlNomes) {
        int tamanhoSemDuplicatas = 0;

        for (int i = 0; i < arlNomes.length; i++) {
            if (arlNomes[i] != null) {
                for (int j = i + 1; j < arlNomes.length; j++) {
                    if (arlNomes[i].equals(arlNomes[j])) {
                        arlNomes[j] = null;
                    }
                }
                tamanhoSemDuplicatas++;
            }
        }

        String[] linhasSemDuplicatas = new String[tamanhoSemDuplicatas];
        int indice = 0;

        for (String linha : arlNomes) {
            if (linha != null) {
                linhasSemDuplicatas[indice++] = linha;
            }
        }
        return linhasSemDuplicatas;
    }

    public static String[] removerVazios(String[] arlNomes) {
        int tamanho = arlNomes.length;

        for (String linha : arlNomes) {
            if (linha.trim().isEmpty()){
                tamanho--;
            }
       }

        String[] linhasSemVazios = new String[tamanho];
        int indice = 0;

        for (String linha : arlNomes) {
            if (!linha.trim().isEmpty()) {
                linhasSemVazios[indice++] = linha;
            }
        }
        return linhasSemVazios;
    }
    
    public static String[] aplicarTrim(String[] arlNomes) {
        String[] textosSemEspaco = new String[arlNomes.length];
    
        for (int i = 0; i < arlNomes.length; i++) {
            if (arlNomes[i] != null) {
                textosSemEspaco[i] = arlNomes[i].trim();
            }
        }
    
        return textosSemEspaco;
    }

    public static String[] converterMaiusculo(String[] arlNomes) {
        String[] linhasMaiusculas = new String[arlNomes.length];

        for (int i = 0; i < arlNomes.length; i++) {

            char[] caracteres = arlNomes[i].toCharArray();

            for (int j = 0; j < caracteres.length; j++) {
                caracteres[j] = Character.toUpperCase(caracteres[j]);
            }
            linhasMaiusculas[i] = new String(caracteres);
        System.out.println(linhasMaiusculas[i]);

        }

        return linhasMaiusculas;
    }

    public static String[] converterMinusculo(String[] arlNomes) {
        String[] linhasMinusculas = new String[arlNomes.length];

        for (int i = 0; i < arlNomes.length; i++) {

            char[] caracteres = arlNomes[i].toCharArray();

            for (int j = 0; j < caracteres.length; j++) {
                caracteres[j] = Character.toLowerCase(caracteres[j]);
            }
            linhasMinusculas[i] = new String(caracteres);
        }

        return linhasMinusculas;
    }

    public static String[] capitalizar(String[] arlNomes) {
        String[] linhasCapitalizadas = new String[arlNomes.length];
        String espaco = "N";
        for (int i = 0; i < arlNomes.length; i++) {

            char[] caracteres = arlNomes[i].toCharArray();

            for (int j = 0; j < caracteres.length; j++) {
                if (j == 0 || espaco == "S"){
                    caracteres[j] = Character.toUpperCase(caracteres[j]);
                    espaco = "N";
                } else {
                    caracteres[j] = Character.toLowerCase(caracteres[j]);
                }
                if (caracteres[j] == ' '){
                    espaco = "S";
                }
            }
            linhasCapitalizadas[i] = new String(caracteres);
        }

        return linhasCapitalizadas;
    }
    
}