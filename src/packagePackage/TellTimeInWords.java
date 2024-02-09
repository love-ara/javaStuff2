package packagePackage;

public class TellTimeInWords {
    private static final String[] hours = {"twelve", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven"};
    private static final String[] minutes = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
            "twenty", "thirty", "fourth", "fifty"};
    private static final int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 30, 40, 50};


    public static String minuteToWord(int minute){
        if(minute < 0 || minute > 59) {
            throw new IllegalArgumentException("""    
            Invalid time. Minute should be between 1 and 59""");
        }
        String word = "";
        for(int index = 0; index <  numbers.length; index++) {
            boolean minutesIsWithInRange = minute > 19 && minute%10 != 0;
            if (minutesIsWithInRange && minute >= numbers[index]){
                word += numbers[index ] + " ";
                minute -= numbers[index];
            }else if(minute == numbers[index]){
                word += minutes[index];
                minute -= numbers[index];
            }
        }
        String minuteInWord = (minute == 1) ? " minute" : " minutes";
        return word +  minuteInWord;
    }

    public static String timeToWords(int hour, int minute) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            throw new IllegalArgumentException("""    
            Invalid time. Hour is between 1 and 23.
            Minute should be between 1 and 59""");
        }
        String hourInWord = hours[hour % 12];
        String minuteInWord;

        if (minute == 0) {
            minuteInWord = "o'clock";
        } else if (minute == 15) {
            minuteInWord = "quarter past";
        } else if (minute == 30) {
            minuteInWord = "half past";
        } else if (minute == 45) {
            minuteInWord = "quarter to";
            hourInWord = hours[(hour + 1) % 12];
        } else if (minute < 30) {
            minuteInWord = minutes[minute];
            minuteInWord += (minute == 1) ? " minute past" : " minutes past";
        } else {
            minuteInWord = minutes[60 - minute];
            minuteInWord += (minute == 59) ? " minute to" : " minutes to";
            hourInWord = hours[(hour + 1) % 12];
        }

        return minuteInWord + " " + hourInWord;
    }


}
