package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class page_objects_trivago_main {
    private static WebElement element = null;

    //Campo de pesquisa
    public static WebElement fld_txt_buscaCidade(WebDriver driver) {
        element = driver.findElement(By.id("input-auto-complete"));
        return element;
    }

    //Calendario
    public static WebElement txt_Entrada(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[text()='Entrada']"));
        return element;
    }

    //botao Proximo fds
    public static WebElement btn_proxFds(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[text()='Próximo fim de semana']"));
        return element;
    }

    //Campo de pesquisa
    public static WebElement btn_pesquisar(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[text()='Pesquisar']"));
        return element;
    }

}
