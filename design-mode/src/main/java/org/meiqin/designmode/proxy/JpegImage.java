package org.meiqin.designmode.proxy;

import lombok.Data;

import java.io.Serializable;

/**
 * Jpeg Image.
 * <p/>
 * JpegImage
 *
 * @author zhoumeiqin
 * @date 2021/2/19
 */
@Data
public class JpegImage implements Image, Serializable {
    private static final long serialVersionUID = 3184038791145929219L;
    /**
     * 扩展名.
     */
    private static final String EXTENSION_NAME = ".jpeg";
    /**
     * 文件名称.
     */
    private String fileName;

    public JpegImage(String fileName) {
        this.fileName = fileName;
        this.load();
    }

    @Override
    public void display() {
        System.out.println("显示图片：" + this.fileName + EXTENSION_NAME);
    }

    private void load() {
        System.out.println("加载图片：" + this.fileName + EXTENSION_NAME);
    }
}
