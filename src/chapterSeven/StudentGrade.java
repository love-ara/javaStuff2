package chapterSeven;

import java.util.Scanner;

public class StudentGrade {
    private int[][] grades;
    private int numberOfStudent;
    private int numberOfSubject;

    public static void main(String[] args) {
        StudentGrade grade = new StudentGrade();
        grade.menu();
    }

    public void menu(){
        collectInput();
        collectGradeInput();
    }

    public void setGrades(int[][] grades){
        this.grades = grades;
    }
    public void collectInput(){
        numberOfStudent = input("How many students do you have? ");
        numberOfSubject = input("How many subject do they offer? ");
        savedMessage();
        grades = new int[numberOfStudent][numberOfSubject];
    }

    public void collectGradeInput(){
        int[][] scores = new int[numberOfStudent][numberOfSubject];
        for (int index = 0; index < numberOfStudent; index++) {
            for (int index2 = 0; index2 < numberOfSubject; index2++) {
                print("Entering score for student " + (index + 1));
                int score = input("Enter score for subject " + (index2 + 1));
                savedMessage();

                while (score < 0 || score > 100){
                    print("Invalid score\nEntering score for student " + (index + 1));
                    score = input("Enter score for subject " + (index2 + 1));
                }
                scores[index][index2] = score;
            }
        }
        setGrades(scores);
    }

    private void savedMessage() {
        print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\nSaved successfully");
    }

    private int input(String prompt) {
        print(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private void print(String prompt){
        System.out.println(prompt);
    }



}