public class Product {
    private int id;
    private String name;
    private String detail;
    private double discount;
    private double unitPrice;

    public Product() {
        System.out.println("Ben Çalıştım.");
    }

    public Product(int id, String name, String detail, double discount, double unitPrice) {
        this();
        this.id = id;
        this.name = name;
        this.unitPrice = id;
        this.discount = id;

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

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

}
