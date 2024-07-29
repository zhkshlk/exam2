public class Main {
    public static void main(String[] args) {
        Equipment equipment1 = new Equipment("лопаты", 3);
        Equipment equipment2 = new Equipment("огнетушитель", 5);
        Equipment equipment3 = new Equipment("багры", 4);
        Pharmacy pharmacy1 = new Pharmacy("жгут", 8);
        Pharmacy pharmacy2 = new Pharmacy("пластырь", 8);
        Backpack backpack1 = new Backpack("оранжевый", 15);
        Backpack backpack2 = new Backpack("черный", 10);
        Firefighters firefighters1 = new Firefighters("Иван", "командир", 35, backpack1, equipment1);
        Firefighters firefighters2 = new Firefighters("Коля", "служивый", 25, backpack1, equipment2);
        Firefighters firefighters3 = new Firefighters("Саня", "рядовой", 18, backpack1, equipment3);
        Paramedics paramedics1 = new Paramedics("Юля", "медсестра", 23, backpack2, pharmacy1);
        Paramedics paramedics2 = new Paramedics("Жанна", "врач", 40, backpack2, pharmacy2);
        Team team1 = new Team();
        team1.addTeam1(firefighters1, paramedics1);
    }
}