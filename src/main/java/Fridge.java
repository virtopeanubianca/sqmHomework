public class Fridge {

    public double price;
    private int degrees = 2;
    private double weigh;
    private boolean hasWaterIceFilter;
    private boolean isSmart;

    public double getPrice() {
        if(hasWaterIceFilter && isSmart){
            setPrice(7890.66);
        }else if (hasWaterIceFilter && !isSmart){
            setPrice(6000.99);
        }else if (!hasWaterIceFilter && isSmart){
            setPrice(7000.66);
        }else{
            setPrice(5000);
        }

        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDegrees() {
        return degrees;
    }

    public void setDegrees(int degrees) {
        this.degrees = degrees;
    }

    public double getWeigh() {
        return weigh;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }

    public boolean isHasWaterIceFilter() {
        return hasWaterIceFilter;
    }

    public void setHasWaterIceFilter(boolean hasWaterIceFilter) {
        this.hasWaterIceFilter = hasWaterIceFilter;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }


}
