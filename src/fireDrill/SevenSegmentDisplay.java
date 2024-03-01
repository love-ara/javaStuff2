package fireDrill;

public class SevenSegmentDisplay {
        private boolean isOn;

        public String printSevenSegment(String digits){
            validateDigit(digits);
            changeStatus(digits);

            return switch(digits){
                case "11111101" -> printZero();
                case "01100001" -> printOne();
                case "11011011" -> printTwo();
                case "11110011" -> printThree();
                case "01100111" -> printFour();
                case "10110111" -> printFive();
                case "10111111" -> printSix();
                case "11100001" -> printSeven();
                case "11111111" -> printEight();
                case "11100111" -> printNine();
                default ->   printInvalid();
            };

        }

        private String printInvalid() {
            return "Invalid";
         }




        private String printNine() {
            return """
                    # # # # #
                    #       #
                    # # # # #
                            #
                    # # # # #
                    """;
        }

        private String printEight() {
            return """
                    # # # # #
                    #       #
                    # # # # #
                    #       #
                    # # # # #
                    """;
        }

        private String printSeven() {
            return """
                    # # # # #
                            #
                            #
                            #
                            #
                    """;
        }

        private String printSix() {
            return """
                    # # # # #
                    #
                    # # # # #
                    #       #
                    # # # # #
                    """;
        }

        private String printFive() {
            return """
                    # # # # #
                    #
                    # #  # #
                            #
                    # # # # #
                    """;
        }

        private String printFour() {
            return """
                    #   #
                    # # #
                        #
                        #
                    """;
        }

        private String printThree() {
            return """
                    # # # # #
                            #
                     # #  # #
                            #
                    # # # # #
                    """;
        }

        private String printTwo() {
            return """
                    # # # # #
                            #
                    # #  #  #
                    #
                    # # # # #
                    """;
        }

        private String printOne() {
           return """
                        #
                        #
                        #
                        #
                   """;
        }

        private String printZero() {
           return """
                    # # #  #
                    #      #
                    #      #
                    # # #  #
                    """;
        }

        private void print(String prompt){
            System.out.println(prompt);
        }

        private void changeStatus(String digits) {
            if (digits.charAt(7) == '0') isOn = false;
            else if (digits.charAt(7) == '1') isOn = true;
        }

        private void validateDigit(String digits) {
            if (!digits.matches("\\d+")) throw new NonDigitNumberException("Binary number must be only digits");
            if (!digits.matches("[0-1]+")) throw new NonBinaryNumberException("Binary number must consist of only 0s and 1s");
            if (digits.length() != 8) throw new IllegalArgumentException("Binary number must be 8 digits long");
        }

        boolean isOn(){
            return isOn;
        }
    }



