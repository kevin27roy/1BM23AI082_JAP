import java.util.Vector;

class Product {
    String name;
    int price;
    String category;

    public Product(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}

class OnlineShopping {
    Vector<Product> products = new Vector<>();

    public void addItem(String name, int price, String category) {
        Product product = new Product(name, price, category);
        products.add(product);
        System.out.println("Item added: " + name);
    }

    public static void main(String[] args) {
        OnlineShopping os = new OnlineShopping();
        os.addItem("Pencil", 5, "Stationery");
    }
}
