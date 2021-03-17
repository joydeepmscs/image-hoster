package item.inventory.model;

import javax.persistence.*;

@Entity
@Table(name="item")
public class Item {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer itemId;
    private String itemName;
    private String itemEnteredByUser;
    private String itemEnteredDate;
    private double itemBuyingPrice;
    private  double itemSellingPrice;
    private String itemLastModifiedDate;
    private String itemLastModifiedByUser;
    private ItemStatus itemStatus;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemEnteredByUser() {
        return itemEnteredByUser;
    }

    public void setItemEnteredByUser(String itemEnteredByUser) {
        this.itemEnteredByUser = itemEnteredByUser;
    }

    public String getItemEnteredDate() {
        return itemEnteredDate;
    }

    public void setItemEnteredDate(String itemEnteredDate) {
        this.itemEnteredDate = itemEnteredDate;
    }

    public double getItemBuyingPrice() {
        return itemBuyingPrice;
    }

    public void setItemBuyingPrice(double itemBuyingPrice) {
        this.itemBuyingPrice = itemBuyingPrice;
    }

    public double getItemSellingPrice() {
        return itemSellingPrice;
    }

    public void setItemSellingPrice(double itemSellingPrice) {
        this.itemSellingPrice = itemSellingPrice;
    }

    public String getItemLastModifiedDate() {
        return itemLastModifiedDate;
    }

    public void setItemLastModifiedDate(String itemLastModifiedDate) {
        this.itemLastModifiedDate = itemLastModifiedDate;
    }

    public String getItemLastModifiedByUser() {
        return itemLastModifiedByUser;
    }

    public void setItemLastModifiedByUser(String itemLastModifiedByUser) {
        this.itemLastModifiedByUser = itemLastModifiedByUser;
    }

    public ItemStatus getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(ItemStatus itemStatus) {
        this.itemStatus = itemStatus;
    }


}
