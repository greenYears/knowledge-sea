package org.meiqin.designmode.builder;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 产品.
 * <p/>
 * Product
 *
 * @author zhoumeiqin
 * @date 2021/1/20
 */
@Data
@ToString
@Accessors(chain = true)
public class Product implements Serializable {
    private static final long serialVersionUID = -4174498011522585334L;
    private String itemA;
    private String itemB;
    private String itemC;
    private String itemD;
}
