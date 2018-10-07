package tum.ku.Model;

import java.util.ArrayList;

/**
 * Created by 708 on 8/31/2018.
 */
public class Account {

    private double balance;
    private static int id;
    private ArrayList<String> explain;
    private ArrayList<Double> history;

    public Account(int money) {
        balance = money;
        id = 0;
        explain = new ArrayList<>();
        history = new ArrayList<>();
    }
    public Account() {
        this.balance = 0;
        id=0;
        explain = new ArrayList<>();
        history = new ArrayList<>();
    }

    public void income(double money,String explain){
        id++;
        this.balance+=money;
        this.history.add(money);
        this.explain.add(explain);
    }

    public void expense(double money,String explain){
        id++;
        this.balance -=money;
        this.history.add(money);
        this.explain.add(explain);
    }

    public double getBalance(){
        return balance;
    }
    public String getBalanceAndHistoty(){
        String tmp = "";
        for (int j = 0; j < history.size(); j++) {
            tmp += "id :"+j+" " + history.get(j) + " " + explain.get(j) +"\n";
        }
        return tmp;
    }
//    public void editIncome(double money,String exp){
//        if (money > history.get(id)){
//
//        }
//
//    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
