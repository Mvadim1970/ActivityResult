package util;

public enum Language {
    ENGLISH("Английский"),
    UKRAINE("Украинский"),
    RUSSIAN("Русский");

    private String language;

    Language(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
