package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class SeasonManager {

    // uzupełnij metodę - do wczytywania danych użyj przekazany Scanner
    public void run(Scanner scanner) {
        System.out.println("Podaj porę roku");
        for (Season value : Season.values()) {
            System.out.println(value.getPlTranslation());
        }
        String userInput = scanner.nextLine();
        Season season = Season.findSeason(userInput);
        if (season != null) {
            System.out.println("W tej porze roku są następujące miesiące:");
            System.out.println(Arrays.toString(season.getMonths()));
        } else {
            System.out.println("Wprowadzono nieprawidłowe dane.");
        }
    }
}
