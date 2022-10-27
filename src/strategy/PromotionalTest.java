package src.strategy;

public class PromotionalTest {

    public static void main(String[] args) {

        PromotionStrategy fullStrategy = new FullReduceStrategy();
        Promotional fullReduceStrategyPromotional = new Promotional(fullStrategy);
        fullReduceStrategyPromotional.request("full");

        PromotionStrategy mSpikeStrategy = new MSpikeStrategy();
        Promotional mSpikeStrategyPromotional = new Promotional(mSpikeStrategy);
        mSpikeStrategyPromotional.request("mspike");

        PromotionStrategy nPriceDiscountStrategy = new NPriceDiscountStrategy();
        Promotional nPriceDiscountStrategyPromotional = new Promotional(nPriceDiscountStrategy);
        nPriceDiscountStrategyPromotional.request("nPrice");

    }

}
