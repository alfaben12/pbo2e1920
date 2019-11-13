package praktikum;

public class Owner {
    public void pay(IPayAble p) {
        System.out.println("Total payment:  " + p.getPaymentInfo());

        if (p instanceof ElectricityBill) {
            ElectricityBill eb = (ElectricityBill) p;
            System.out.println("" + eb.getBillInfo());
        } else if (p instanceof PermanentEmployee) {
            PermanentEmployee pEmp = (PermanentEmployee) p;
            pEmp.getEmployeeInfo();
            System.out.println("" + pEmp.getEmployeeInfo());
        }
    }

    public void showMyEmployee(Employee e) {
        System.out.println("" + e.getEmployeeInfo());

        if (e instanceof PermanentEmployee) {
            System.out.println("No have to pay her/him monthly");
        } else {
            System.out.println("No need to pay her/him :)");
        }
    }
}
