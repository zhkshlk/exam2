public class Paramedics extends Rescuers {
    Pharmacy pharmacy;
    public Paramedics(String name, String job, int age, Backpack backpack, Pharmacy pharmacy) {
        super(name, job, age, backpack);
        this.pharmacy = pharmacy;
    }

    public void firstAid () {
        System.out.println("Оказывать первую помощь!");
    }

    @Override
    public String toString() {
        return "Paramedics{" +
                "backpack=" + backpack +
                '}';
    }
}
