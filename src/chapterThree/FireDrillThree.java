package chapterThree;


import java.util.Scanner;

public class FireDrillThree {


    public  void taskOne(int score1, int score2, int score3, int score4, int score5, int score6, int score7, int score8, int score9, int score10){
        int[] scores = {score1, score2, score3, score4, score5, score6, score7, score8, score9, score10};

            for(int score : scores) {
                System.out.print(score + " ");
            }
        }

    public  void taskTwo(int score1, int score2, int score3, int score4, int score5, int score6, int score7, int score8, int score9, int score10){
        int[] scores = {score1, score2, score3, score4, score5, score6, score7, score8, score9, score10};

             for(int score : scores) {
                  System.out.println(score);
        }
    }

    public  void taskThree(int score1, int score2, int score3, int score4, int score5, int score6, int score7, int score8, int score9, int score10){
        int[] scores = {score1, score2, score3, score4, score5, score6, score7, score8, score9, score10};

        for(int score : scores) {
            System.out.print(score + " ");
        }
    }

    public int[] taskFour(int[] scores){
        int length = scores.length;
        if(length % 2 != 0){
            length = (scores.length / 2) + 1;
        }else{
            length = scores.length/ 2;
        }
        int[] array = new int[length];
        int count = 0;
        for(int index = 0; index < scores.length; index+=2){
            array[count] = scores[index];
            count++;
        }
        return array;
    }

    public int[] taskFive(int[] scores){
        int length = scores.length;
        if(length%2 != 0){
            length = (scores.length / 2) + 1;
        }else{
            length = scores.length/ 2;
        }
        int[] array = new int[length];
        int count = 0;
        for(int index = 1; index < scores.length; index+=2){
            array[count] = scores[index];
            count++;
        }
        return array;
         }



    }



