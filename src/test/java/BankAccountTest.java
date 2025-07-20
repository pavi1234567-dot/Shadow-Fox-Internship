package test.java;

import main.java.BankAccount;
import java.util.List; // ✅ this line fixes the List error
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BankAccountTest {

    BankAccount account;

    @BeforeEach
    void setup() {
        account = new BankAccount("12345", "John Doe");
    }

    @Test
    void testValidDeposit() {
        account.deposit(1000);
        assertEquals(1000, account.getBalance());
        assertTrue(account.getTransactionHistory().contains("Deposited: $1000.0"));
    }

    @Test
    void testInvalidDeposit() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-50));
    }

    @Test
    void testValidWithdrawal() {
        account.deposit(1000);
        account.withdraw(500);
        assertEquals(500, account.getBalance());
        assertTrue(account.getTransactionHistory().contains("Withdrawn: $500.0"));
    }

    @Test
    void testInsufficientBalanceWithdrawal() {
        account.deposit(100);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(150));
    }

    @Test
    void testNegativeWithdrawal() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-10));
    }

    @Test
    void testTransactionHistory() {
        account.deposit(200);
        account.withdraw(100);
        List<String> history = account.getTransactionHistory();
        assertEquals(2, history.size());
    }
}
