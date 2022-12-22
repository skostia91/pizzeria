package com;

import com.util.Util;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/pizzeriaShilov/")
public class PizzaController {
    private List<Order> orderList = new ArrayList<>();
    private List<Integer> list = new ArrayList<>();

    @RequestMapping("")
    public String firstPage() {
        return "firstPage";
    }

    @RequestMapping("order")
    public String helloServlet(Model model) {
        model.addAttribute("key1", new Pizza());
        return "orderPizza";
    }

    @RequestMapping("order2")
    public String endServlet(@Valid @RequestParam("numbers") int numbers,
                             @ModelAttribute("key2") Pizza pizza,
                             Model model,

                             BindingResult result) {
        //добавляем дату заказа
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        model.addAttribute("data", formatter.format(date));


        //добавляем вывод суммы заказа
        model.addAttribute("numbers", numbers);
        String[] strings = pizza.getName().split(";");
        orderList.add(new Order(new Pizza(strings[0], Integer.parseInt(strings[1])), numbers));
        Order order = new Order(new Pizza(pizza.getName(), Integer.parseInt(strings[1])), numbers);

        model.addAttribute("value", orderList);

        model.addAttribute("cost", order.getSum());
        list.add(order.getSum());

        model.addAttribute("allCost", Util.sumAllOrders(list));


        //2 Валидация
        if (result.hasErrors()) {
            return "orderPizza";
        } else {
            return "end";
        }
    }
}