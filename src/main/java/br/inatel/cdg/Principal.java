package br.inatel.cdg;

import br.inatel.cdg.modelo.Game;
import br.inatel.cdg.modelo.Platform;
import br.inatel.cdg.modelo.Publisher;
import br.inatel.cdg.servico.ServiceGame;
import br.inatel.cdg.servico.CsvService;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Path caminho = null;
        try {
            caminho = Paths.get(ClassLoader.getSystemResource("vendas-games.csv").toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        List<Game> gameList = CsvService.listGames(caminho);

        int numLines = gameList.size();
        System.out.println("Numero de linhas: " + numLines);
        System.out.println("");

        List<Game> pcGames = ServiceGame.getListByPlatform(gameList, Platform.PC);
        System.out.println("Numero de jogos de PC: " + pcGames.size());
        System.out.println("");
        pcGames.forEach(e -> System.out.println(e.getName()));
        System.out.println("");

        List<Game> x360Games = ServiceGame.getListByPlatform(gameList, Platform.X360);
        System.out.println("Numero de jogos de Xbox 360: " + x360Games.size());
        System.out.println("");
        x360Games.forEach(e -> System.out.println(e.getName()));
        System.out.println("");

        List<Game> ps2Games = ServiceGame.getListByPlatform(gameList, Platform.PS2);
        System.out.println("Numero de jogos de PS2: " + ps2Games.size());
        System.out.println("");
        ps2Games.forEach(e -> System.out.println(e.getName()));
        System.out.println("");

        List<Game> ps4Games = ServiceGame.getListByPlatform(gameList, Platform.PS4);
        System.out.println("Numero de jogos de PS4: " + ps2Games.size());
        System.out.println("");
        ps4Games.forEach(e -> System.out.println(e.getName()));
        System.out.println("");

        List<Game> microsoftGames = ServiceGame.getByPuBlisher(gameList, Publisher.MicrosoftGameStudios);
        System.out.println("Numero de jogos da Microsoft Game Studios: " + microsoftGames.size());
        System.out.println("");
        microsoftGames.forEach(e -> System.out.println(e.getName()));
        System.out.println("");

        List<Game> sonyGames = ServiceGame.getByPuBlisher(gameList, Publisher.SonyComputerEntertainment);
        System.out.println("Numero de jogos da Microsoft Game Studios: " + sonyGames.size());
        System.out.println("");
        sonyGames.forEach(e -> System.out.println(e.getName()));
        System.out.println("");

        List<Game> activisionGames = ServiceGame.getByPuBlisher(gameList, Publisher.Activision);
        System.out.println("Numero de jogos da activision: " + activisionGames.size());
        System.out.println("");
        activisionGames.forEach(e -> System.out.println(e.getName()));//imprimindo o nome dos jogos da activison
        System.out.println("");


    }

}
