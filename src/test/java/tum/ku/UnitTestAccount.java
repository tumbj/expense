package tum.ku;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import tum.ku.Model.Account;

import static org.junit.Assert.*;
/**
 * Created by 708 on 8/31/2018.
 */
public class UnitTestAccount {
    Account account;

    @BeforeEach
    void init() { account = new Account(0);}

    @Test
    void testIncome(){
        account.income(100,"mom give");
        assertEquals(100,account.getBalance());
        account.income(1000,"mom give");
        assertEquals(1100,account.getBalance());

    }

    @Test
    void testExpense(){
        account.expense(100,"buy fastfood");
        account.expense(50,"buy cartoon book");
        assertEquals(-150,account.getBalance());
    }

}
