package Mordor;

public enum Foods {

    CRAM(2),
    LEMBAS(3),
    APPLE(1),
    MELON(1),
    HONEYCAKE(5),
    MUSHROOMS(-10);

    private int num;

    Foods(int num) {
        this.num = num;
    }

    public int getValue() {
        return num;
    }



    public static boolean contains(String test) {

        for (Foods c : Foods.values()) {
            if (c.name().equals(test)) {
                return true;
            }
        }

        return false;
    }

}
