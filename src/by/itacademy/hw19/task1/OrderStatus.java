package by.itacademy.hw19.task1;

public enum OrderStatus {
    NEW ("новый"),
    CANCELED ("отменен"),
    COMPLETED ("выполнен");

    private final String title;
    OrderStatus(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return title;
    }
}
