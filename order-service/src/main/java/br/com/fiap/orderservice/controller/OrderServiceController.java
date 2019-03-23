package br.com.fiap.orderservice.controller;

import br.com.fiap.orderservice.dto.OrderServiceDto;
import br.com.fiap.orderservice.dto.OrderServiceItemDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class OrderServiceController {

    @GetMapping("getOrders/{id}")
    public ResponseEntity<OrderServiceDto> load(@PathVariable(value="id",required = true) Integer id){

        log.info("getOrders Id: %s", id );

        OrderServiceDto orderDto = new OrderServiceDto();

        return new ResponseEntity<>(orderDto, HttpStatus.OK);

    }

    @GetMapping("/getOrders")
    public ResponseEntity<OrderServiceDto> load(OrderServiceDto orderDto){

        log.info("getOrders All");

        return new ResponseEntity<>(orderDto, HttpStatus.OK);

    }

    @PostMapping("/inputOrder")
    public ResponseEntity<OrderServiceDto> input(OrderServiceDto orderDto){
        return new ResponseEntity<>(orderDto, HttpStatus.OK);
    }

    @PutMapping("/updateOrder")
    public ResponseEntity<OrderServiceDto> update(OrderServiceDto orderDto){
        return new ResponseEntity<>(orderDto, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<OrderServiceDto> delete(@PathVariable(value="id",required = true) Integer id){
        return new ResponseEntity<>(orderDto, HttpStatus.OK);
    }

}
