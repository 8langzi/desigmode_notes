package src.behavioral.state;

public interface PackageState {

    /**
     * 定义了6种状态
     * 1 - 已下单
     * 2 - 仓库处理中
     * 3 - 运输中
     * 4 - 派送中
     * 5 - 待取件
     * 6 - 已签收
     * @param ctx
     */
    void updateState(PackageContext ctx);

}
