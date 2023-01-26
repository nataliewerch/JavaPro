package homework3.level2.task1;

public interface ProductDatabase {
    void save(Product product);
    Product findByTitle(String productTitle);
}
