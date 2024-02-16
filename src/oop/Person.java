package oop;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public List<Problem> problems = new ArrayList<>();


    public void addProblem(Problem problem){
        problems.add(problem);
    }

    public void solveProblem(Problem problem){
        problems.remove(problem);
    }

    public int getSizeOfProblem(){
        return problems.size();
    }

    public List<Problem> recountProblem(){
        System.out.println(problems);
        return problems;
    }
}
