public class Firefighters extends Rescuers{
    Equipment equipment;
    public Firefighters (String name, String job, int age, Backpack backpack, Equipment equipment) {
        super(name, job, age, backpack);
        this.equipment = equipment;
    }

    public void putOutFires () {
        System.out.println("Тушить пожар!");
    }

    @Override
    public String toString() {
        return "Firefighters{" +
                "backpack=" + backpack +
                '}';
    }
}