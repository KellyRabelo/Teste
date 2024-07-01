package testes;

import org.junit.Assert;
import org.junit.Test;
import paginas.PaginaFormulario;
import paginas.PaginaInicial;
import utils.BaseTeste;

public class TestesSaudacao extends BaseTeste {
    @Test
    public void testeMensagemSaudacao() {
        PaginaInicial paginaInicial = new PaginaInicial(driver);
        PaginaFormulario paginaFormulario = new PaginaFormulario(driver);

        paginaInicial.navegarPara();
        paginaFormulario.clicarVerHorario();
        String mensagemSaudacao = paginaFormulario.getMensagemSaudacao();

        String mensagemEsperada;
        int hora = java.time.LocalTime.now().getHour();
        if (hora < 12) {
            mensagemEsperada = "Bom dia!";
        } else if (hora < 18) {
            mensagemEsperada = "Boa tarde!";
        } else {
            mensagemEsperada = "Boa noite!";
        }

        Assert.assertEquals(mensagemEsperada, mensagemSaudacao);
    }
}
