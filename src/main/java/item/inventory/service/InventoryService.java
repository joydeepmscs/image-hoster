package item.inventory.service;

import item.inventory.model.Item;
import item.inventory.repository.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepo inventoryRepo;

    public void createItem(Item item) {
        inventoryRepo.createItem(item);
    }

}
