package item.inventory.controller;

import item.inventory.model.Item;
import item.inventory.model.ItemStatus;
import item.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;



    @RequestMapping(value="/item", method = RequestMethod.POST)
    public ResponseEntity<String> newComment(@RequestBody Map<String,String> request, HttpSession session) {
        Item item=new Item();
        item.setItemName(request.get("itemName"));
        item.setItemEnteredByUser(request.get("itemEnteredByUser"));
                item.setItemEnteredDate(request.get("itemEnteredDate"));
                item.setItemBuyingPrice(Double.valueOf(request.get("itemBuyingPrice")));
        item.setItemSellingPrice(Double.valueOf(request.get("itemSellingPrice")));
        item.setItemStatus(ItemStatus.valueOf(request.get("itemStatus")));
        inventoryService.createItem(item);
        return ResponseEntity.status(HttpStatus.CREATED).body("created");
    }

}