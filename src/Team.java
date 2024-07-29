import java.util.Arrays;

public class Team {
    Firefighters[] firefighters = new Firefighters[3];
    Paramedics[] paramedics = new Paramedics[2];

    public Team() {
    }

    public Team(Firefighters[] firefighters, Paramedics[] paramedics) {
        this.firefighters = firefighters;
        this.paramedics = paramedics;
    }

    int count = 0;
    public void addTeam1 (Firefighters firefighter, Paramedics paramedic) {
        for (int i = 0; i < firefighters.length; i++) {
            if (firefighter != null) {
                firefighters[i] = firefighter;
            }
        }
        for (int i = 0; i < paramedics.length; i++) {
            if (paramedics[i] != null) {
                paramedics[i] = paramedic;
            }
        }
    }
}
