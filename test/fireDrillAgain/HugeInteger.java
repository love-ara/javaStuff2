package fireDrillAgain;

import java.util.Arrays;


public class HugeInteger {
    private static final int MAX_DIGITS = 40;
    private final int[] digits = new int[MAX_DIGITS];
    private int classIndex;
    private int sign;


    public HugeInteger() {
        this("0");
    }

    public HugeInteger(String number) {
        parse(number);
    }











    public HugeInteger add(HugeInteger val) {
        HugeInteger val1 = new HugeInteger(toString());
        HugeInteger val2 = new HugeInteger(val.toString());
        HugeInteger result = new HugeInteger();

        if (val1.sign == 1 && val2.sign == -1)
            return val1.subtract(val2);
        else if (val1.sign == -1 && val2.sign == 1) {
            result = val1.subtract(val2);
            result.sign = -1;
            return result;
        }

        int up = 0;

        for (int i = 0; i < MAX_DIGITS; i++) {
            int number = this.getDigit(i) + val.getDigit(i) + up;

            result.setDigit(i, number % 10);

            up = number / 10;
        }

        result.findDigit();

        return result;
    }

    public HugeInteger subtract(HugeInteger integer) {
        HugeInteger val1 = new HugeInteger(toString());
        HugeInteger val2 = new HugeInteger(integer.toString());
        HugeInteger result = new HugeInteger();

        for (int i = 0; i < MAX_DIGITS; i++) {
            int number = val1.getDigit(i) - val2.getDigit(i);

            if (number < 0) {
                int proxIndex = i + 1;

                while (val1.getDigit(proxIndex) == 0 && proxIndex < val1.classIndex)
                    proxIndex++;

                if (proxIndex <= val1.classIndex) {
                    val1.setDigit(proxIndex, val1.getDigit(proxIndex) - 1);

                    while (--proxIndex > i)
                        val1.setDigit(proxIndex, 9);

                    val1.setDigit(i, val1.getDigit(i) + 10);

                    number = val1.getDigit(i) - val2.getDigit(i);
                } else {
                    number = val2.getDigit(i) - val1.getDigit(i);
                    sign = -1;
                }
            }

            result.setDigit(i, number % 10);
        }

        result.findDigit();

        return result;
    }

    private void findDigit() {
        for (int index = MAX_DIGITS - 1; index >= 0; index--) {
            if (getDigit(index) != 0) {
                classIndex = index;
                break;
            }
        }
    }

    public int[] parse(String number) {
        int len = number.length();

        if (len > MAX_DIGITS)
            throw new IllegalArgumentException("Number must be at most 40 digits");

        if (number.charAt(0) == '-') {
            sign = -1;
            classIndex = len - 2;
        } else
            classIndex = len - 1;

        for (int i = 0; i < len; i++) {
            char digit = number.charAt(len - i - 1);

            if (Character.isDigit(digit))
                digits[i] = digit - '0';
        }
        return digits;
    }



    private int getDigit(int index) {
        return digits[index];
    }

    private void setDigit(int index, int number) {
        digits[index] = number;
    }

    @Override
    public String toString() {
        StringBuilder integer = new StringBuilder(sign < 0 ? "-" : "");

        for (int i = classIndex; i >= 0; i--)
            integer.append(digits[i]);

        return integer.toString();
    }



    private boolean isZero() {
        for (int index = 0; index < MAX_DIGITS; index++) {
            if (digits[index] == 0) {
                return true;
            }
        }
        return false;
    }



    public boolean isEqual(HugeInteger others) {
        return Arrays.equals(digits, others.digits);
    }

    public boolean isNotEqual(HugeInteger others) {
        return !Arrays.equals(digits, others.digits);
    }

    public boolean isGreaterThan(HugeInteger other) {
        return compareTo(other) > 0;
    }
    public boolean isGreaterThanOrEqualTo(HugeInteger other) {
        return compareTo(other) >= 0;
    }
     public boolean isLesserThan(HugeInteger other) {
        return compareTo(other) < 0;
    }
    boolean isLesserThanOrEqualTo(HugeInteger other) {
        return compareTo(other) <= 0;
    }


    private int compareTo(HugeInteger other) {
        for(int index = 0; index < MAX_DIGITS; index++){
            if(digits[index] > other.digits[index]){
                return 1;
            }else if(digits[index] < other.digits[index]){
                return -1;
            }
        }
        return 0;
    }
}

