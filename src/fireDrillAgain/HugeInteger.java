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


    public HugeInteger add(HugeInteger firstValue) {
        HugeInteger val1 = new HugeInteger(toString());
        HugeInteger val2 = new HugeInteger(firstValue.toString());
        HugeInteger result = new HugeInteger();

        if (val1.sign == 1 && val2.sign == -1)
            return val1.subtract(val2);
        else if (val1.sign == -1 && val2.sign == 1) {
            result = val1.subtract(val2);
            result.sign = -1;
            return result;
        }

        int sumUp = 0;

        for (int index = 0; index < MAX_DIGITS; index++) {
            int number = this.getDigit(index) + firstValue.getDigit(index) + sumUp;

            result.setDigit(index, number % 10);

            sumUp = number / 10;
        }

        result.findDigit();

        return result;
    }

    public HugeInteger subtract(HugeInteger integer) {
        HugeInteger val1 = new HugeInteger(toString());
        HugeInteger val2 = new HugeInteger(integer.toString());
        HugeInteger result = new HugeInteger();

        for (int index = 0; index < MAX_DIGITS; index++) {
            int number = val1.getDigit(index) - val2.getDigit(index);

            if (number < 0) {
                int proxIndex = index + 1;

                while (val1.getDigit(proxIndex) == 0 && proxIndex < val1.classIndex)
                    proxIndex++;

                if (proxIndex <= val1.classIndex) {
                    val1.setDigit(proxIndex, val1.getDigit(proxIndex) - 1);

                    while (--proxIndex > index)
                        val1.setDigit(proxIndex, 9);

                    val1.setDigit(index, val1.getDigit(index) + 10);

                    number = val1.getDigit(index) - val2.getDigit(index);
                } else {
                    number = val2.getDigit(index) - val1.getDigit(index);
                    sign = -1;
                }
            }

            result.setDigit(index, number % 10);
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

        for (int index = 0; index < len; index++) {
            char digit = number.charAt(len - index - 1);

            if (Character.isDigit(digit))
                digits[index] = digit - '0';
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

        for (int index = classIndex; index >= 0; index--)
            integer.append(digits[index]);

        return integer.toString();
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
    boolean isZero(HugeInteger other) {
        return compareTo(other) == 0;
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

    public HugeInteger multiply(HugeInteger firstValue) {
        HugeInteger val1 = new HugeInteger(toString());
        HugeInteger val2 = new HugeInteger(firstValue.toString());
        HugeInteger result = new HugeInteger();

        for (int index = 0; index < MAX_DIGITS; index++) {
            int number = val1.getDigit(index) * val2.getDigit(index);

            if (number < 0) {
                int proxIndex = index + 1;

                while (val1.getDigit(proxIndex) == 0 && proxIndex < val1.classIndex)
                    proxIndex++;

                if (proxIndex <= val1.classIndex) {
                    val1.setDigit(proxIndex, val1.getDigit(proxIndex) - 1);

                    while (--proxIndex > index)
                        val1.setDigit(proxIndex, 9);

                    val1.setDigit(index, val1.getDigit(index) + 10);

                    number = val1.getDigit(index) * val2.getDigit(index);
                } else {
                    number = val2.getDigit(index) * val1.getDigit(index);
                    sign = -1;
                }
            }

            result.setDigit(index, number % 10);
        }

        result.findDigit();

        return result;

        }
}

