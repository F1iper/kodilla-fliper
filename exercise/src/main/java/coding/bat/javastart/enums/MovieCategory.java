package coding.bat.javastart.enums;

public enum MovieCategory {
    SCI_FI("Science Fiction"),
    ROMANTIC("Romantic"),
    HORROR("Horror"),
    DOCUMENT("Document");

    private String displayName;

    private MovieCategory(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}