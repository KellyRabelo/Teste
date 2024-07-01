package testes;

import org.junit.Assert;
import org.junit.Test;
import paginas.PaginaFormulario;
import paginas.PaginaInicial;
import utils.BaseTeste;

public class TestesFormulario extends BaseTeste {
    @Test
    public void testeEnvioFormulario() {
        PaginaInicial paginaInicial = new PaginaInicial(driver);
        PaginaFormulario paginaFormulario = new PaginaFormulario(driver);

        paginaInicial.navegarPara();
        paginaFormulario.preencherFormulario1("Fulano", "de Tal", "12345678");
        String mensagemModal = paginaFormulario.getMensagemModal();

        Assert.assertEquals("Enviado com sucesso!", mensagemModal);
    }
}
