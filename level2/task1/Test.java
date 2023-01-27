package homework3.level2.task1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Product product = new Product("milk");
        Product product1 = new Product("Bred");
        Product product2 = new Product("Banane");
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        inMemoryDatabase.save(product);
        inMemoryDatabase.save(product1);
        inMemoryDatabase.save(product2);
        inMemoryDatabase.findByTitle("djfgjdjk");
    }
}

