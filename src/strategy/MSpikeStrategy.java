package src.strategy;

public class MSpikeStrategy implements PromotionStrategy{
    @Override
    public int operation(String skuId) {
        System.out.println("== 执行 M 元 秒杀活动 == " + skuId);
        return 3;
    }
}
