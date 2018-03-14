import by.gsu.pms.Dishes;
import by.gsu.pms.DishesPan;
import by.gsu.pms.DishesPlate;
import by.gsu.pms.DishesFryingPan;
public class Runner {
    public static void main(String[] args) {
            Dishes[] p = {
                    new Dishes("OAO Stack",12,"Avangard"),
                    new Dishes("OAO Stack",12),
                    new DishesPan("Krona",7,"Yagodka",12.5,true),
                    new DishesPan("Krona",4,12.5,false),
                    new DishesFryingPan("CAO Records",25,"none",20,"Ceramic"),
                    new DishesFryingPan("CAO Records",25,"none","Ceramic"),
                    new DishesPlate("Karaban Indastries",3,"Cviatochec",30),
                    new DishesPlate("Karaban Indastries",3,30),
            };
            for (int i=0;i<p.length;i++){
                p[i].writeInfo();
            }
    }
}