package br.com.fiap.orderservice.controller;

import br.com.fiap.orderservice.dto.OrderServiceDto;
import br.com.fiap.orderservice.dto.OrderServiceItemDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Slf4j
@RestController
@RequestMapping("orders")
public class OrderServiceController {

    OrderServiceDto orderDto = new OrderServiceDto();

    @GetMapping("/{id}")
    public ResponseEntity<OrderServiceDto> load(@PathVariable(value="id",required = true) Integer id){

        log.info("getOrders Id: {}", id );

        return new ResponseEntity<>(orderDto, HttpStatus.OK);

    }

    @GetMapping()
    public ResponseEntity<ArrayList<OrderServiceDto>> all(){

        log.info("getOrders All");

        ArrayList<OrderServiceDto> orders = new ArrayList<>();

        return new ResponseEntity<>(orders, HttpStatus.OK);

    }

    @PostMapping()
    public ResponseEntity<OrderServiceDto> input(@RequestBody OrderServiceDto orderDto){
        return new ResponseEntity<>(orderDto, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderServiceDto> update(@RequestBody OrderServiceDto orderDto){
        return new ResponseEntity<>(orderDto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<OrderServiceDto> delete(@PathVariable(value="id",required = true) Integer id){
        return new ResponseEntity<>(orderDto, HttpStatus.OK);
    }

}
