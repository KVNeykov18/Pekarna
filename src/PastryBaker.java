import java.util.ArrayList;

public class PastryBaker {
    private ArrayList<Pastry> pastries;
    private ArrayList<Baker> bakers;

    public PastryBaker(ArrayList<Pastry> pastries, ArrayList<Baker> bakers) {
        this.pastries = pastries;
        this.bakers = bakers;
    }

    public ArrayList<Pastry> getPastries() {
        return pastries;
    }

    public void setPastries(ArrayList<Pastry> pastries) {
        this.pastries = pastries;
    }

    public ArrayList<Baker> getBakers() {
        return bakers;
    }

    public void setBakers(ArrayList<Baker> bakers) {
        this.bakers = bakers;
    }

    @Override
    public String toString() {
        return "PastryBaker{" +
                "pastries=" + pastries +
                ", baker=" + bakers +
                '}';
    }

    public void addElements(Pastry pastries, Baker bakers){
        pastries.add(pastries);
        bakers.add(bakers);
    }

    public void returnInfo(ArrayList<PastryBaker> Pastrybakers) {
        for (PastryBaker pb:Pastrybakers) {
            System.out.println(pb.toString());
        }
    }

    public ArrayList<PastryBaker> pastries(int bakerId) {

    }
}

