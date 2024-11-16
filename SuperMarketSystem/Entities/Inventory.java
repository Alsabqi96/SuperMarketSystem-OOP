package ObjectOrientedProgramming.SuperMarketSystem.Entities;

import java.util.List;
import java.util.UUID;

public class Inventory {

    private UUID id;
    private List<Product> productListInStock;
    private List<Employee> warehouseWorkers;
    private String location;

    public List<Product> getProductListInStock() {
        return productListInStock;
    }

    public void setProductListInStock(List<Product> productListInStock) {
        this.productListInStock = productListInStock;
    }

    public List<Employee> getWarehouseWorkers() {
        return warehouseWorkers;
    }

    public void setWarehouseWorkers(List<Employee> warehouseWorkers) {
        this.warehouseWorkers = warehouseWorkers;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}

