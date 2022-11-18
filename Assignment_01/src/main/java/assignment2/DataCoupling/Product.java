package assignment2.DataCoupling;

public class Product {
    int productID;
    int unitsStocked;

    public int getUnitsStocked(){
        return unitsStocked;
    }

    public int getProductID(){
        return productID;
    }

    public void setUnitsStocked(int unitsStocked){
        this.unitsStocked = unitsStocked;
    }
}
