package item.inventory.repository;

import item.inventory.model.Item;
import org.springframework.stereotype.Repository;

@Repository
public class InventoryRepo {

    public void createItem(Item item) {
        try {
            //transaction.begin();
            //persist() method changes the state of the model object from transient state to persistence state

        } catch (Exception e) {
            //transaction.rollback();
        }
    }

}