package praktikum;

public class ElectricityBill implements IPayAble {
    private int kwh;
    private String category;

    public ElectricityBill(int kwh, String category){
        this.kwh = kwh;
        this.category = category;
    }

    public int getKwh() {
        return kwh;
    }

    public void setKwh(int kwh) {
        this.kwh = kwh;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getBasePrice(){
        int bPrice = 0;

        switch (this.category){
            case "R-1":
                bPrice = 100;
                break;
            case "R-2":
                bPrice = 200;
                break;
        }
        return bPrice;
    }

    @Override
    public int getPaymentInfo() {
        return kwh * getBasePrice();
    }

    public String getBillInfo(){
        return "Kwh: " + this.kwh + "\n" +
                "Category: " + this.category + "(" + getBasePrice() + " per kWH)";
    }
}
