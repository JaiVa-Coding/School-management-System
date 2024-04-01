package com.example.demo.school;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@SpringBootApplication
@RestController
public class GenericRestApiApplication {

    private List<String> items = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(GenericRestApiApplication.class, args);
    }

    @GetMapping("/items")
    public List<String> getItems() {
        return items;
    }

    @PostMapping("/items")
    public String addItem(@RequestBody String item) {
        items.add(item);
        return "Item added successfully";
    }

    @DeleteMapping("/items/{index}")
    public String deleteItem(@PathVariable int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
            return "Item deleted successfully";
        } else {
            return "Index out of bounds";
        }
    }
}


