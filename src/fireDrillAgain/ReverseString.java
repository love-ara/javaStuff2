package fireDrillAgain;

public class ReverseString {

        public String reverser(String input) {
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }


    public String reverse(String input) {
        String reversed = "";
        int length = input.length();

        for (int index = length - 1; index >= 0; index--) {
            if (input.charAt(index) == ' ' || index == 0) {
                int firstIndex = (index == 0) ? 0 : index + 1;
                String word = input.substring(firstIndex, length);
                reversed+=(word);

                if (index > 0) {
                    reversed+=(" ");
                }
                length = index;
            }
        }
        return reversed;
    }




    public String upSideDownReverse(String arr) {
        StringBuilder reverse = new StringBuilder();
        for (int i = arr.length() - 1; i >= 0; i--) {
            reverse.append(arr.charAt(i));
        }
        return reverse.toString();
    }



}




