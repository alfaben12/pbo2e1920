package quiz2;

public class Results {
    private String angka1;
    private String angka2;
    private String operator;
    private String hasil;
    
    public Results(String angka1, String angka2, String operator, String hasil) {
        this.angka1 = angka1;
        this.angka2 = angka2;
        this.operator = operator;
        this.hasil = hasil;
    }

    public String getAngka1() {
        return angka1;
    }

    public String getAngka2() {
        return angka2;
    }

    public String getOperator() {
        return operator;
    }
    
    public String getHasil() {
        return hasil;
    }
}
