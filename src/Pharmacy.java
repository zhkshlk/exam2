public class Pharmacy {
    private String name;
    private int countThings;

    public Pharmacy() {
    }

    public Pharmacy(String name, int countThings) {
        this.name = name;
        this.countThings = countThings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountThings() {
        return countThings;
    }

    public void setCountThings(int countThings) {
        this.countThings = countThings;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "name='" + name + '\'' +
                ", countThings=" + countThings +
                '}';
    }
}
