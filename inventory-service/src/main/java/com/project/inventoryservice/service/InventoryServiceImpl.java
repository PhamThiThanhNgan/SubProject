package com.project.inventoryservice.service;

import com.project.inventoryservice.entity.Inventory;
import com.project.inventoryservice.repository.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class InventoryServiceImpl implements InventoryService{

    @Autowired
    private InventoryRepo inventoryRepo;

    @Override
    public Inventory getInventoryOfProductBySkuCode(String skucode) {
        return inventoryRepo.getInventoryOfProductBySkuCode(skucode);
    }
    @Override
    public boolean updateProductQuantityBySkuCode(int quantity, String skuCode) {
        try {
            int quantityInventory = inventoryRepo.getQuantityBySkuCode(skuCode);
            int quantityTemp = quantityInventory - quantity;
            inventoryRepo.updateProductQuantityBySkuCode(quantityTemp, skuCode);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }


}
