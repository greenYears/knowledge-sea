package org.meiqin.designmode.proxy;

import lombok.Data;

import java.io.Serializable;

/**
 * 代理图片.
 * <p/>
 * ProxyImage
 *
 * @author zhoumeiqin
 * @date 2021/2/19
 */
@Data
public class ProxyImage implements Image, Serializable {
    private static final long serialVersionUID = 7070499488410391365L;
    /**
     * 要代理的图片.
     */
    private JpegImage image;
    /**
     * 图片名称.
     */
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (this.image == null) {
            this.image = new JpegImage(this.fileName);
        }
        this.image.display();
    }
}
