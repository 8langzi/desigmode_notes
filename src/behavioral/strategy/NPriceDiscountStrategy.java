package src.behavioral.strategy;

public class NPriceDiscountStrategy implements PromotionStrategy {
    @Override
    public int operation(String skuId) {
        System.out.println("== 执行 N 折扣优惠活动 == " + skuId);
        return 2;
    }
}
