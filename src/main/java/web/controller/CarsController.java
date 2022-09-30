package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

    @Controller
    public class CarsController {
        CarServiceImpl impl = new CarServiceImpl();
        @GetMapping(value = "/cars")
        public String getCars(@RequestParam(value = "count", required = false) Integer countOfCar,  Model model){
            if (countOfCar == null || countOfCar >= 5 || countOfCar <= 0){
                model.addAttribute("cars", impl.getCars(5));
            } else {
                model.addAttribute("cars", impl.getCars(countOfCar));
            }
            return "cars";
        }
}
