package ua.lviv.lgs;

public class Сlothes {
    private String name;
    private String dept;
    private int size;
    private int kind_of_clothes;
    private int tissue;
    private int producer;
    private int type;
    private int price;

    public Сlothes(String name, String dept, int size, int kind_of_clothes, int tissue, int producer, int type, int price) {
        this.name = name;
        this.dept = dept;
        this.size = size;
        this.kind_of_clothes = kind_of_clothes;
        this.tissue = tissue;
        this.producer = producer;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getKind_of_clothes() {
        return kind_of_clothes;
    }

    public void setKind_of_clothes(int kind_of_clothes) {
        this.kind_of_clothes = kind_of_clothes;
    }

    public int getTissue() {
        return tissue;
    }

    public void setTissue(int tissue) {
        this.tissue = tissue;
    }

    public int getProducer() {
        return producer;
    }

    public void setProducer(int producer) {
        this.producer = producer;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Сlothes{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", size=" + size +
                ", kind_of_clothes=" + kind_of_clothes +
                ", tissue=" + tissue +
                ", producer=" + producer +
                ", type=" + type +
                ", price=" + price +
                '}';
    }
}