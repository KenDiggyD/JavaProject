package model.model;

import java.util.List;

public interface ItemRepository {

 List<Item> findAll();

 Item findById(int id);

 Item save(Item item);

 void deleteById(int id);
}