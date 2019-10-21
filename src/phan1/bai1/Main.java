package phan1.bai1;

public class Main {
    public static void main(String[] args) {
        ManagerPeople managerPeople = new ManagerPeople();
        // Hàm input
        managerPeople.inPutIndorm();

        // Hàm sort theo tiền
        //  managerPeople.sortMoney();

        //Hàm get ra hóa đơn
        //  managerPeople.getDataDatebill();

        // Trả ra list ngày có hoa đơn
//        for (int i = 0; i < managerPeople.getDataDatebill().size(); i++) {
//            System.out.print("[" + managerPeople.getDataDatebill().get(i) + "]");
//        }
        //  managerPeople.getMoney();
        // managerPeople.outPut();
        managerPeople.getDataBill();
    }
}
