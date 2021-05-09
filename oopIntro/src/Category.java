public class Category {
    
    private int id;
    private String name;

    public Category() {
    }

    public Category(int id , String name){
        this(); // classdaki parametresiz ctor çalışır
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id=id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
