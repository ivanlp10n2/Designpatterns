package ar.empanada.learning.designpatterns.Orders;

public class Air implements Shipping{
    @Override
    public float getCost(Order order) {
        return 0;
    }

    @Override
    public float getDate(Order order) {
        return 0;
    }
}
