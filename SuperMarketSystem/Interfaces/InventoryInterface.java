package ObjectOrientedProgramming.SuperMarketSystem.Interfaces;

import ObjectOrientedProgramming.SuperMarketSystem.Entities.Inventory;

import java.util.List;
import java.util.UUID;

public interface InventoryInterface {
    Inventory addInventory();
    Boolean  deleteInventory(UUID id);
    Inventory updateInventory(UUID id);
    Inventory getInventory(UUID id);
    List<Inventory> getAllInventory();

}

