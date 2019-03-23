package br.com.fiap.orderservice.dto;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class OrderServiceItemDto {
    // preço unitário de cada item, preço total do
    // pagamento, forma de pagamento, data do pedido e status do pedido.
    public long price;
    public String description;
}
