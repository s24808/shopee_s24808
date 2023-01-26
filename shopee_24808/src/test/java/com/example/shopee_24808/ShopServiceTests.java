package com.example.shopee_24808;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
    public class ShopServiceTests {
        @Mock
        private ClientStorage clientStorage;

        @Mock
        private ShopStorage shopStorage;

        @InjectMocks
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
    }

