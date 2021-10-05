package com.example.demo.controller;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;
 
@Controller
@RequestMapping("/customer")

public class CustomerController {
    private static final String VIEW = "customer";
 
    @Autowired
    public CustomerService service;
 
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return VIEW;
    }
 
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView customerList(ModelAndView mov, @RequestParam("rsv_id") String rsv_id) {
 
        mov.setViewName(VIEW);
        Customer customer = service.search(rsv_id);
        mov.addObject("customer", customer);
        return mov;
    }
}
