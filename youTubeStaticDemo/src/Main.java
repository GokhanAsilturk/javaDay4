public class Main {

    public static void main(String[] args) {
    ProductManager productManager = new ProductManager();
    Product product = new Product();
    product.name = "Mouse";
    product.price = 500;
    productManager.add(product);

    DatabaseHelper.Crud.Update();
    }
}
