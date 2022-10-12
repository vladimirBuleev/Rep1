package rockpaperscissors;
public class RandomValue {
    int value;
    RandomValue(){

    }public int getRandomValue(){
        this.value=(int)(Math.random()*3);
        return this.value;
    }
}
