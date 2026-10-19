package metier;

import dao.IDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MetierImplTest {

    private MetierImpl metier;

    @BeforeEach
    void setUp() {
        metier = new MetierImpl();
    }

    @Test
    void testCalculAvecMockDao() {
        // Mock manuel d'IDao pour isoler le test unitaire
        IDao mockDao = new IDao() {
            @Override
            public double getData() {
                return 10.0;
            }
        };

        // Injection de la dépendance mockée
        metier.setDao(mockDao);

        double resultat = metier.calcul();

        // 10.0 * 2.5 = 25.0
        assertEquals(25.0, resultat, 0.001, "Le calcul doit retourner exactement 25.0");
    }

    @Test
    void testCalculSansDaoDoitLeverException() {
        // Sans injection de DAO, le calcul doit échouer proprement
        assertThrows(IllegalStateException.class, () -> {
            metier.calcul();
        }, "L'absence de DAO doit déclencher une IllegalStateException");
    }
}
