package paginas;

import org.openqa.selenium.WebDriver;

public class PaginaInicial {
    private WebDriver driver;

    public PaginaInicial(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarPara() {
    	driver.get("file:///C:/Users/PC/eclipse-workspace/kelly.rabelo.santos/src/main/resources/TesteQAAutomatizado.html");
    	
      }
}
