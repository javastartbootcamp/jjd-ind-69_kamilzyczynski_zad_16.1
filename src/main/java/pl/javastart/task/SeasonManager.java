package pl.javastart.task;

import java.util.Scanner;

public class SeasonManager {

    // uzupełnij metodę - do wczytywania danych użyj przekazany Scanner
    public void run(Scanner scanner) {
        System.out.println("Podaj porę roku");
        for (Season value : Season.values()) {
            System.out.println(value.getPlTranslation());
        }

        Season.findSeason(scanner);
    }


}
