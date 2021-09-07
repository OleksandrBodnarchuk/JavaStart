package pl.alex.javaStart.lessons.enums.orders.shop;

import pl.alex.javaStart.lessons.enums.orders.model.Order;
import pl.alex.javaStart.lessons.enums.orders.model.Status;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {

        Order[] orders = createOrders();
        Status status = readStatus();
        Order[] filtered = filterOrders(orders, status);
        printFilteredOrders(filtered,status);
    }

    private static void printFilteredOrders(Order[] orders,Status status){
        System.out.println("Lista ze statusem: "+ status);
        for(Order o : orders){
            System.out.println(o);
        }
    }
    private static Order[] filterOrders(Order[] orders, Status status) {
        int size = countOrdersWithStatus(orders, status);
        Order[] filtered = new Order[size];
        int count = 0;
        for (Order o : orders) {
            if (o.getStatus() == status) {
                filtered[count] = o;
                count++;
            }
        }
        return filtered;
    }

    private static int countOrdersWithStatus(Order[] orders, Status status) {
        int count = 0;
        for (Order o : orders) {
            if (o.getStatus() == status) {
                count++;
            }
        }
        return count;
    }

    private static Status readStatus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which one to show you?(");
        for (Status s : Status.values()) {
            System.out.print(s.name()+" ");
        }
        System.out.println(")");
        return Status.valueOf(scanner.nextLine());
    }

    private static Order[] createOrders() {
        Order[] orders = new Order[10];
        orders[0] = new Order("Komputer Apple MacBook Pro 2018", 4999, Status.PAID);
        orders[1] = new Order("Telefon Samsung Galaxy s10", 2499, Status.SHIPPED);
        orders[2] = new Order("Telefon Apple iPhone X", 2999, Status.PAID);
        orders[3] = new Order("Pralka Beko X2000", 1499, Status.DELIVERED);
        orders[4] = new Order("Lodówka Samsung AT200", 1199, Status.DELIVERED);
        orders[5] = new Order("Głośnik JBL z100", 199, Status.NEW);
        orders[6] = new Order("Kino Domowe Yamaha XBC900", 3499, Status.CANCELLED);
        orders[7] = new Order("Konsola Sony Playstation 4", 1499, Status.SHIPPED);
        orders[8] = new Order("Adapter USBC - HDMI", 149, Status.PAID);
        orders[9] = new Order("Żelazko Zelmer PRIMO", 99.99, Status.SHIPPED);
        return orders;
    }


}
