package org.meiqin.designmode.mediator;

import com.github.greenyears.core.utils.DateUtil;
import com.github.greenyears.core.utils.ExpandStringUtil;

import java.util.Date;

/**
 * <p/>
 * ChatRoom
 *
 * @author zhoumeiqin
 * @date 2021/2/19
 */
public class ChatRoom {
    private static final String TEMPLATE = "{date}[{user}]:{message}";

    public static void showMessage(User user, String message) {
        String date = DateUtil.format(new Date());
        System.out.println(ExpandStringUtil.expandStringComponent(TEMPLATE, date, user.getName(), message));
    }
}
