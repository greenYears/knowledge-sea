package org.meiqin.designmode.builder;

/**
 * <p/>
 * ConcreteBuilder
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
public class ConcreteBuilder implements Builder<Product> {
    private Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    @Override
    public Builder<Product> itemA() {
        product.setItemA("铺设钢筋");
        return this;
    }

    @Override
    public Builder<Product> itemB() {
        product.setItemB("倒入水泥");
        return this;
    }

    @Override
    public Builder<Product> itemC() {
        product.setItemC("找平路面");
        return this;
    }

    @Override
    public Builder<Product> itemD() {
        product.setItemD("风干水泥");
        return this;
    }

    @Override
    public Product build() {
        return product;
    }
}
