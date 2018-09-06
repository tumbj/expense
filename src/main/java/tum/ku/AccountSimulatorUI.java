package tum.ku;

/**
 * Created by 708 on 8/31/2018.
 */
public class AccountSimulatorUI {
    public static void main(String[] args) {
        Account myAcc = new Account();


        myAcc.income(100,"Mother give");
        myAcc.expense(200,"buy model");
        myAcc.income(500,"Father give");


        System.out.println(myAcc.getBalanceAndHistoty());
    }
}
