package org.zerock.orderpaymentex.dto;

import lombok.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FoodItemDTO {
    private Long id;
    private String name;
    private BigDecimal price;
}
