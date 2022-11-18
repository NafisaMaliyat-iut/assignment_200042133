package assignment2.StampCoupling;

import assignment2.DataCoupling.Product;

public class OnlineShoppingService {
    //here product is sent as a reference
    //only unitStocked attribute is used to check
    //if product can be added to cart
    public String addToCart(Product product, int amount){
        if(product.getUnitsStocked()>= amount){
            return "Added to cart successfully!";
        } else{
            return "Could not be added to cart!";
        }
    }
}
