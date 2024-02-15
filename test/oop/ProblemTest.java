package oop;

import org.junit.jupiter.api.Test;
import oop.Person;
import oop.Problem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest {
    @Test
    public void addProblem(){
        Person person = new Person();
        Problem problem = new Problem("No fees", Type.FINANCIAL);
        person.addProblem(problem);
        assertEquals(1, person.getSizeOfProblem());
    }

    @Test
    public void problemCanBeSolvedTest(){
        Person person = new Person();
        Problem problem = new Problem("No fees", Type.FINANCIAL);
        person.solveProblem(problem);
        assertEquals(0,  person.getSizeOfProblem());
    }

    @Test
    public void problemsCanBeRecounted(){
        Person person = new Person();
        Problem problem = new Problem("Nightmares", Type.SPIRITUAL);
        person.addProblem(problem);

        Problem problem1 = new Problem("No fees", Type.EDUCATION);
        person.addProblem(problem1);
        person.recountProblem();
        String[] expected = {"Nightmares : Type.SPIRITUAL", "No fees : Type.EDUCATION"};
        assertEquals(expected, person.recountProblem());
    }
}
