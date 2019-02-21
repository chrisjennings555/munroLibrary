import java.util.ArrayList;

public class MunroCollection {

    private ArrayList<Munro> munroCollection;

    public MunroCollection(){
        this.munroCollection = new ArrayList<>();
    }

    public ArrayList<Munro> getHills() {
        return munroCollection;
    }

    public void setHills(ArrayList<Munro> munroCollection) {
        this.munroCollection = munroCollection;
    }

    public int getSize() {
        return munroCollection.size();
    }

    public void addMunro(Munro munro) {
        munroCollection.add(munro);
    }
}
