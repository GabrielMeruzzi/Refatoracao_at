package org.example;

import junit.framework.TestCase;
import org.example.ex_1.Classificador;
import org.junit.jupiter.api.Test;

public class ClassificadorTest extends TestCase {
    Classificador classificador = new Classificador();

    @Test
    public void getClassificacaoAltoTeste() {
        String classificacao = classificador.getClassificacao(11);

        assertEquals("ALTO", classificacao);
    }

    @Test
    public void getClassificacaoMedioTeste() {
        String classificacao = classificador.getClassificacao(10);

        assertEquals("MÉDIO", classificacao);
    }

    @Test
    public void getClassificacaoRaroTeste() {
        String classificacao = classificador.getClassificacao(-99999);

        assertEquals("CASO RARO", classificacao);
    }

    @Test
    public void getClassificacaoBaixoTeste() {
        String classificacao = classificador.getClassificacao(5);

        assertEquals("BAIXO", classificacao);
    }

    @Test
    public void debugMensagemTeste() {
        String debug = classificador.debugMensagem(10);

        assertEquals("DEBUG: valor = 10", debug);
    }
}