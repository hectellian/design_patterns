package design.patterns;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class ThanksTest {
    // "Different" Thanks Instences
    Thanks thanks = Thanks.getInstance();
    Thanks thanks1 = Thanks.getInstance();
    Thanks thanks2 = Thanks.getInstance();
    Thanks thanks3 = Thanks.getInstance();

    @BeforeAll
    static void setup() {
        System.out.println("--Singleton Thanks Test--");
    }

    @BeforeEach
    void beforeEach() {
        thanks.resetThanks();
    }

    @Test
    @DisplayName("Instance Test")
    void thanksHasOneInstance() {
        assertAll("testInstance:",
            () -> assertEquals(thanks1, thanks2),
            () -> assertEquals(thanks2, thanks3),
            () -> assertEquals(thanks3, thanks1)
        );
    }

    @Test
    @DisplayName("Add Thanks Test")
    void addThanks() {
        thanks.addThanks();
        assertEquals(1, thanks.getThanks());
    }

    @Test
    @DisplayName("Add Big Thanks Test")
    void addBigThanks() {
        thanks.addBigThanks();
        assertEquals(100, thanks.getThanks());
    }

    @Test
    @DisplayName("Consume Thanks Test")
    void consumeThanks() {
        thanks.addThanks();
        thanks.consumeThanks();
        assertEquals(0, thanks.getThanks());
    }

    @Test
    @DisplayName("No Negative Consume Thanks Test")
    void consumeThanksNoThanks() {
        thanks.consumeThanks();
        assertEquals(0, thanks.getThanks());
    }

    @AfterAll
    static void teardown() {
        System.out.println("--Thanks Test Complete--");
    }
}
