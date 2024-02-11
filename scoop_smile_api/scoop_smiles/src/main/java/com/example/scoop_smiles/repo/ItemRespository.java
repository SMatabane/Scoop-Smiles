package com.example.scoop_smiles.repo;


import com.example.scoop_smiles.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRespository extends JpaRepository<Item,Long> {
    
}
