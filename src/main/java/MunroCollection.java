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

    public void sortByNameDescinding() {
        munroCollection.sort(Comparator.comparing(Munro::getName).reversed());
    }

    public void sortByNameAscending() {
        munroCollection.sort(Comparator.comparing(Munro::getName));
    }

    public ArrayList getMunrosAboveSpecificHeight(int height){
        ArrayList filteredMunros = new ArrayList();
        for (Munro munro : munroCollection) {
            if (munro.getHeight() >= height) {
                filteredMunros.add(munro);
            }
        }
        return filteredMunros;
    }

    public ArrayList getMunrosBelowSpecificHeight(int height) {
        ArrayList filteredMunros = new ArrayList();
        for (Munro munro : munroCollection) {
            if (munro.getHeight() <= height) {
                filteredMunros.add(munro);
            }
        }
        return filteredMunros;
    }

    public ArrayList getMunrosWithinSpecificHeightRange(int minHeight, int maxHeight) {
        ArrayList filteredMunros = new ArrayList();
        for (Munro munro : munroCollection){
            if (munro.getHeight() >= minHeight && munro.getHeight() <= maxHeight) {
                filteredMunros.add(munro);
            }
        }
        return filteredMunros;
    }

    public ArrayList getMunrosOfSpecificHillType(String type) {
        ArrayList filteredMunros = new ArrayList();
        for (Munro munro : munroCollection) {
            if (munro.getHillCategory().equals(type)) {
                filteredMunros.add(munro);
            }
        }
        return filteredMunros;
    }


}
