package phan1.bai1;

public class Bill {

    private int id;
    private String name;
    private int money;
    private String date;  // format: yyyy-MM-dd, ngày lập hóa đơn

    public Bill(int id, String name, int money, String date) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
