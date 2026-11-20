package model;

import java.util.ArrayList;
import java.util.List;

public class InMemoryItemRepository
        implements Tracker {

 private final List<Item> items =
         new ArrayList<>();

 private int nextId = 1;

 @Override
 public List<Item> findAll() {
  return new ArrayList<>(items);
 }

 @Override
 public Item findById(int id) {

  for (Item item : items) {
   if (item.getId() == id) {
    return item;
   }
  }

  return null;
 }

 @Override
 public Item save(Item item) {

  if (item.getId() == 0) {

   item.setId(nextId++);
   items.add(item);

  } else {

   for (int i = 0;
        i < items.size();
        i++) {

    if (items.get(i).getId()
            == item.getId()) {

     items.set(i, item);
     return item;
    }
   }
  }

  return item;
 }

 @Override
 public void deleteById(int id) {

  items.removeIf(
          item -> item.getId() == id
  );
 }
}