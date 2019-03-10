package tariff;

public enum Species {
    COMFORT_S ("Комфорт S"),
    COMFORT_M ("Комфорт M"),
    COMFORT_L ("Комфорт L"),
    START ("Стартовый"),
    CALL_INTERNET ("Привет. Звонки плюс интернет"),
    CALL ("Привет. Звонки"),
    SMART_UNLIM ("Smart бесконечный"),
    BUISNESS_CLASS ("Бизнес класс");

    private String nameSpecies;

    Species(String nameSpecies) {
        this.nameSpecies = nameSpecies;
    }

    public String getNameSpecies() {
        return nameSpecies;
    }

    @Override
    public String toString() {
        return "Species {nameSpecies = '"
                + nameSpecies + '\''
                + '}';
    }
}
