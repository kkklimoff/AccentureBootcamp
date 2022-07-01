package daythree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountUpdatedTest {
    private BankAccountUpdated ba;

    @BeforeEach
    protected void setUp() {
        ba = new BankAccountUpdated(2000);
    }

    @Test
    void deposit() {
        assertAll(() -> assertEquals(2000, ba.deposit(6000)),
                () -> assertEquals(5000, ba.deposit(3000))
        );
    }

    @Test
    void withdraw() {
        assertAll(() -> assertEquals(2000, ba.withdraw(3000)),
                () -> assertEquals(1500, ba.withdraw(500))
        );
    }

    @Test
    void transferFrom() {
        BankAccountUpdated temp = new BankAccountUpdated();
        assertAll(() -> assertEquals(2000, ba.transferFrom(temp, 3000)),
                () -> assertEquals(0, ba.transferFrom(temp, 2000)));
    }
}