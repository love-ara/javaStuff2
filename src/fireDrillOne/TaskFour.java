package fireDrillOne;

public class TaskFour {
    public static void main(String[] args){
    int number = 10;
    int count = 1;
    int even = 0;
    int odd = 0;
    int multiple = 0;
        for (int index = 0; index <= number; index++) {
        if(count % 4 == 0) {
            multiple = count;
            System.out.println(multiple);
            }
        count++;

    }
}
}
