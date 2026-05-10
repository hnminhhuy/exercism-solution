
class BirdWatcher {
    private final int[] birdsPerDay;
    private int length = 0;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
        this.length = this.birdsPerDay.length;
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        if(this.length > 0) { 
           return this.birdsPerDay[this.length - 1];
        }

        return 0;
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
       for(int i = 0; i < this.length; i++) {
           if(this.birdsPerDay[i] == 0) {
               return true;
           }
       }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        if (numberOfDays <= 0) return 0;
        
        int maxIndex = Math.min(numberOfDays, this.length);
        int sum = 0;
        for(int i = 0; i < maxIndex; i++) {
            sum += this.birdsPerDay[i];
        }

        return sum;
    }

    public int getBusyDays() {
        int count = 0;

        for(int i=0; i<this.length; i++) {
            if(this.birdsPerDay[i] >= 5) count++;
        }

        return count;
    }
}
