package za.ac.cput;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import java.util.concurrent.TimeUnit;

class PaymentTest {
    private static Payment payment1;
    private static Payment payment2;
    private static Payment payment3;

    // Setup
    @BeforeAll
    public static void setupClass() {
        payment1 = new Payment("Aqeel", "Hanslo", 22);
        payment2 = new Payment("Ammaarah", "Hanslo", 18);
        payment3 = new Payment("Aarif", "Hanslo", 16);
    }

    @AfterAll
    public static void tearDownClass() {
        payment1 = null;
        payment2 = null;
        payment3 = null;
    }

    // Object Equality
    @Test
    public void testObjectEquality() {
        Assertions.assertEquals(payment1, payment1);
        Assertions.assertEquals(payment2, payment2);
        Assertions.assertEquals(payment3, payment3);
    }

    // Object Identity
    @Test
    public void testObjectIdentity() {
        Assertions.assertSame(payment1, payment1);
        Assertions.assertNotSame(payment2, payment3);
    }

    // Failing Tests
    @Test
    public void testObjectEqualityFail() {
        Assertions.assertEquals(payment1, payment2);
        Assertions.assertEquals(payment2, payment3);
        Assertions.assertEquals(payment3, payment1);
    }

    @Test
    public void testObjectIdentityFail() {
        Assertions.assertSame(payment1, payment2);
        Assertions.assertNotSame(payment3, payment3);
    }

    // Timeouts
    @Test
    @Timeout(value = 5, unit = TimeUnit.NANOSECONDS)
    public void testObjectIdentityTimeout() throws InterruptedException {
        Thread.sleep(10000);
        Assertions.assertNotSame(payment1, payment2);
        Assertions.assertNotSame(payment3, payment2);
    }

    // Ignore Test
    @Disabled
    @Test
    public void testIgnored() {
        Assertions.assertSame(payment1, payment2);
    }

}