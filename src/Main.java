import oop_practice.OopAccessModifiers;
import task1.StringOperations;
import task2.SubStringClass;
import task3.stringTask3;
import task4.PalindromClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        //Task # 1
//        StringOperations obj = new StringOperations("hello", "java");
//        System.out.println(obj.calculateTotalCount());
//        int result = obj.compareStrings();
//        if (result == -1)
//        {
//            System.out.print("No\n");
//        }
//        else if (result == 1)
//        {
//            System.out.print("Yes\n");
//        }
//        else
//        {
//            System.out.print("Strings are same\n");
//        }
//
//        System.out.println(obj.returnNewString());
//
//        //Task # 2
//        int S;
//        int E;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Starting point");
//        S = sc.nextInt();
//        System.out.println("Enter the Ending Point");
//        E = sc.nextInt();
//        SubStringClass obj2 = new SubStringClass("Helloworld");
//        System.out.println(obj2.returnSubstring(S, E));
//
//        //Task # 3
//        stringTask3 obj3 = new stringTask3("welcometojava");
//        obj3.setSmallAndLargest(3);
//        System.out.println("Smallest = "+obj3.getSubStringSmall()+"\n"+"Largest = "+obj3.getSubStringLarge());
//
//        //Task # 4
//        PalindromClass obj4 = new PalindromClass("madam");
//        if (obj4.checkPalindrom()){
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("No");
//        }

        OopAccessModifiers obj = new OopAccessModifiers();
        //obj.printAttributes();
        System.out.println(obj.variableFirst);
//        System.out.println(obj.variableSecond); ERROR
//        System.out.println(obj.variableThird); ERROR
//        System.out.println(obj.variableFourth); ERROR
        //Above lines will not compile as because of the properties of certain
        //access modifiers.

    }
}


