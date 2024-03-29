package exercises.Fluent;

public enum Levels {
    BEGINNER("Beginner"), INTERMEDIATE("Intermediate"), ADVANCED("Advanced");

    private String value;

    Levels(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}