import br.com.alura.conversorDeMoedas.calculos.ChamarApi;
import br.com.alura.conversorDeMoedas.modelos.ModeloJson;
import br.com.alura.conversorDeMoedas.modelos.Moeda;
import br.com.alura.conversorDeMoedas.modelos.MoedaExchangerate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        int numero = 0;
        String json;

        Scanner scanner = new Scanner(System.in);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        ArrayList<ModeloJson> historico = new ArrayList<>();

        while (numero != 7){

            System.out.println("""
                    
                    *******************************************
                    
                    Bem vindo ao conversor de Moedas!
                    
                    1) Dólar >>>> Peso argentino
                    2) Peso Argentino >>> Dólar
                    3) Dólar >>> Real Brasileiro
                    4) Real Brasileiro >>> Dólar
                    5) Dolár >>> Peso Colombiano
                    6) Peso colombiano >>> Dólar
                    7) Sair
                    
                    Escolha uma opção válida
                    *******************************************
                    """);
            numero = scanner.nextInt();


            switch (numero){
                case 1:

                    try{

                        ChamarApi novaChamada = new ChamarApi();

                        Moeda moedaBase = new Moeda("USD");
                        json = novaChamada.chamada(moedaBase);

                        MoedaExchangerate ResponseRecord = gson.fromJson(json, MoedaExchangerate.class);
                        Moeda moedaResponse = new Moeda(ResponseRecord);

                        System.out.println("Digite o valor em [" + moedaResponse.getSimbolo() + "] que deseja converter:");

                        double valorAconverter = scanner.nextDouble();
                        double resultado = valorAconverter * moedaResponse.getConversoes().get("ARS");

                        System.out.println("Valor " + valorAconverter + " [" + moedaResponse.getSimbolo() + "]" + " corresponde ao valor final de  =>>> " + resultado + " [ARS]");

                        Map<String, Double> chave_valor = new HashMap<>();
                        chave_valor.put("ARS", moedaResponse.getConversoes().get("ARS"));
                        ModeloJson modeloImpressao = new ModeloJson(chave_valor, moedaBase.getSimbolo(), valorAconverter, novaChamada.getTime(), resultado);
                        historico.add(modeloImpressao);


                    } catch (Exception e) {
                        System.out.println("Ocorreu um erro: " + e.getMessage());
                    }

                    break;


                case 2:

                    try{
                        ChamarApi novaChamada = new ChamarApi();

                        Moeda moedaBase = new Moeda("ARS");
                        json = novaChamada.chamada(moedaBase);

                        MoedaExchangerate ResponseRecord = gson.fromJson(json, MoedaExchangerate.class);
                        Moeda moedaResponse = new Moeda(ResponseRecord);

                        System.out.println("Digite o valor em [" + moedaResponse.getSimbolo() + "] que deseja converter:");
                        double valorAconverter = scanner.nextDouble();

                        double resultado = valorAconverter * moedaResponse.getConversoes().get("USD");

                        System.out.println("Valor " + valorAconverter + " [" + moedaResponse.getSimbolo() + "]" + " corresponde ao valor final de  =>>> " + resultado + " [USD]");

                        Map<String, Double> chave_valor = new HashMap<>();
                        chave_valor.put("USD", moedaResponse.getConversoes().get("USD"));
                        ModeloJson modeloImpressao = new ModeloJson(chave_valor, moedaBase.getSimbolo(), valorAconverter, novaChamada.getTime(), resultado);
                        historico.add(modeloImpressao);


                    } catch (Exception e) {
                        System.out.println("Ocorreu um erro: " + e.getMessage());
                    }

                    break;

                case 3:

                    try{
                        ChamarApi novaChamada = new ChamarApi();

                        Moeda moedaBase = new Moeda("USD");
                        json = novaChamada.chamada(moedaBase);

                        MoedaExchangerate ResponseRecord = gson.fromJson(json, MoedaExchangerate.class);
                        Moeda moedaResponse = new Moeda(ResponseRecord);

                        System.out.println("Digite o valor em [" + moedaResponse.getSimbolo() + "] que deseja converter:");
                        double valorAconverter = scanner.nextDouble();

                        double resultado = valorAconverter * moedaResponse.getConversoes().get("BRL");

                        System.out.println("Valor " + valorAconverter + " [" + moedaResponse.getSimbolo() + "]" + " corresponde ao valor final de  =>>> " + resultado + " [BRL]");

                        Map<String, Double> chave_valor = new HashMap<>();
                        chave_valor.put("BRL", moedaResponse.getConversoes().get("BRL"));
                        ModeloJson modeloImpressao = new ModeloJson(chave_valor, moedaBase.getSimbolo(), valorAconverter, novaChamada.getTime(), resultado);
                        historico.add(modeloImpressao);

                    } catch (Exception e) {
                        System.out.println("Ocorreu um erro: " + e.getMessage());
                    }

                    break;

                case 4:

                    try{
                        ChamarApi novaChamada = new ChamarApi();

                        Moeda moedaBase = new Moeda("BRL");
                        json = novaChamada.chamada(moedaBase);

                        MoedaExchangerate ResponseRecord = gson.fromJson(json, MoedaExchangerate.class);
                        Moeda moedaResponse = new Moeda(ResponseRecord);

                        System.out.println("Digite o valor em [" + moedaResponse.getSimbolo() + "] que deseja converter:");
                        double valorAconverter = scanner.nextDouble();

                        double resultado = valorAconverter * moedaResponse.getConversoes().get("USD");

                        System.out.println("Valor " + valorAconverter + " [" + moedaResponse.getSimbolo() + "]" + " corresponde ao valor final de  =>>> " + resultado + " [USD]");

                        Map<String, Double> chave_valor = new HashMap<>();
                        chave_valor.put("USD", moedaResponse.getConversoes().get("USD"));
                        ModeloJson modeloImpressao = new ModeloJson(chave_valor, moedaBase.getSimbolo(), valorAconverter, novaChamada.getTime(), resultado);
                        historico.add(modeloImpressao);

                    } catch (Exception e) {
                        System.out.println("Ocorreu um erro: " + e.getMessage());
                    }

                    break;

                case 5:

                    try{
                        ChamarApi novaChamada = new ChamarApi();

                        Moeda moedaBase = new Moeda("USD");
                        json = novaChamada.chamada(moedaBase);

                        MoedaExchangerate ResponseRecord = gson.fromJson(json, MoedaExchangerate.class);
                        Moeda moedaResponse = new Moeda(ResponseRecord);

                        System.out.println("Digite o valor em [" + moedaResponse.getSimbolo() + "] que deseja converter:");
                        double valorAconverter = scanner.nextDouble();

                        double resultado = valorAconverter * moedaResponse.getConversoes().get("COP");

                        System.out.println("Valor " + valorAconverter + " [" + moedaResponse.getSimbolo() + "]" + " corresponde ao valor final de  =>>> " + resultado + " [COP]");

                        Map<String, Double> chave_valor = new HashMap<>();
                        chave_valor.put("COP", moedaResponse.getConversoes().get("COP"));
                        ModeloJson modeloImpressao = new ModeloJson(chave_valor, moedaBase.getSimbolo(), valorAconverter, novaChamada.getTime(), resultado);
                        historico.add(modeloImpressao);

                    } catch (Exception e) {
                        System.out.println("Ocorreu um erro: " + e.getMessage());
                    }

                    break;

                case 6:

                    try{
                        ChamarApi novaChamada = new ChamarApi();

                        Moeda moedaBase = new Moeda("COP");
                        json = novaChamada.chamada(moedaBase);

                        MoedaExchangerate ResponseRecord = gson.fromJson(json, MoedaExchangerate.class);
                        Moeda moedaResponse = new Moeda(ResponseRecord);

                        System.out.println("Digite o valor em [" + moedaResponse.getSimbolo() + "] que deseja converter:");
                        double valorAconverter = scanner.nextDouble();

                        double resultado = valorAconverter * moedaResponse.getConversoes().get("USD");

                        System.out.println("Valor " + valorAconverter + " [" + moedaResponse.getSimbolo() + "]" + " corresponde ao valor final de  =>>> " + resultado + " [USD]");

                        Map<String, Double> chave_valor = new HashMap<>();
                        chave_valor.put("USD", moedaResponse.getConversoes().get("USD"));
                        ModeloJson modeloImpressao = new ModeloJson(chave_valor, moedaBase.getSimbolo(), valorAconverter, novaChamada.getTime(), resultado);
                        historico.add(modeloImpressao);

                    } catch (Exception e) {
                        System.out.println("Ocorreu um erro: " + e.getMessage());
                    }

                    break;

            }

        }

          FileWriter arquivo = new FileWriter("historico.json");
          arquivo.write(gson.toJson(historico));
          arquivo.close();

        System.out.println("Obrigado por usar o sistema, arquivo do histórico de transações gerado!");

    }
}
