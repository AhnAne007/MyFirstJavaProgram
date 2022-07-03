package task2;

public class SubStringClass {
    String sampleString;

    public SubStringClass(String sampleString) {
        this.sampleString = sampleString;
    }

    public SubStringClass() {
    }

    public String getSampleString() {
        return sampleString;
    }

    public void setSampleString(String sampleString) {
        this.sampleString = sampleString;
    }

    public String returnSubstring(int start, int end){
        return sampleString.substring(start, end);
    }
}
