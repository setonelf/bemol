package org.example;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class testBemol {



    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\thiag\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(40));


        //Desafio 1
        driver.manage().window().maximize();
        driver.get("http://www.buscacep.correios.com.br/");
        page_objects_pesq_cep.fld_txt_cep(driver).sendKeys("69005-040");
        page_objects_pesq_cep.btn_pesquisar(driver).click();

        //Desafio2

        driver.get("http://www.trivago.com.br/");
        page_objects_trivago_main.fld_txt_buscaCidade(driver).sendKeys("Manaus");
        Thread.sleep(2000);
        page_objects_trivago_main.txt_Entrada(driver).click();
        Thread.sleep(2000);
        page_objects_trivago_main.btn_proxFds(driver).click();
        Thread.sleep(2000);
        page_objects_trivago_main.btn_pesquisar(driver).click();
        wait.until(d -> page_objects_trivago_pesquisa.btn_Seletor(driver).isDisplayed());
        wait.until(d -> page_objects_trivago_pesquisa.cnt_Security(driver).isDisplayed());
        wait.until(ExpectedConditions.invisibilityOf(page_objects_trivago_pesquisa.cnt_Security(driver)));
        page_objects_trivago_pesquisa.slct_Opcao2(driver).click();
        Thread.sleep(5000);
        String nome = page_objects_trivago_pesquisa.lst_Nome1(driver).getText();
        String avaliacao = page_objects_trivago_pesquisa.lst_Avaliacao1(driver).getText();
        String preco = page_objects_trivago_pesquisa.lst_Preco1(driver).getText();
        System.out.println("O nome do primeiro da lista é: "+nome+"\n");
        System.out.println("A avaliacao do primeiro da lista é: "+avaliacao+"\n");
        System.out.println("O preco do primeiro da lista é: "+preco+"\n");
        driver.quit();



    }

}
