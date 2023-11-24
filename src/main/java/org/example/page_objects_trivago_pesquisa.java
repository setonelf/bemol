package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class page_objects_trivago_pesquisa {
    private static WebElement element = null;

    //Limpar Campo de pesquisa
    public static WebElement btn_Seletor(WebDriver driver) {
        element = driver.findElement(By.id("sorting-selector"));
        return element;
    }

    //Opção 2
    public static WebElement slct_Opcao2(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"sorting-selector\"]/option[2]"));
        return element;
    }

    //Containe de segurança
    public static WebElement cnt_Security(WebDriver driver) {
        element = driver.findElement(By.id("sec-container"));
        return element;
    }

    //nome do primeiro da lista
    public static WebElement lst_Nome1(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@class=\"relative min-h-screen pt-1\"]/div/ol/li[1]/div/article/div[2]/div/section/h2/button/span"));
        return element;
    }

    //avaliacao do primeiro da lista
    public static WebElement lst_Avaliacao1(WebDriver driver) {
        element = driver.findElement(By.xpath("//*/li[1]/div/article/div[2]/div[1]/button[2]/span[1]/span/span/strong/span"));
        return element;
    }

    public static WebElement lbl_Preco(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[1]/div[2]/div/div[3]/div/div/fieldset/button[1]/span/span[2]/span[2]"));
        return element;
    }

    //preco do primeiro da lista
    public static WebElement lst_Preco1(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@class=\"relative min-h-screen pt-1\"]/div/ol/li[1]/div/article/div[2]/div[2]/div[1]/div/div[3]/div/div/p"));
        return element;
    }
}
