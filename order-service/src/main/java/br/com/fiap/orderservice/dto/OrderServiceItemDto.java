package br.com.fiap.orderservice.dto;

import lombok.*;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class OrderServiceItemDto {

    public Integer id;

    @Digits(integer = 6, fraction = 2)
    public BigDecimal price;

    public String description;

}
