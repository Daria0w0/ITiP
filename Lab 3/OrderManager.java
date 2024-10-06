import java.util.HashMap;

public class OrderManager {
    private HashMap<String, Order> orders;

    public OrderManager() {
        orders = new HashMap<>(); 
    }

    public void addOrder(Order order) {
        orders.put(order.getOrderNumber(), order); 
    }

    public Order getOrder(String orderNumber) {
        return orders.get(orderNumber); 
    }

    public void removeOrder(String orderNumber) {
        orders.remove(orderNumber);
    }

    public void updateOrderStatus(String orderNumber, String newStatus) {
        Order order = orders.get(orderNumber); 
        if (order != null) {
            order.setStatus(newStatus); 
        }
    }

    public void displayOrders() {
        for (Order order : orders.values()) {
            System.out.println(order); 
        }
    }
}