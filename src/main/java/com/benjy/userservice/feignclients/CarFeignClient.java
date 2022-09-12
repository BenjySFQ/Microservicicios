package com.benjy.userservice.feignclients;

import com.benjy.userservice.model.Bike;
import com.benjy.userservice.model.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "car-service", url = "http://localhost:8002",path ="/car")
//@RequestMapping("/car")
public interface CarFeignClient {

    @PostMapping()
    Car save(@RequestBody Car car);

    @GetMapping("/byuser/{userId}")
    List<Car> getCars(@PathVariable("userId")int userId);


}
