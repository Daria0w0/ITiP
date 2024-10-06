import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();

        Order order1 = new Order("001", new Date(), new ArrayList<>(List.of("Товар1", "Товар2")), "В обработке");
        Order order2 = new Order("002", new Date(), new ArrayList<>(List.of("Товар3")), "Доставлен");

        orderManager.addOrder(order1);
        orderManager.addOrder(order2);

        System.out.println("Все заказы:");
        orderManager.displayOrders();

        System.out.println("\nПолучаем заказ 001:");
        System.out.println(orderManager.getOrder("001"));

        orderManager.updateOrderStatus("001", "Доставлен");
        System.out.println("\nПосле изменения статуса заказа 001:");
        System.out.println(orderManager.getOrder("001"));

        orderManager.removeOrder("002");
        System.out.println("\nПосле удаления заказа 002:");
        orderManager.displayOrders();
    }
}