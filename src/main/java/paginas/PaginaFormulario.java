package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PaginaFormulario {
    private WebDriver driver;

    public PaginaFormulario(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherFormulario1(String nome, String sobrenome, String telefone) {
        driver.findElement(By.id("nome")).sendKeys(nome);
        driver.findElement(By.id("sobrenome")).sendKeys(sobrenome);
        driver.findElement(By.id("telefone")).sendKeys(telefone);
        driver.findElement(By.id("enviar")).click();
    }

    public String getMensagemModal() {
        WebElement modal = driver.findElement(By.id("modal"));
        if (modal.isDisplayed()) {
            return modal.findElement(By.tagName("p")).getText();
        }
        return null;
    }

    public void selecionarCor(String cor) {
        driver.findElement(By.id("cor")).sendKeys(cor);
    }

    public String getCorDeFundo() {
        return driver.findElement(By.cssSelector(".form-container:nth-child(2)")).getCssValue("background-color");
    }

    public void clicarVerHorario() {
        driver.findElement(By.id("horario")).click();
    }

    public String getMensagemSaudacao() {
        return driver.findElement(By.id("mensagem")).getText();
    }
}
