package org.example;
import org.openqa.selenium.*;
public class page_objects_pesq_cep {
    private static WebElement element = null;

    //Campo de CEP
    public static WebElement fld_txt_cep(WebDriver driver) {
        element = driver.findElement(By.id("endereco"));
        return element;
    }



    //botao de busca
    public static WebElement btn_pesquisar(WebDriver driver) {
        element = driver.findElement(By.id("btn_pesquisar"));
        return element;
    }
}
