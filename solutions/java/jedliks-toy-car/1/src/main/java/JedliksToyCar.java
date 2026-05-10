public class JedliksToyCar {
    public static final int BATTERY_USE_RATE = 1;
    public static final int COVERED_DISTANCE = 20;

    private int battery = 100;
    private int meters = 0;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", this.meters);
    }

    public String batteryDisplay() {
        if (this.battery > 0) return String.format("Battery at %d%%", this.battery);

        return "Battery empty";
    }

    public void drive() {
        if(this.battery > 0) {
            this.battery -= JedliksToyCar.BATTERY_USE_RATE;
            this.meters += JedliksToyCar.COVERED_DISTANCE;
        }
    }
}
