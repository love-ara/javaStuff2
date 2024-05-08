package fireDrillOne;

public class TaskSix {
    public static void main(String[] args){
        int number = 10;
        int multiple = 1;

        for(int index = 1; index <= number; index++){
            for(int index2 = 1; index2 <=5; index2++) {
                if (index % 4 == 0) {
                    multiple *= index;
                    System.out.print(STR."\{multiple} ");

                }

            }

            multiple = 1;
        }


    }

    }



