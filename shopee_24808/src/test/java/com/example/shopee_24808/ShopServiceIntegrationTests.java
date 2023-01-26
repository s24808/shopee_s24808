package com.example.shopee_24808;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class ShopServiceIntegrationTests {

    @SpringBootTest
    public class ShopServiceIntegraionTests {
        @MockBean
        private ClientStorage clientStorage;

        @MockBean
        private ShopStorage shopStorage;

        @Autowired
        private ShopService shopService;

        @Test
        void balanceShouldDecreaseByProperAmount() {
            // given

            Client client = new Client("1", 2000);
            Cart cart = new Cart("mleko");
            when(clientStorage.getClientByID(any())).thenReturn(client);
            when(shopStorage.getItemByName(any())).thenReturn(cart);

            // when
            Cart cart1 = shopService.buyItem("1", "mleko", 100);

            // then
            assertThat(cart1.getPrice()).isEqualTo(1900);
        }
    }}
