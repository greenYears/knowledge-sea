package org.meiqin.designmode.factory.pojo.car;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * 汽油宝马.
 * <p/>
 * GasBMW
 *
 * @author zhoumeiqin
 * @date 2021/1/19
 */
@Slf4j
@Data
public abstract class GasBMW implements BMW, Serializable {
    private static final long serialVersionUID = 8064088670247260410L;
}
