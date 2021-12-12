package br.inatel.cdg.modelo;
import lombok.Data;

@Data
public class Game {
    private int rank;
    private String name;
    private String platform;
    private int year;
    private String genre;
    private String publisher;
    private double naSales, euSales, jpSales, otherSales, globalSales;

    @Override
    public String toString() {
        return "Jogo: " + name + "\n" +
                "Rank: " + rank + "\n" +
                "Plataforma: " + platform + "\n" +
                "Ano: " + year + "\n" +
                "Genero: " + genre + "\n" +
                "Publicadora: " + publisher + "\n" +
                "Vendas globais: " + globalSales + "\n";
    }
}