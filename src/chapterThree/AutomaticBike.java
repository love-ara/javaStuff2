package chapterThree;

public class AutomaticBike {
    private boolean isOn;
    private int speed;
    private int gear;




    public boolean isEngineOn(){
        return isOn;
    }

    public void toggle(){
        isOn = !isOn;
        if (isOn) gear = 1;
    }



    public void changeGear(){
        if(speed >=0 && speed <=20){
            gear = 1;
        }
        if(speed>= 21 && speed <= 30){
            gear = 2;
        }
        if(speed >=31 && speed <= 40){
            gear = 3;
        }
        if (speed >= 41){
            gear = 4;
        }

    }

    public int getSpeed(){
        return speed;
    }

    public int getGear(){
        return gear;
    }

    public void accelerate() {
        if (isEngineOn() && getGear() == 1) speed++;

        if(isEngineOn() && getGear() == 2) speed +=2;

        if(isEngineOn() && getGear() == 3) speed +=3;

        if(isEngineOn() && getGear() == 4) speed +=4;

        changeGear();

    }

    public void decelerate(){
        if (isEngineOn() && getGear() == 1) speed--;

        if(isEngineOn() && getGear() == 2) speed -=2;

        if(isEngineOn() && getGear() == 3) speed -=3;

        if(isEngineOn() && getGear() == 4) speed -=4;

        changeGear();
    }

}

