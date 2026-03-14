public class Lasagna {
    private static final int EXPECTED_IN_OVEN = 40;
    
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return this.EXPECTED_IN_OVEN;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualTime) {
        return this.EXPECTED_IN_OVEN - actualTime;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int actualTime) {
        return preparationTimeInMinutes(layers) + actualTime;
    }
}
