package br.inatel.cdg.servico;

import br.inatel.cdg.modelo.Game;
import br.inatel.cdg.modelo.Platform;
import br.inatel.cdg.modelo.Publisher;
import java.util.ArrayList;
import java.util.List;

public class ServiceGame {

    public static List<Game> getListByPlatform(List<Game> games, Platform platform){
        List<Game> gamesByPlatform = new ArrayList<>();

        games.stream().filter((game ->
                game.getPlatform().equals(platform.name()))).
                forEach(game -> gamesByPlatform.add(game));

        return gamesByPlatform;

    }

    public static List<Game> getByPuBlisher(List<Game> games ,
                                            Publisher publisher){
        List<Game> gamesByPublisher = new ArrayList<>();

        games.stream().filter((game ->
                        game.getPublisher().replaceAll("\\s+", "").equals(publisher.name()))).
                forEach(game -> gamesByPublisher.add(game));

        return gamesByPublisher;
    }

}