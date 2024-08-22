public class RewardValue {
    private double cashVlaue;
    private int milesValue;

    RewardValue(double cashValue){
        this.cashVlaue = cashValue;
    }
    RewardValue(int milesValue){
        this.milesValue = milesValue;
    }
    public double getCashValue(){
        return this.cashVlaue;   
    }
    public int getMilesValue(){
        return this.milesValue;
    }
    public double convertToCash(int mmilesValue){
        return mmilesValue * 0.0035;
    }
}
