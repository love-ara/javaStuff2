package chapterSeven;

public class GradeBook {
    private String subject;
    private int[][] grades;


    public GradeBook(String subject, int[][] grades) {
        this.subject = subject;
        this.grades = grades;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void processGrades() {
        outputGrade();
        System.out.printf("%n%s %d%n%s %d%n%n", "Lowest grade", getMinimum(), "Highest grade ", getMaxi());
    }

    private int getMaxi() {
        int highGrade = grades[0][0];
        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade > highGrade) {
                    highGrade = grade;
                }
            }
        }
        return highGrade;
    }

    private int getMinimum() {
        int lowGrade = grades[0][0];
        for (int[] studentGrade : grades) {
            for (int grade : studentGrade) {
                if (grade < lowGrade) {
                    lowGrade = grade;
                }
            }
        }
        return lowGrade;
    }

    public double getAverage(int[] setOfGrades) {
        int total = 0;
        for (int grade : setOfGrades) {
            total += grade;
        }
        return (double) total / setOfGrades.length;
    }

    public void outputGrade() {
        System.out.printf("The grades are: %n%n");
        for (int test = 0; test < grades[0].length; test++) {
            System.out.printf("Test %d ", test + 1);
        }
        System.out.println("Average");
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);
            for (int test : grades[student]) {
                System.out.printf("%8d", test);
            }
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }
}
