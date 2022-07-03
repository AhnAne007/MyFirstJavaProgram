package task4;

public class PalindromClass {
    String sample;
    String reverse;

    public PalindromClass() {
    }

    public PalindromClass(String sample) {
        this.sample = sample;
        this.reverse = "";
    }

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public String getReverse() {
        return reverse;
    }

    public void setReverse(String reverse) {
        this.reverse = reverse;
    }

    public String reverseTheString(){
        for (int i = (sample.length()-1) ; i >= 0; i--){
            reverse = reverse + sample.charAt(i);
        }
        return reverse;
    }

    public boolean checkPalindrom(){
        if (reverseTheString().toLowerCase().equals(sample.toLowerCase())){
            return true;
        }
        else
        {
            return false;
        }
    }
}
