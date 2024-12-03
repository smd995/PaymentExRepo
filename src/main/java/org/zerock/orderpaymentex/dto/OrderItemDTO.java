package org.zerock.orderpaymentex.dto;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItemDTO {
    private Long foodItemId;
    private int quantity;
}