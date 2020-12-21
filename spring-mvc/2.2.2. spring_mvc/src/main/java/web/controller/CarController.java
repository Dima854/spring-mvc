package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carsService) {
        this.carService = carsService;
    }

    @GetMapping("/cars")
    public String getCarsCount(ModelMap model, @RequestParam(defaultValue = "10") int count) {
        model.addAttribute("listCars", carService.getCarsCount(count));
        return "cars";
    }
}
