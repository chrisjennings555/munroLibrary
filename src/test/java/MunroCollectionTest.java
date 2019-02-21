import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class MunroCollectionTest {

    MunroCollection munroCollection;
    Munro munro1;
    Munro munro2;
    Munro munro3;

    @Before
    public void before(){

        munroCollection = new MunroCollection();
        munro1 = new Munro("Ben Lomond", 500, "MUN", "NE123456");
        munro2 = new Munro("Ben More", 600, "MUN", "SW654321");
        munro3 = new Munro("Ben Nevis", 900, "MUN", "NW123123");

    }

    @Test
    public void collectionStartsWithZero(){
        assertEquals(0, munroCollection.getSize());
    }

    @Test
    public void munroCanBeAddedToTheCollection(){
        munroCollection.addMunro(munro1);
        assertEquals(1, munroCollection.getSize());
    }

    @Test
    public void manyMunrosCanBeAddedToTheCollection(){
        munroCollection.addMunro(munro1);
        munroCollection.addMunro(munro2);
        munroCollection.addMunro(munro3);
        assertEquals(3, munroCollection.getSize());
    }

    @Test
    public void munrosCanBePutInDescendingHeightOrder(){
        munroCollection.addMunro(munro1);
        munroCollection.addMunro(munro2);
        munroCollection.addMunro(munro3);
        munroCollection.sortByHeightDescending();
        assertEquals(0, munroCollection.getIndexOfMunro(munro3));
    }

    @Test
    public void munrosCanBePutIntoAscendingHeightOrder(){
        munroCollection.addMunro(munro3);
        munroCollection.addMunro(munro2);
        munroCollection.addMunro(munro1);
        munroCollection.sortByHeightAscending();
        assertEquals(0, munroCollection.getIndexOfMunro(munro1));
    }
}
