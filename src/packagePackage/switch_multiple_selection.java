package packagePackage;
import java.util.Scanner;

public class switch_multiple_selection {
    public static void main(String[] args) {
        classGrades();


    }

    public static void classGrades(int... grades) {
        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        Scanner in = new Scanner(System.in);

        System.out.printf("%s%n%s%n     %s%n    %s%n", "Enter the integer grades in the range 0-100.", "Type the end-of-file indicator to terminate input:", "On UNIX/Linus/macOS type <Ctrl> d then press Enter", "On windows type <ctrl> z then press Enter");

        while (in.hasNext()) {
            int grade = in.nextInt();
            if(grade > 100 | grade < 0) System.out.println("Enter a valid grade, 1-100: ");  grade = in.nextInt();
            total += grade;
            ++gradeCounter;

            switch (grade / 10) {
                case 9:
                case 10:
                    ++aCount;
                    break;
                case 8:
                    ++bCount;
                    break;
                case 7:
                    ++cCount;
                    break;
                case 6:
                    ++dCount;
                    break;
                default:
                    ++fCount;
                    break;
            }

        }
        System.out.printf("%nGrade Report:%n");

        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;

            System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "Number of students who received each grade:", "A: ", aCount,
                    "B: ", bCount,
                    "C:  ", cCount,
                    "D: ", dCount,
                    "F: ", fCount);

        } else {
            System.out.println("No grades were entered");
        }

    }

}