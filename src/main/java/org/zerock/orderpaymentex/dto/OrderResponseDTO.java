package org.zerock.orderpaymentex.dto;

import lombok.*;
import java.util.List;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderResponseDTO {
    private Long id;
    private String customerName;
    private List<OrderItemDTO> items;
    private BigDecimal totalAmount;
    private String status;
}