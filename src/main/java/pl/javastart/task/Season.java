package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public enum Season {
    SPRING(new String[]{"marzec", "kwiecień", "maj"}, "wiosna"),
    SUMMER(new String[]{"czerwiec", "lipiec", "sierpień"}, "lato"),
    AUTUMN(new String[]{"wrzesień", "październik", "listopad"}, "jesień"),
    WINTER(new String[]{"grudzień", "styczeń", "luty"}, "zima");

    Season(String[] months, String plTranslation) {
        this.months = months;
        this.plTranslation = plTranslation;
    }

    private final String[] months;
    private final String plTranslation;

    public String[] getMonths() {
        return months;
    }

    public String getPlTranslation() {
        return plTranslation;
    }

    public static void findSeason(Scanner scanner) {
        String choice = scanner.nextLine();
        Season season = null;
        for (Season value : Season.values()) {
            if (choice.toLowerCase().equals(value.getPlTranslation())) {
                season = value;
            }
        }
        if (season != null) {
            System.out.println("W tej porze roku są następujące miesiące:");
            System.out.println(Arrays.toString(season.getMonths()));
        } else {
            System.out.println("Wprowadzono nieprawidłowe dane.");
        }
    }
}