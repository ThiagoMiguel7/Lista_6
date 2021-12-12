package br.inatel.cdg.servico;

import br.inatel.cdg.modelo.Game;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CsvService {

    public static List<Game> listGames(Path csvFilePath){

        List<Game> games = new ArrayList<>();

        try {
            Reader reader = Files.newBufferedReader(csvFilePath);
            CsvToBean<Game> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(Game.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            games = csvToBean.parse();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return games;
    }

}