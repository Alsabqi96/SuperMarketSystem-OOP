package ObjectOrientedProgramming.SuperMarketSystem.Entities;

import java.util.List;

public class Customer extends Person {


    private Integer loyaltyPoints;
    private List<Product> preferredProducts;
    private List<Product> listOfPurchasedProducts;

    public Integer getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(Integer loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public List<Product> getPreferredProducts() {
        return preferredProducts;
    }

    public void setPreferredProducts(List<Product> preferredProducts) {
        this.preferredProducts = preferredProducts;
    }

    public List<Product> getListOfPurchasedProducts() {
        return listOfPurchasedProducts;
    }

    public void setListOfPurchasedProducts(List<Product> listOfPurchasedProducts) {
        this.listOfPurchasedProducts = listOfPurchasedProducts;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "loyaltyPoints=" + loyaltyPoints + "}";
    }
}

