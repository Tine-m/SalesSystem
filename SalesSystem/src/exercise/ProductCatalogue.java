package exercise;

import java.util.ArrayList;

public class ProductCatalogue {

    private ArrayList<ProductSpecification> products = new ArrayList<>();

    public void addProduct(ProductSpecification product) {
        products.add(product);
    }

    public ProductSpecification getProductDescription(int id) {
        ProductSpecification tmp = null;
        for (int i = 0; i < products.size() ; i++) {
            tmp = products.get(i);
            if (tmp.getId() == id) {
                return tmp;
            }
        }
        // no match by ID
        return null;
    }
}
