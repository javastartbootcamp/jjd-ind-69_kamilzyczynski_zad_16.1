package pl.javastart.task;

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

    public static Season findSeason(String userInput) {
        Season season = null;
        for (Season value : Season.values()) {
            if (userInput.toLowerCase().equals(value.getPlTranslation())) {
                season = value;
            }
        }
        return season;
    }
}