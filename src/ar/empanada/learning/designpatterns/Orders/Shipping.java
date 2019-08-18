package ar.empanada.learning.designpatterns.Orders;

public interface Shipping {
    float getCost(Order order);
    float getDate(Order order);
}
