package assignment2.DataCoupling;

import java.util.List;

public class Shop {
    List<Product> productList;

    //here product ID and unitsStocked of the product class
    // is being accessed/changed by this class
    public void addNewProduct(int productID, int productQuantity){
        Product product = new Product();
        product.productID = productID;
        product.unitsStocked = productQuantity;
        productList.add(product);
    }
}
