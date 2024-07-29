public class Backpack {
    private String color;
    private int capacity;

    public Backpack() {
    }

    public Backpack(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "color='" + color + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
