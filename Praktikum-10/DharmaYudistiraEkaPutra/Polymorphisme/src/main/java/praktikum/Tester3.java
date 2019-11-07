package praktikum;

public class Tester3 {
    PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
    InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
    ElectricityBill eBill = new ElectricityBill(5, "A-1");
    Employee[] e = {pEmp, iEmp};
    IPayAble[] p = {pEmp, eBill};
}
