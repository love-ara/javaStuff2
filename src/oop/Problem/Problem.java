package oop.Problem;

public class Problem {
    private String name;
    private Type type;
    private boolean isSolved;

    public Problem(String name, Type type){
        this.name = name;
        this.type = type;
    }
    public String toString(){
        return String.format("%s : %s", name, type);
    }
}
