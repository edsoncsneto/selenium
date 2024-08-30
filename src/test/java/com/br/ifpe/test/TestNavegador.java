package com.br.ifpe.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestNavegador {
    static WebDriver driver;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        // Configura o caminho para o driver do Firefox
        System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\bin\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        // Fecha o navegador após todos os testes serem executados
        driver.quit();
    }

    @BeforeEach
    void setUp() throws Exception {
        // Carrega a URL antes de cada teste
        driver.get("http://www.ifpe.edu.br");
    }

    @AfterEach
    void tearDown() throws Exception {
        // Qualquer limpeza necessária após cada teste
    }

    @Test
    public void testeInteracoesComPagina() {
        // Acessa a URL específica para teste
        driver.get("https://portal.ifpe.edu.br/");
        
        // Define o tamanho da janela do navegador
        driver.manage().window().setSize(new Dimension(550, 692));

        // Realiza várias interações com os elementos da página
        realizarMovimentoMouse(By.cssSelector(".wp-image-446"));
        realizarMovimentoMouse(By.tagName("body"), 0, 0);
        realizarMovimentoMouse(By.cssSelector(".wp-image-446"));
        realizarMovimentoMouse(By.tagName("body"), 0, 0);
        realizarMovimentoMouse(By.cssSelector(".wp-image-445"));
        realizarMovimentoMouse(By.tagName("body"), 0, 0);

        // Clica em vários elementos da página
        driver.findElement(By.cssSelector(".btn-menu-toggle")).click();
        driver.findElement(By.cssSelector(".header > .container")).click();
        driver.findElement(By.cssSelector(".slider-wrapper")).click();
        driver.findElement(By.cssSelector(".area-social")).click();
        driver.findElement(By.cssSelector(".home")).click();
        
        // Fecha o navegador
        driver.close();
    }

    private void realizarMovimentoMouse(By by) {
        WebElement element = driver.findElement(by);
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
    }

    private void realizarMovimentoMouse(By by, int xOffset, int yOffset) {
        WebElement element = driver.findElement(by);
        Actions builder = new Actions(driver);
        builder.moveToElement(element, xOffset, yOffset).perform();
    }
}