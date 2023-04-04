public class Year {
    public int toPrintInt = 2023;
    public String print() {
        String updateValue = String.format("\"---<%d>---\"%n", this.toPrintInt);
        System.out.println(toPrintInt);
        return updateValue;
    }
}