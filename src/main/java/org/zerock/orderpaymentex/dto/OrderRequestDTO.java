package org.zerock.orderpaymentex.dto;

import lombok.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequestDTO {
    private String customerName;
    private List<OrderItemDTO> items;
}