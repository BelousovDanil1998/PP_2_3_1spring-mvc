package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Lada", 2109, 2007));
        carList.add(new Car("Volga", 21003, 1995));
        carList.add(new Car("Opel", 123, 2009));
        carList.add(new Car("Ferrari", 7, 2019));
        carList.add(new Car("Bugatti", 777, 2017));
        carList = CarService.carsCount(carList, count);
        model.addAttribute("DescriptionText", "Table view for class Car");
        model.addAttribute("carListik", carList);
        return "Cars";
    }
}
