package oop_practice;

public class OopAccessModifiers {
    //below all the attributes with different access modifiers.
    public int variableFirst = 5;
    protected int variableSecond = 10;
    private int variableThird = 15;
    int variableFourth = 20;

    public OopAccessModifiers() {
    }

    //below will be the method to test the above attributes.
    public void printAttributes(){
        System.out.println(variableFirst);
        System.out.println(variableSecond);
        System.out.println(variableThird);
        System.out.println(variableFourth);
    }

}

class Main2 {
    public static void main(String[] args) {
        OopAccessModifiers obj = new OopAccessModifiers();
        System.out.println(obj.variableFirst);
        System.out.println(obj.variableSecond);
        //System.out.println(obj.variableThird); ERROR
        //The above line cannot access the private member within same Package

        System.out.println(obj.variableFourth);
    }
}

