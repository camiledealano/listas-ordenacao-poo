package utils;

public interface IMetodosOrdenacaoVetor {

    String[] OrdenaAZ(String[] nomes);

    String[] OrdenaZA(String[] nomes);

    String[] Inverter(String[] nomes);

    String[] removerDuplicatas(String[] nomes);

    String[] removerVazios(String[] nomes);

    String[] aplicarTrim(String[] nome);

    String[] converterMaiusculo(String []nome);

    String[] converterMinusculo(String[] nome);

    String[] capitalizar(String[] nome);
}
