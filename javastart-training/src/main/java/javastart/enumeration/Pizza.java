package javastart.enumeration;

public enum Pizza {

    MARGHERITA(true, true, false, false),
    CAPRICIOSA(true, true, false, true),
    PROSCIUTTO(true, true, true, false);

    private final boolean tomatoSauce;
    private final boolean cheese;
    private final boolean ham;
    private final boolean mushrooms;

    Pizza(boolean tomatoSauce, boolean cheese, boolean ham, boolean mushrooms) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.ham = ham;
        this.mushrooms = mushrooms;
    }

    @Override
    public String toString() {
        //MARGHERITA (tomato sauce, cheese)
        String result = name() + "(";
        if (tomatoSauce) {
            result += "tomato sauce";
        }
        if (cheese) {
            result += ", cheese";
        }
        if (mushrooms) {
            result += ", mushrooms";
        }
        if (ham) {
            result += ", ham";
        }
        result += ")";
        return result;
    }
}