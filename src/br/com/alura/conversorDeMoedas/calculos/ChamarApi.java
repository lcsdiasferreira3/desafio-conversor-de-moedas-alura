package br.com.alura.conversorDeMoedas.calculos;

import br.com.alura.conversorDeMoedas.modelos.Moeda;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChamarApi {
    private String texto;
    private String time;


    public String chamada(Moeda moeda) throws IOException, InterruptedException {

        String v6Api = "https://v6.exchangerate-api.com/v6/e7887b5c85bd0be5171d5a44/latest/" + moeda.getSimbolo(); //API presente no gmail

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(v6Api))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.time = time.format(formato);


        texto = response.body();
        return texto;
        
        
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "olha a json aqui seu sem vergonha:" +
                  texto;
    }
}

