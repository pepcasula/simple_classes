public class WaterBottle {

    private int volume = 100;

    public void WaterBottle(){
        this.volume = volume;

    }

    public int drink(){
        int remainingVolume = this.volume - 10;
        return remainingVolume;
    }

    public int empty(){
        this.volume -= 100;
        return this.volume;
    }
    public int fill(){
        this.volume += 100;
        return this.volume;
    }

}
