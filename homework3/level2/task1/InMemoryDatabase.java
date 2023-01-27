package homework3.level2.task1;

import java.util.Arrays;

public class InMemoryDatabase implements ProductDatabase {
    String[] products = new String[0];

    @Override
    public void save(Product product) {
        String[] newProduct = new String[products.length + 1];
        System.arraycopy(products, 0, newProduct, 0, products.length);
        int lastIndex = newProduct.length - 1;
        newProduct[lastIndex] = product.getTitle();
        products = newProduct;
        System.out.println(Arrays.toString(products));
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == productTitle) {
                System.out.println(productTitle);
                return new Product(productTitle);
            }
            } return null;

        }

    }