package com.example.scoop_smiles.exception;


public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(Long id){
        super("Could not found the item with id "+ id);
    }
}

