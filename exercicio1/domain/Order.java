package exercicio1.domain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exercicio1.domain.enums.OrderStatus;

public class Order {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> order= new ArrayList<>();


    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return this.moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderList() {
        return this.order;
    }

    public void addItem(OrderItem item){
        order.add(item);
    }
    public void removeItem(OrderItem item){
        order.remove(item);
    }
    public Double total(){
        Double sum = 0.00;
        for (OrderItem c : order){
            sum += c.subTotal();
        }
        return sum;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment:" + sdf.format(moment) + "\n");
        sb.append("Order status:" + status + "\n");
        sb.append("Client: " + client + "\n");
        sb.append("Order Items: \n");
        for(OrderItem c : order) {
            sb.append(order + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
