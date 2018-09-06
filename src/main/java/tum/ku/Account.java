package tum.ku;

import java.util.ArrayList;

/**
 * Created by 708 on 8/31/2018.
 */
public class Account {

    private int balance;

    private ArrayList<String> explain;
    private ArrayList<Integer> history;
    public Account(int money) {
        balance = money;
        explain = new ArrayList<>();
        history = new ArrayList<>();
    }
    public Account() {
        this.balance = 0;
        explain = new ArrayList<>();
        history = new ArrayList<>();
    }

    public void income(int money,String explain){
        this.balance+=money;
        this.history.add(money);
        this.explain.add(explain);
    }

    public void expense(int money,String explain){
        this.balance -=money;
        this.history.add(money);
        this.explain.add(explain);
    }

    public int getBalance(){
        return balance;
    }
    public String getBalanceAndHistoty(){
        String tmp = "";
        for (int i = 0; i < history.size(); i++) {
            tmp += history.get(i) + " " + explain.get(i) +"\n";
        }
        return tmp+"\n"+"balance: "+balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
