package src.behavioral.strategy;

public class FullReduceStrategy implements PromotionStrategy {
    @Override
    public int operation(String skuId) {
        System.out.println("== 执行: 满减活动 == " + skuId);
        return 1;
    }
}
