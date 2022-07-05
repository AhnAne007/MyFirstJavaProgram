package oop_practice.accessing_attributes_in_oopaccessmodifiers;

import oop_practice.OopAccessModifiers;

public class UsingAttributes extends OopAccessModifiers {

    public void printAttributes(){
        System.out.println(variableFirst);
        System.out.println(variableSecond);
//        System.out.println(variableThird); ERROR
//        System.out.println(variableFourth); ERROR
//        Above lines will give errors due to the properties of attributes in OopAccessModifiers

    }

}

