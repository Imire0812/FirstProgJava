package hw68;

public class Example1DataRace {
    private int count = 0;
    public void incremetn(){
        setCount(getCount() + 1);
    }
    public int getCount(){
        return count;
    }
    public void setCount(int count){
        this.count = count;
    }
}
