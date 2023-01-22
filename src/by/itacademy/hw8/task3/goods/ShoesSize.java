package by.itacademy.hw8.task3.goods;

public enum ShoesSize {
    $39 ("39"),
    $40 ("40"),
    $41 ("41"),
    $42 ("42");

    private String size;

    ShoesSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return size;
    }
}
