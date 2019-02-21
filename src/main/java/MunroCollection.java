import java.util.*;

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

    public int getIndexOfMunro(Munro munro) {
        return munroCollection.indexOf(munro);
    }

    public void sortByHeightDescending() {
        munroCollection.sort(Comparator.comparing(Munro::getHeight).reversed());
    }

    public void sortByHeightAscending() {
        munroCollection.sort(Comparator.comparing(Munro::getHeight));
    }


}
