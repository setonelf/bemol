package org.example.apitests;


import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import io.restassured.http.ContentType;

import java.util.Random;

import static io.restassured.RestAssured.*;

public class ServeRestApi {
    Faker faker = new Faker();
    GeradorDeEmail geradorDeEmail = new GeradorDeEmail();
    Random random = new Random();
    String fullName = faker.name().fullName();
    String email = geradorDeEmail.email()+"@gmail.com";
    String produto = geradorDeEmail.email();



    @Before
    public void setup(){
        baseURI = "https://serverest.dev";

    }
    @Test
    public void testCadastroDeUsuario() {

        //Cadastrar Usuario
        String idNumber = given()
                .body("{\n" +
                        "  \"nome\": \"" + fullName + "\",\n" +
                        "  \"email\": \"" + email + "\",\n" +
                        "  \"password\": \"123456\",\n" +
                        "  \"administrador\": \"true\"\n" +
                        "}")
                    .contentType(ContentType.JSON)
                .when()
                    .post("/usuarios")
                .then()
                    .log().all().assertThat().statusCode(201)
                    .extract().path("_id").toString();


        //Verificar se Usuario foi cadastrado
        String usuario = given()
                    .contentType(ContentType.JSON)
                .when()
                    .get("/usuarios?_id=" + idNumber)
                .then()
                    .log().all()
                    .assertThat().statusCode(200)
                    .extract().path("usuarios._id").toString();
        Assert.assertEquals("["+idNumber+"]", usuario);

    }

    @Test
    public void testCadastroDeProduto() {

        //Realizar Login
        String token = given()
                .body("{\n" +
                        "  \"email\": \"freitas.war@gmail.com\",\n" +
                        "  \"password\": \"160193\"\n" +
                        "}")
                    .contentType(ContentType.JSON)
                .when()
                    .post("/login")
                .then()
                    .log().all().assertThat().statusCode(200)
                    .extract().path("authorization");
        System.out.println(token);

        //Cadastrar Usuario
        String idProduto = given()
                    .header("Authorization",token)
                    .body("{\n" +
                            "  \"nome\": \"" + produto + "\",\n" +
                            "  \"preco\": 123,\n" +
                            "  \"descricao\": \"RandomItem\",\n" +
                            "  \"quantidade\": 123\n" +
                            "}")
                    .contentType(ContentType.JSON)
                .when()
                    .post("/produtos")
                .then()
                    .log().all().assertThat().statusCode(201)
                    .extract().path("_id").toString();


        //Verificar se Usuario foi cadastrado
        String produto = given()
                    .contentType(ContentType.JSON)
                .when()
                    .get("/produtos?_id=" + idProduto)
                .then()
                    .log().all()
                    .assertThat().statusCode(200)
                    .extract().path("produtos._id").toString();
        Assert.assertEquals("["+idProduto+"]", produto);

    }
}
