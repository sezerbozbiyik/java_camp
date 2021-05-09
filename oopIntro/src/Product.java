public class Product {
    private int id;
    private String name;
    private String detail;
    private double discount;
    private double unitPrice;

    public Product() {
        System.out.println("Ben Çalıştım.");
    }

    public Product(int id, String name, String detail, double unitPrice, double discount) {
        this();
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.discount = discount;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getUnitPriceAfterDiscount() {
        return this.unitPrice-(this.unitPrice * (discount / 100));
    }

}
