package dev.gledson;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {

        String endereco = "https://v6.exchangerate-api.com/v6/80467e0e906b947e4a597874/latest/USD";

        Scanner scan = new Scanner(System.in);

        Double valor;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
            HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
           // System.out.println(json);

            Gson gson = new Gson();

            Moedas moedas = gson.fromJson(json, Moedas.class);
            System.out.println(moedas);
            System.out.println("Cotação USD para BRL: " + moedas.getConversoes().get("BRL"));

        }
        catch (Exception e) {

        }
    }

}
