package arraysAndPhonebook;

import java.util.Scanner;

public class Mbti {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Personality Test: Section 1");

        String[][] eI = new String[5][2];
        eI[0][0] = "A.Expend energy, enjoy groups";
        eI[0][1] = "B.Conserve energy, enjoy one-on-one ";
        eI[1][0] = "A.More outgoing,think out loud";
        eI[1][1] = "B.More reserved,think to yourself";
        eI[2][0] = "A.Seek many task,public activities,interaction with others";
        eI[2][1] = "B.Seek private,solitary activities with quiet to concentrate";
        eI[3][0] = "A.External,communicative,express yourself";
        eI[3][1] = "B.Internal,reticent,keep to yourself";
        eI[4][0] = "A.Active,initiate";
        eI[4][1] = "B.Reflective,deliberate";
        char[] answer = new char[5];
        for (int i = 0; i <= 4; i++) {
            System.out.printf("%s%n", eI[i][0]);
            System.out.printf("%s%n", eI[i][1]);
            System.out.println();
            System.out.println("Enter A or B");
            char userInput = input.nextLine().toCharArray()[0];
            if (userInput == 'A' || userInput == 'a') {
                answer[i] = 'A';

            } else if
            (userInput == 'B' || userInput == 'b') {
                answer[i] = 'B';
            } else {
                System.out.println("Error entered!!");
            }
        }
        int aCount = 0;
        int bCount = 0;
        for (char c : answer) {
            if (c == 'A') {
                aCount++;
            } else
                bCount++;
        }

        if (aCount > bCount) {
            System.out.println("You are Extroverted.");
        } else {
            System.out.println("You are Introverted.");
        }
        System.out.println();
        System.out.println("Section 2:");
        System.out.println();
        String[][] sAndN = new String[5][2];
        sAndN[0][0] = "A.Interpret literally.";
        sAndN[0][1] = "B.Look for meaning and possibilities.";
        sAndN[1][0] = "A.Practical,realistic, experimental.";
        sAndN[1][1] = "B.Imaginative,innovation,theoretical.";
        sAndN[2][0] = "A.Standard,usual,conventional.";
        sAndN[2][1] = "B.Different,novel,unique.";
        sAndN[3][0] = "A.Focus on here-and-now.";
        sAndN[3][1] = "B.Look to the future,global perspective.";
        sAndN[4][0] = "A.Facts,things.";
        sAndN[4][1] = "B.Ideas,dreams,philosophical.";

        for (int j = 0; j <= 4; j++) {
            System.out.printf("%s%n", sAndN[j][0]);
            System.out.printf("%s%n", sAndN[j][1]);
            System.out.println();
            System.out.println("Enter A or B");
            int userInput = input.nextLine().toCharArray()[0];
            if (userInput == 'A' || userInput == 'a') {
                answer[j] = 'A';
            } else if
            (userInput == 'B' || userInput == 'b') {
                answer[j] = 'B';
            } else {
                System.out.println("Error Entered!!");
            }
        }
        for (char c : answer) {
            if (c == 'A') {
                aCount++;
            } else
                bCount++;
        }
        if (aCount > bCount) {
            System.out.println("You are Sensitive.");
        } else {
            System.out.println("You are Intuitive.");
        }
        System.out.println();
        System.out.println("Section 3:");
        System.out.println();
        String[][] tAndF = new String[5][2];
        tAndF[0][0] = "A.Logical,thinking,questioning.";
        tAndF[0][1] = "B.Empathetic,feeling,accommodating.";
        tAndF[1][0] = "A.Candid,straight forward,frank.";
        tAndF[1][1] = "B.Tactful,kind,encourage.";
        tAndF[2][0] = "A.Firm,tend to criticize,hold the line.";
        tAndF[2][1] = "B.Gentle,tend to appreciate,conciliate.";
        tAndF[3][0] = "A.Tough-minded,just.";
        tAndF[3][1] = "B.Tender-hearted,merciful";
        tAndF[4][0] = "A.Matter of fact, issue-oriented";
        tAndF[4][1] = "B.Sensitive,people-oriented,compassionate";
        for (int i = 0; i <= 4; i++) {
            System.out.printf("%s%n", tAndF[i][0]);
            System.out.printf("%s%n", tAndF[i][1]);
            System.out.println();
            System.out.println("Enter A or B");
            char userInput = input.nextLine().toCharArray()[0];
            if (userInput == 'A' || userInput == 'a') {
                answer[i] = 'A';
            } else if (userInput == 'B' || userInput == 'b') {
                answer[i] = 'B';
            } else {
                System.out.println("Error Entered!!");
            }
            System.out.println();
        }
        for (char c : answer) {
            if (c == 'A') {
                aCount++;
            } else
                bCount++;
        }
        if (aCount > bCount) {
            System.out.println("You are a thinker.");
        } else {
            System.out.println("You  are flexible.");
        }
        System.out.println();
        System.out.println("Section 4:");
        System.out.println();
        String[][] jAndP = new String[5][2];
        jAndP[0][0] = "A.Organized,orderly.";
        jAndP[0][1] = "B.Flexible,adaptable.";
        jAndP[1][0] = "A.Plan,schedule.";
        jAndP[1][1] = "B.Unplanned,spontaneous.";
        jAndP[2][0] = "A.Regulated,structured.";
        jAndP[2][1] = "B.Easygoing live and lets live.";
        jAndP[3][0] = "A.Preparation,plan ahead.";
        jAndP[3][1] = "B.Go with the flow,adapt as you go.";
        jAndP[4][0] = "A.Control,govern.";
        jAndP[4][1] = "B.Latitude,freedom";
        for (int i = 0; i <= 4; i++) {
            System.out.printf("%s%n", jAndP[i][0]);
            System.out.printf("%s%n", jAndP[i][1]);
            System.out.println();
            System.out.println("Enter A or B");
            char userInput = input.nextLine().toCharArray()[0];
            if (userInput == 'A' || userInput == 'a') {
                answer[i] = 'A';
            } else if (userInput == 'B' || userInput == 'b') {
                answer[i] = 'B';
            } else {
                System.out.println("Error entered!");
            }
        }
        for (char c : answer) {
            if (c == 'A') {
                aCount++;
            } else
                bCount++;
        }
        if (aCount > bCount) {
            System.out.println("You are judgemental.");
        } else {
            System.out.println("You are prospective driven.");
        }
    }
}