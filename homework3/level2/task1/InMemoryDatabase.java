package homework3.level2.task1;

public class InMemoryDatabase implements ProductDatabase{

     Product[] product = new Product[0];


    class Product {
        private String title;

        public Product(String title) {
            this.title = title;
        }
    }

    @Override
    public void save(homework3.level2.task1.Product product) {

    }

    @Override
    public homework3.level2.task1.Product findByTitle(String productTitle) {
        return null;
    }
}

