package task3;

public class stringTask3 {
    String subStringSmall;
    String subStringLarge;
    String sample;

    public stringTask3(String sample) {
        this.sample = sample;
    }

    public stringTask3() {
    }

    public stringTask3(String subStringA, String subStringB) {
        this.subStringSmall = subStringA;
        this.subStringLarge = subStringB;
    }

    public String getSubStringSmall() {
        return subStringSmall;
    }

    public void setSubStringSmall(String subStringSmall) {
        this.subStringSmall = subStringSmall;
    }

    public String getSubStringLarge() {
        return subStringLarge;
    }

    public void setSubStringLarge(String subStringLarge) {
        this.subStringLarge = subStringLarge;
    }

    public void setSmallAndLargest(int k){
        String temp = sample.substring(0,k+1);
        subStringLarge = sample.substring(0,k);
        subStringSmall = sample.substring(0,k);
        for (int i = 1; i <= sample.length()-k; i++){
            temp = sample.substring(i,i+k);
            if (subStringSmall.compareTo(temp) > 0){
                subStringSmall = temp;
            }
            if (subStringLarge.compareTo(temp) < 0)
            {
                subStringLarge = temp;
            }
            if (subStringLarge.compareTo(temp) == 0 && subStringSmall.compareTo(temp)==0)
            {
                subStringSmall = temp;
                subStringLarge = temp;
            }
        }

    }


}
