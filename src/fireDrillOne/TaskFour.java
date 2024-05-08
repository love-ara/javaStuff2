package fireDrillOne;

public class TaskFour {
    public static void main(String[] args){
    int number = 10;
    int count = 1;
    int multiple;
        for (int index = 0; index <= number; index++) {
        if(count % 4 == 0) {
            multiple = count;
            System.out.println(multiple);
            }
        count++;

    }
}
}
