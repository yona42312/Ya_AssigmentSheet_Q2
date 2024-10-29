import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
    @Test
    public void testIsKaprekar() {
        assertTrue(Main.isKaprekar(45), "מספר קפרקר צפוי להיות true עבור 45");
        assertTrue(Main.isKaprekar(9), "מספר קפרקר צפוי להיות true עבור 9");
        assertFalse(Main.isKaprekar(20), "מספר שאינו קפרקר צפוי להיות false עבור 20");
        assertFalse(Main.isKaprekar(21), "מספר שאינו קפרקר צפוי להיות false עבור 21");
    }
}
