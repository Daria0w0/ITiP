import java.util.Date;
import java.util.List;

public class Order {
    private String orderNumber; 
    private Date orderDate; 
    private List<String> items; 
    private String status; 

    public Order(String orderNumber, Date orderDate, List<String> items, String status) {
        this.orderNumber = orderNumber; 
        this.orderDate = orderDate; 
        this.items = items; 
        this.status = status; 
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public List<String> getItems() {
        return items;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status; 
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber='" + orderNumber + '\'' +
                ", orderDate=" + orderDate +
                ", items=" + items +
                ", status='" + status + '\'' +
                '}';
    }
}