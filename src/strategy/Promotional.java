package src.strategy;

public class Promotional {

    private final PromotionStrategy promotionStrategy;

    Promotional(PromotionStrategy promotionStrategy){
        this.promotionStrategy = promotionStrategy;
    }


    public void request(String skuId){
        // 需要执行的请求体信息
        promotionStrategy.operation(skuId);
    }

}
