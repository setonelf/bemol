On this project I worked with two Frameworks

1 -  Selenium

  To web automation using Selenium I used the Page Objects Model locating the page elements in classes:
  - page_objects_pesq_cep.java
  - page_objects_trivago_main.java
  - page_objects_trivago_pesquisa.java

    Then in the testBemol.java all the elements was used to create the tests

2 - Rest Assured

  To API tests I create a mail generator in order to provide ramdom valid emails to validate the API
    - GeradorDeEmail.java
  Then to test the API i wrote the tests in ServeRestApi.java, the API validated could check in this site: https://serverest.dev/, the items tested was:
    - Create an user
    - Check if the user was created
    - Create a product
    - Check if the product was created
