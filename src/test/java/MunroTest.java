import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MunroTest {

    Munro munro;

    @Before
    public void before(){
        munro = new Munro("Ben Lomond", 500, "MUN", "NE123456");
    }

    @Test
    public void munroHasName(){
        assertEquals("Ben Lomond", munro.getName());
    }

    @Test
    public void munroHasHeight(){
        assertEquals(500, munro.getHeight());
    }

    @Test
    public void munroHasCategory(){
        assertEquals("MUN", munro.getHillCategory());
    }
}
