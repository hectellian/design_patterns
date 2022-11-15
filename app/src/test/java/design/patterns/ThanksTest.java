package design.patterns;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.io.*;
import java.util.stream.*;

class ThanksTest {
    // "Different" Thanks Instences
    Thanks thanks1 = Thanks.getInstance();
    Thanks thanks2 = Thanks.getInstance();
    Thanks thanks3 = Thanks.getInstance();

    @BeforeAll
    static void setup() {
        System.out.println("--Singleton Thanks Test--");
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

    @AfterAll
    static void teardown() {
        System.out.println("--Thanks Test Complete--");
    }
}
