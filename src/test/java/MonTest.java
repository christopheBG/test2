import essai.MaClasse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MonTest {

    @Test
    public void monPremierTest() {
        assertEquals(1, new MaClasse().maMethode());
    }

}
