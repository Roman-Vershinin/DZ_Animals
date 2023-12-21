package data;

public enum Commands {
    ADD("add"),
    LIST("list"),
    EXIT("exit");

    public static Commands fromString(String text) {
        try {
            return valueOf(text);
        } catch (IllegalArgumentException ex) {
            // Обработка недопустимого значения
            return null;
        }
    }
    private String value;
    Commands(String value) {
        this.value = value;
    }
}