package testes;

import org.junit.Assert;
import org.junit.Test;
import paginas.PaginaFormulario;
import paginas.PaginaInicial;
import utils.BaseTeste;


public class TestesAlteracaoCor extends BaseTeste {
    @Test
    public void testeAlteracaoCor() {
        PaginaInicial paginaInicial = new PaginaInicial(driver);
        PaginaFormulario paginaFormulario = new PaginaFormulario(driver);

        paginaInicial.navegarPara();
        paginaFormulario.selecionarCor("Azul");
        String corDeFundo = paginaFormulario.getCorDeFundo();

        
        corDeFundo = corDeFundo.replace("rgba(", "rgb(").replace(", 1)", ")");
        
        Assert.assertEquals("rgb(173, 216, 230)", corDeFundo);
    }
}
