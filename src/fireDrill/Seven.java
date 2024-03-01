package fireDrill;

public class Seven{

    public String[][] digit = new String[5][4];

    public void setSpace() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                digit[i][j] = "  ";
            }
        }
    }

    public void setA() {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 4; j++) {
                digit[i][j] = "* ";
            }
        }
    }

    public void setB() {
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 4; j++) {
                digit[i][j] = "* ";
            }
        }
    }

    public void setC() {
        for (int i = 2; i < 5; i++) {
            for (int j = 3; j < 4; j++) {
                digit[i][j] = "* ";
            }
        }
    }

    public void setD() {
        for (int i = 4; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                digit[i][j] = "* ";
            }
        }
    }

    public void setE() {
        for (int i = 2; i < 5; i++) {
            for (int j = 0; j < 1; j++) {
                digit[i][j] = "* ";
            }
        }
    }

    public void setF() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                digit[i][j] = "* ";
            }
        }
    }

    public void setG() {
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                digit[i][j] = "* ";
            }
        }
    }

    public void displaySegment(String input) {
        setSpace();
        if (input.length() >= 8 && input.charAt(7) == '1') {
            if (input.charAt(0) == '1') {
                setA();
            }
            if (input.charAt(1) == '1') {
                setB();
            }
            if (input.charAt(2) == '1') {
                setC();
            }
            if (input.charAt(3) == '1') {
                setD();
            }
            if (input.charAt(4) == '1') {
                setE();
            }
            if (input.charAt(5) == '1') {
                setF();
            }
            if (input.charAt(6) == '1') {
                setG();
            }
        }
        showSegment();
    }

    public void showSegment() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(digit[i][j]);
            }
            System.out.println();
        }
    }
}
