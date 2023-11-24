package org.example.apitests;

import java.util.Random;

public class GeradorDeEmail {
    protected String email() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * caracteres.length());
            salt.append(caracteres.charAt(index));
        }
        String novoEmail = salt.toString();
        return novoEmail;

    }
}
