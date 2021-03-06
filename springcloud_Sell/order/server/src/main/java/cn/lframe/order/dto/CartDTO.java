package cn.lframe.order.dto;

import lombok.Data;

/**
 * 购物车
 * @author Lframe
 * @create2018 -05 -06 -12:27
 */
@Data
public class CartDTO {

    /**
     * 商品ID
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
