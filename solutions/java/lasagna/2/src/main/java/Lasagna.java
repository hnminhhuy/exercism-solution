public class Lasagna {
    private static final int EXPECTED_IN_OVEN = 40;
    
    public int expectedMinutesInOven() {
        return this.EXPECTED_IN_OVEN;
    }

    public int remainingMinutesInOven(int actualTime) {
        return this.EXPECTED_IN_OVEN - actualTime;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int actualTime) {
        return preparationTimeInMinutes(layers) + actualTime;
    }
}
