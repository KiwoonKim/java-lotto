package lotto.domain;

import lotto.constants.PrizeEnum;

import java.util.HashMap;

public class EarnRate {

    double EarnRate;
    int inputAmount;
    int totalEarning;
    public EarnRate(int inputAmount) {
        this.EarnRate = 1;
        this.inputAmount = inputAmount;
        this.totalEarning = 0;
    }

    public int getTotalEarning(HashMap<String, Integer> checkMatchCount) {
        checkMatchCount.forEach((key, value) -> {
            totalEarning += PrizeEnum.valueOf(key).getAmount() * value;
        });
        return totalEarning;
    }

    public double getEarnRate(){
        return (double) totalEarning / (double) inputAmount;
    }
}
