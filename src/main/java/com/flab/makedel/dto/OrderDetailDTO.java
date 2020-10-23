package com.flab.makedel.dto;

import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class OrderDetailDTO {

    private final Long orderId;

    private final String orderStatus;

    private final Long totalPrice;

    private UserInfoDTO userInfo;

    private StoreInfoDTO storeInfo;

    private List<OrderDetailMenuDTO> menuList;


}
