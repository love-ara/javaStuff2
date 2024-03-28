package arraysAndPhonebook;


public class StudentGrade {
    private int[][] grades;


    public void setGrades(int[][] grades) {
        this.grades = grades;
    }

    public int getTotal(int... scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total;
    }

    public double getAverage(int... scores) {
        int total = 0;
        double average = 0.0;
        for (int score : scores) {
            total += score;
            average = (double) total / scores.length;
        }
        return average;
    }

    public int position(int... scores) {
        int position = 0;
        int total = 0;
        double average = 0.0;
        for (int score : scores) {
            total += score;
            average = (double) total / scores.length;
        }
        for (int[] grade : grades) if (average < getAverage(scores)) position++;
        return position;
    }

    public int overAllTotal(int numberOfSubject) {
        int overAllTotal = 0;
        for (int[] student : grades) overAllTotal += student[numberOfSubject];
        return overAllTotal;
    }

    public double overAllAverage(int numberOfSubject) {
        return (double) overAllTotal(numberOfSubject) / grades.length;
    }

    public int getHighestScore(int numberOfSubject) {
        int highestGrade = 0;
        for (int[] grade : grades) if (grade[numberOfSubject] > highestGrade) highestGrade = grade[numberOfSubject];

        return highestGrade;
    }

    public int getLowestScore(int numberOfSubject) {
        int lowestGrade = getHighestScore(numberOfSubject);
        for (int[] student : grades) if (student[numberOfSubject] < lowestGrade) lowestGrade = student[numberOfSubject];

        return lowestGrade;
    }

    public int getNumberOfPasses(int numberOfSubject) {
        int pass = 0;
        for (int[] numberOfStudent : grades) if (numberOfStudent[numberOfSubject] >= 50) pass++;
        return pass;
    }


    public int getNumbersOfFail(int numberOfSubject) {
        int fail = 0;
        for (int[] numberOfStudent : grades) if (numberOfStudent[numberOfSubject] < 50) fail++;
        return fail;
    }

    public void getHardestSubject() {
        int hardestSubject = 0;
        int fail = 0;
        for (int[] numberOfStudent : grades) {
            for (int numberOfSubject = 0; numberOfSubject < numberOfStudent.length; numberOfSubject++) {
                if (getNumbersOfFail(numberOfSubject) > fail) {
                    hardestSubject = numberOfSubject + 1;
                    fail = getNumbersOfFail(numberOfSubject);
                }
            }
        }


    }
}

















