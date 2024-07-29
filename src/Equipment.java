public class Equipment {
    private String name;
    private int mass;

    public Equipment() {
    }

    public Equipment(String name, int mass) {
        this.name = name;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                '}';
    }
}
