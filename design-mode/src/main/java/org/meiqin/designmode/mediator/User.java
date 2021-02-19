package org.meiqin.designmode.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * <p/>
 * User
 *
 * @author zhoumeiqin
 * @date 2021/2/19
 */
@Data
@AllArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = -8413921262832509020L;
    private String name;

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
