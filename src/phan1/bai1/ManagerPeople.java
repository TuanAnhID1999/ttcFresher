package phan1.bai1;

import java.util.*;

public class ManagerPeople {
    Scanner sc = new Scanner(System.in);
    ArrayList<Bill> listBill = new ArrayList();
    HashMap<String, List<Bill>> hashMap = new HashMap<>();

    // Ham inpput nhập dữ liệu
    public void inPutIndorm() {
        System.out.println("Nhâp số lượng thông tin hoa don.");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Mời bạn nhập ID cua khach hang " + i);
            int id = sc.nextInt();

            System.out.print("Mời bạn nhập Tên ");
            String name = sc.next();

            System.out.println("Mời bạn nhập số tiền");
            int money = sc.nextInt();

            System.out.println("Mời bạn nhập số ngày nhập.");
            String date = sc.next();

            Bill bill = new Bill(id, name, money, date);

            listBill.add(bill);
            hashMap.put(date, listBill);

        }

    }

//    public void outPut(){
//        for (Bill bill : listBill) {
//            System.out.println("Person:" + bill.getName() +  bill.getId() + bill.getDate() + bill.getMoney());
//        }
//
//    }

    // 3 Sắp xếp mảng List<Bill> theo thứ tự tăng dần của money.
    public void sortMoney() {
        // Sử dụng phương thức Collections.sort(List)
        // để sắp xếp một danh sách (List)
        Collections.sort(listBill, new PersonComparator());
        System.out.println("Danh sach bill sắp xếp theo tiền.");
        for (Bill bill : listBill) {
            System.out.println("Person:" + bill.getName() + " " + bill.getMoney());
        }

    }

    // 4 Hàm trả ra ngày nhập hóa đơn
    public List<String> getDataDatebill() {
        List<String> dates = new ArrayList<>();
        if (listBill.size() == 0) {
            return dates;
        } else {
            for (Bill element : listBill) {
                if (!dates.contains(element.getDate())) {
                    dates.add(element.getDate());

                }
            }
        }

        return dates;
    }


    //5 Hàm trả ra số tiền lớn hơn 1000000
    public List<Bill> getMoney() {
        System.out.println("Danh sách tiền  lớn hơn 1000000");
        ArrayList<Bill> bills = new ArrayList<>();
        int n = listBill.size();
        for (int i = 0; i < n; i++) {
            if (listBill.get(i).getMoney() > 1000000) {
                System.out.println("Person " + listBill.get(i).getName() + ", money :" + listBill.get(i).getMoney());
                Bill bill = listBill.get(i);
                bills.add(bill);
            }
        }

        if (bills.size() == 0) {
            System.out.println("Không tồn tại hóa đơn nào trên 1000000");

        }

        return bills;
    }


//    // Hàm lấy ra dữ liệu các hóa đơn của của 1 ngày\

    public void getDataBill() {
        HashMap<String, String> hashMap = new HashMap<>();
        if (listBill.size() == 0) {
            return;
        } else {

            for (int i = 0; i < listBill.size(); i++) {
                hashMap.put(listBill.get(i).getDate(), listBill.get(i).getName());
            }
        }

        // tạo 1 Set có tên là setHashMap
        // chứa toàn bộ các entry (vừa key vừa value)
        // của hashMap
        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();
        //PT để lấy giá trị key
        Iterator<String> iterator = hashMap.keySet().iterator();

        System.out.println("Các entry có trong setHashMap:");
        for (String values : hashMap.values()) {
            System.out.println("Date = " + iterator.next()+ " Bill of Name :" + values );
        }
      //  System.out.println("Date " + setHashMap);
    }

}
