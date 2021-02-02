package ecamenordinaria.model;

public class Product {
    private final String name;
    private final String category;
    private boolean mark;

    public Product(String name, String category) {
        this.mark = false;
        this.name = name;
        this.category = category;
    }

    public Product() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public boolean getMark() {
        return mark;
    }

    public void setMark(boolean mark) {
        this.mark = mark;
    }
    
}
