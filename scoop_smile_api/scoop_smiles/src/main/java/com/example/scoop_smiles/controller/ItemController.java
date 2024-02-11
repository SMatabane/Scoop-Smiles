package com.example.scoop_smiles.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.scoop_smiles.model.Item;
import com.example.scoop_smiles.repo.ItemRespository;
import com.example.scoop_smiles.exception.ItemNotFoundException;

import java.util.List;
@RestController
@CrossOrigin("http://localhost:3000")
public class ItemController {
    @Autowired
    private ItemRespository itemRepository;

    @PostMapping("/item")
    Item newItem(@RequestBody Item newItem) {
        return itemRepository.save(newItem);
    }

    @GetMapping("/items")
    List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @GetMapping("/item/{id}")
    Item getItemById(@PathVariable Long id) {
        return itemRepository.findById(id)
                .orElseThrow(() -> new ItemNotFoundException(id));
    }

    @PutMapping("/item/{id}")
    Item updateItem(@RequestBody Item newItem, @PathVariable Long id) {
        return itemRepository.findById(id)
                .map(item -> {
                    item.setname(newItem.getname());
                    item.setdescription(newItem.getdescription());
                    item.setprice(newItem.getprice());
                    return itemRepository.save(item);
                }).orElseThrow(() -> new ItemNotFoundException(id));
    }

    @DeleteMapping("/item/{id}")
    String deleteItem(@PathVariable Long id){
        if(!itemRepository.existsById(id)){
            throw new ItemNotFoundException(id);
        }
        itemRepository.deleteById(id);
        return  "Item with id "+id+" has been deleted success.";
    }
}
