package item.inventory.model;

public enum ItemStatus {
    AVAILABLE("available"),
    SOLD("sold");

    private final String status;

    private ItemStatus(final String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
