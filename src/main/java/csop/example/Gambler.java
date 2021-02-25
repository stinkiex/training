package csop.example;

public class Gambler {
    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]); // исходная сумма
        int goal = Integer.parseInt(args[1]); // цель
        int trials = Integer.parseInt(args[2]); // кол-во опытов
        int bets = 0, wins = 0; // bets - кол-во ставок , wins - кол-во побед, cash - текущая сумма денег;
        for (int t = 0; t < trials; t++) {
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5)
                    cash++;
                else
                    cash--;
            }
            if (cash == goal)
                wins++;
        }
        System.out.println(100 * wins / trials + "% wins");
        System.out.println("Avg # bets: " + bets / trials);
    }
}
