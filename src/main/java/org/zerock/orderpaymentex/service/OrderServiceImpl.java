package org.zerock.orderpaymentex.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.orderpaymentex.domain.FoodItem;
import org.zerock.orderpaymentex.domain.Order;
import org.zerock.orderpaymentex.domain.OrderItem;
import org.zerock.orderpaymentex.domain.OrderStatus;
import org.zerock.orderpaymentex.dto.OrderItemDTO;
import org.zerock.orderpaymentex.dto.OrderRequestDTO;
import org.zerock.orderpaymentex.dto.OrderResponseDTO;
import org.zerock.orderpaymentex.repository.FoodItemRepository;
import org.zerock.orderpaymentex.repository.OrderRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderServiceImpl {

    private final FoodItemRepository foodItemRepository;
    private final OrderRepository orderRepository;


//    // Create Order
//    public OrderResponseDTO createOrder(OrderRequestDTO orderRequest) {
//        List<OrderItem> items = orderRequest.getItems().stream().map(itemDTO -> {
//            FoodItem foodItem = foodItemRepository.findById(itemDTO.getFoodItemId())
//                    .orElseThrow(() -> new RuntimeException("FoodItem not found"));
//            return OrderItem.builder()
//                    .foodItem(foodItem)
//                    .quantity(itemDTO.getQuantity())
//                    .price(foodItem.getPrice().multiply(BigDecimal.valueOf(itemDTO.getQuantity())))
//                    .build();
//        }).collect(Collectors.toList());
//
//        BigDecimal totalAmount = items.stream()
//                .map(OrderItem::getPrice)
//                .reduce(BigDecimal.ZERO, BigDecimal::add);
//
//        Order order = Order.builder()
//                .customerName(orderRequest.getCustomerName())
//                .items(items)
//                .totalAmount(totalAmount)
//                .status(OrderStatus.PENDING)
//                .build();
//
//        Order savedOrder = orderRepository.save(order);
//        return mapToOrderResponseDTO(savedOrder);
//    }
//
//    // Read Order by ID
//    public OrderResponseDTO getOrderById(Long id) {
//        Order order = orderRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Order not found"));
//        return mapToOrderResponseDTO(order);
//    }
//
//    // Read All Orders
//    public List<OrderResponseDTO> getAllOrders() {
//        List<Order> orders = orderRepository.findAll();
//        return orders.stream().map(this::mapToOrderResponseDTO).collect(Collectors.toList());
//    }
//
//    // Update Order
//    public OrderResponseDTO updateOrder(Long id, OrderRequestDTO orderRequest) {
//        Order existingOrder = orderRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Order not found"));
//
//        List<OrderItem> items = orderRequest.getItems().stream().map(itemDTO -> {
//            FoodItem foodItem = foodItemRepository.findById(itemDTO.getFoodItemId())
//                    .orElseThrow(() -> new RuntimeException("FoodItem not found"));
//            return OrderItem.builder()
//                    .foodItem(foodItem)
//                    .quantity(itemDTO.getQuantity())
//                    .price(foodItem.getPrice().multiply(BigDecimal.valueOf(itemDTO.getQuantity())))
//                    .build();
//        }).collect(Collectors.toList());
//
//        BigDecimal totalAmount = items.stream()
//                .map(OrderItem::getPrice)
//                .reduce(BigDecimal.ZERO, BigDecimal::add);
//
//        existingOrder.setCustomerName(orderRequest.getCustomerName());
//        existingOrder.setItems(items);
//        existingOrder.setTotalAmount(totalAmount);
//        existingOrder.setStatus(OrderStatus.PENDING);  // Status 변경도 가능
//
//        orderRepository.save(existingOrder);
//        return mapToOrderResponseDTO(existingOrder);
//    }
//
//    // Delete Order
//    public void deleteOrder(Long id) {
//        Order order = orderRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Order not found"));
//        orderRepository.delete(order);
//    }
//
//    // Convert Order to OrderResponseDTO
//    private OrderResponseDTO mapToOrderResponseDTO(Order order) {
//        List<OrderItemDTO> itemDTOs = order.getItems().stream().map(item ->
//                OrderItemDTO.builder()
//                        .foodItemId(item.getFoodItem().getId())
//                        .quantity(item.getQuantity())
//                        .build()
//        ).collect(Collectors.toList());
//
//        return OrderResponseDTO.builder()
//                .id(order.getId())
//                .customerName(order.getCustomerName())
//                .items(itemDTOs)
//                .totalAmount(order.getTotalAmount())
//                .status(order.getStatus().name())
//                .build();
//    }
}
