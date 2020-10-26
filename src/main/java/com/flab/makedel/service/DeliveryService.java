package com.flab.makedel.service;

import com.flab.makedel.dao.DeliveryDAO;
import com.flab.makedel.dto.OrderReceiptDTO;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeliveryService {

    private final DeliveryDAO deliveryDAO;

    public void registerStandbyOrder(long orderId, OrderReceiptDTO orderReceipt) {
        deliveryDAO.insertStandbyOrder(orderId, orderReceipt);
    }

    public OrderReceiptDTO loadStandbyOrder(long orderId) {
        return deliveryDAO.selectStandbyOrder(orderId);
    }

    public List<String> loadStandbyOrderList() {
        return deliveryDAO.selectStandbyOrderList();
    }

    public void deleteStandbyOrder(long orderId) {
        deliveryDAO.deleteStandbyOrder(orderId);
    }

}
