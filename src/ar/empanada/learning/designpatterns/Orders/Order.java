package ar.empanada.learning.designpatterns.Orders;

import java.util.List;

public class Order {
    List<String> lineItems;
    Shipping shipping;

    private float getTotal(){
        System.out.println("your total is: " + 1f);
        return 1f;
    }
    private float getTotalWeight(){
        System.out.println("your weight is" + 2f);
        return 2f;
    }

    private float getShippingCost(){
        return this.shipping.getCost(this);
    }

    private float getShippingDate(){
        return this.shipping.getDate(this);
    }
}
