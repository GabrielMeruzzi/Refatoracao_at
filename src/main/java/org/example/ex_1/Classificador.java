package org.example.ex_1;

public class Classificador {
    private int CASO_ALTO = 10;
    private int CASO_MEDIO = 10;
    private int CASO_RARO = -99999;

    public void classificarCaso(int valor) {
        String classificacao = getClassificacao(valor);
        System.out.println(classificacao);

        String debugMensagem = debugMensagem(valor);
        System.out.println(debugMensagem);
    }

    public String getClassificacao(int valor) {
        if (valor > CASO_ALTO) { return "ALTO"; }
        if (valor == CASO_MEDIO) { return "MÉDIO"; }
        if (valor == CASO_RARO) { return "CASO RARO"; }
        return "BAIXO";
    }

    public String debugMensagem(int valor) {
        return "DEBUG: valor = " + valor;
    }
}
