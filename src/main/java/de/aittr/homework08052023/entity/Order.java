package de.aittr.homework08052023.entity;


public class Order {
    private int orderId;
    private User user;
    private String title;

    public Order(int orderId, User user, String title) {
        this.orderId = orderId;
        this.user = user;
        this.title = title;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;

        if (getOrderId() != order.getOrderId()) return false;
        if (getUser() != null ? !getUser().equals(order.getUser()) : order.getUser() != null) return false;
        return getTitle() != null ? getTitle().equals(order.getTitle()) : order.getTitle() == null;
    }

    @Override
    public int hashCode() {
        int result = getOrderId();
        result = 31 * result + (getUser() != null ? getUser().hashCode() : 0);
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        return result;
    }
}
