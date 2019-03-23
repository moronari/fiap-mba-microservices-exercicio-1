package br.com.fiap.orderservice.dto;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

//Crie um endpoint chamado findById que receba um id do pedido e retorne
//        objeto DTO Order com os seguintes atributos caso encontrado. email, Nome
//        completo e shipping address, id do pedido, descrição de cada item do pedido,
//        quantidade de itens do pedido, preço unitário de cada item, preço total do
//        pagamento, forma de pagamento, data do pedido e status do pedido. Adicione
//        também os atributos de pagamento como id da transação, número do cartão,
//        validade do cartão, bandeira;

public class OrderServiceDto {
    private Integer id;
    private String email;
    private String nome;
    private String shippingAddress;
    private ArrayList<OrderServiceItemDto> item = new ArrayList();
    private Integer idPayment;
    private String cardNumber;
}
