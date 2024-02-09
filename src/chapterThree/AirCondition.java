package chapterThree;

public class AirCondition {
        private boolean isOn;
        private int temp;

    public boolean isTurnedOn(){
        return isOn;
    }

    public void toggle(){
        isOn = !isOn;
        if(isOn){
            temp = 16;
        }
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
        if(isTurnedOn() && temp >= 16 && temp <= 30)
            temp--;

    }


    public int getTemp(){
        return temp;
    }

}
