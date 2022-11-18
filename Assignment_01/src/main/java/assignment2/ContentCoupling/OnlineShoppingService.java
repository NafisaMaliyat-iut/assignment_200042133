package assignment2.ContentCoupling;


public class OnlineShoppingService {
    //Here this class is directly modifying unitsStocked attribute of product class
    //without any getter or setters
    public String placeOrder(Product product, int amount){
        String message;
        //if it was successfully added to cart
        if(addToCart(product, amount)) {
            //deduct number of units stocked
            product.unitsStocked = product.unitsStocked - amount;
            message = "Order placed successfully!";
        } else {
            message = "Something went wrong! Try again";
        }
        return message;
    }

    //method from stamp coupling for use in method above
    public boolean addToCart(Product product, int amount){
        if(product.unitsStocked>= amount){
            return true;
        } else{
            return false;
        }
    }
}
