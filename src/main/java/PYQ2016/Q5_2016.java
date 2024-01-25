
package PYQ2016;

public class Q5_2016 {
    public static void main(String[] args) {
        Q5_Rebate cardRebate = new Q5_Rebate("Dasha Taran","1111222233334444");
        Q5_Point cardPoint = new Q5_Point("Dasha Taran", "5555666677778888");
        
        cardRebate.getReward("Grocery", 124.8);
        cardRebate.getReward("Other", 64.6);
        cardRebate.getReward("Fuel", 95.4);
        cardRebate.getReward("Utility", 100);
        cardRebate.getReward("Other", 220);
        System.out.println(cardRebate.toString());
        cardPoint.getReward("Saturday", 124.8);
        cardPoint.getReward("Friday", 64.6);
        cardPoint.getReward("Sunday", 95.4);
        cardPoint.getReward("Friday", 100);
        cardPoint.getReward("Tuesday", 220);
        System.out.println(cardPoint.toString());
        
        double totalRewardCardRebate = Double.parseDouble(cardRebate.getTotalReward());
        double totalRewardCardPoint = Double.parseDouble(cardPoint.getTotalReward());
        
        if(totalRewardCardRebate > totalRewardCardPoint) {
            System.out.println("The best card is Cash Rebate Card");
        } else {
            System.out.println("The best card is Point Reward Card");
        }
    }
}
