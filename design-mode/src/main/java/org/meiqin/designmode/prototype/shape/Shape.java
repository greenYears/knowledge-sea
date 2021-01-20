package org.meiqin.designmode.prototype.shape;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p/>
 * Shape
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
@Data
@Accessors(chain = true)
public abstract class Shape implements Cloneable {
    protected String id;
    protected String type;

    public abstract void draw();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
