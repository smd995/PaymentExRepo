package org.zerock.orderpaymentex.repository;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.orderpaymentex.domain.FoodItem;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@Log4j2
public class FoodItemRepositoryTests {

    @Autowired
    private FoodItemRepository foodItemRepository;

    @Test
    public void findAll() {
        List<FoodItem> foodItems = foodItemRepository.findAll();

        log.info(foodItems);
    }

    @Test
    public void findById() {
        Long foodItemId = 1L;
        Optional<FoodItem> foodItem = foodItemRepository.findById(foodItemId);

        log.info(foodItem);
    }

    @Test
    public void testInsert() {
        FoodItem foodItem = FoodItem.builder()
                .name("food1")
                .price(BigDecimal.valueOf(10000))
                .build();

        log.info(foodItem);

        foodItemRepository.save(foodItem);
    }

}
