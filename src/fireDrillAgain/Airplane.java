package fireDrillAgain;

public class Airplane {
    public int speed;

    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.speed = 10;
        Airplane airplane2 = new Airplane();
        airplane2.setSpeed(10);

        System.out.println(airplane.speed);
        System.out.println(airplane2.getSpeed());

        Jet jet = new Jet();
        jet.speed = 200;
        System.out.println(jet.speed);
        Jet jet2 = new Jet();
        jet2.setSpeed(200);
        System.out.println(jet2.getSpeed());

    }

   public Airplane(){

   }
   public void setSpeed(int speed){
       this.speed = speed;
   }
   public int getSpeed(){
       return speed;
   }

   static class Jet{
        public int speed;

        public Jet(){

        }

        public void setSpeed(int speed){
            this.speed = speed;
        }


       public int getSpeed(){
            return Multiplier.multiplier(speed);
        }



   }

    static class Multiplier{


        public static int multiplier(int speed){
            return 2 * speed;
        }
    }


}

