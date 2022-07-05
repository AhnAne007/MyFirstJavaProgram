package regex_practice.task7;

public class RegexIpChecker {
    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    public String pattern = num + "." +  num + "." +  num + "." + num;
}
