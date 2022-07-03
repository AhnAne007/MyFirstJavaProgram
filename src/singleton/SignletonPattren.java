package singleton;

public class SignletonPattren {
    static SignletonPattren obj = new SignletonPattren();
    String something;
    Integer Count;
    private SignletonPattren() {
        something = "Hello World";
        Count = 0;
    }

    public static SignletonPattren getInstance(){
        obj.Count = obj.Count + 1;
        return obj;
    }

    public Integer getCount() {
        return Count;
    }
}
