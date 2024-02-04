package chapterThree;

public class AirCondition {
        private boolean isOn;
        private int temp = 16;

    public boolean isTurnedOn(){
        return isOn;
    }

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;;
    }

    public void increaseTemp(){
        boolean temperatureWithinRange = temp >= 16 && temp < 30;
        if(isTurnedOn() && temperatureWithinRange)
            temp++;
    }
    public void increaseTemp(int temp){

        if(isTurnedOn() && temp > 16 && temp <= 30)this.temp = temp;
    }

    public void decreaseTemp(){

    }

    public void toggle(){
        isOn = !isOn;
    }

    public int getTemp(){
        return temp;
    }

}
