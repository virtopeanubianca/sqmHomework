import model.WasherFunctions;

public class Washer {

    private WasherFunctions washerFunctions;
    public static double price = 10000.99;
    private double weigh;
    private boolean hasDryer;
    private int timer;

    public WasherFunctions getWasherFunctions() {
        return washerFunctions;
    }

    public void setWasherFunctions(WasherFunctions washerFunctions) {
        this.washerFunctions = washerFunctions;
    }

    public double getWeigh() {
        return weigh;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    public boolean isHasDryer() {
        return hasDryer;
    }

    public void setHasDryer(boolean hasDryer) {
        this.hasDryer = hasDryer;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    @Override
    public String toString() {
        return "Washer{" +
                "washerFunctions=" + washerFunctions +
                ", price=" + price +
                ", weigh=" + weigh +
                ", hasDryer=" + hasDryer +
                ", timer=" + timer +
                '}';
    }

    public void calculateTime(WasherFunctions washerFunctions){
        switch (washerFunctions){
            case ADD_WASHES:
                setTimer(70);
                break;
            case ECO_BUBBLE:
                setTimer(100);
                break;
            case FAST_CLEAN:
                setTimer(30);
                break;
            case SUPER_CLEAN:
                setTimer(150);
                break;
        }
    }

    public boolean wash (){

        if(washerFunctions == null){
            System.out.println("MODE IS not SET");
            return false;
        }
        calculateTime(washerFunctions);
        if(timer == 0){
            System.out.println("TIME HASN'T BEEN CALCULATED");
            return false;
        }

        System.out.println("THE WASHER STARTED THE PROGRAM.");
        return true;
    }


}
