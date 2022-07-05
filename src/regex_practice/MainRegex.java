package regex_practice;
import regex_practice.task7.RegexIpChecker;

import java.util.Scanner;

class MainRegex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println("\n");
            System.out.println(IP.matches(new RegexIpChecker().pattern));
        }
    }
}
