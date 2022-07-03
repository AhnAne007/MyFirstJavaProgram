package task1;

public class StringOperations {
    //Capital name starts of
    private String firstString;
    private String secondString;
    private int totalCounter;

    public StringOperations(String firstString, String secondString) {
        this.firstString = firstString;
        this.secondString = secondString;
    }

    public String getFirstString() {
        return firstString;
    }

    public void setFirstString(String firstString) {
        this.firstString = firstString;
    }

    public String getSecondString() {
        return secondString;
    }

    public void setSecondString(String secondString) {
        this.secondString = secondString;
    }

    public int getTotalCounter() {
        return calculateTotalCount();
    }

    public void setTotalCounter(int totalCounter) {
        this.totalCounter = totalCounter;
    }

    public int calculateTotalCount()
    {
        totalCounter = firstString.length();
        totalCounter = totalCounter + secondString.length();
        return totalCounter;
    }

    public int compareStrings() {
        if(firstString.compareTo(secondString) < 0)
        {
            return -1;
        }
        else if (firstString.compareTo(secondString) > 0){
            return 1;
        }
        else {
            return 0;
        }
    }

    public String returnNewString(){
        String resultantString = changeFirstLetter(firstString);
        resultantString = resultantString + " ";
        resultantString = resultantString + changeFirstLetter(secondString);
        return resultantString;
    }

    public String changeFirstLetter(String str){
        if(str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
