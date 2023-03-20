package com.nishithsalian.inventoryservice.services;

import com.nishithsalian.inventoryservice.repository.InventoryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
@Transactional
public class InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;

    public boolean isStockAvailable(String skucode){
        return inventoryRepository.findBySkuCode(skucode).isPresent();
    }
}
