package model;

import model.model.*;

public class Main {

 public static void main(String[] args) {

  ItemRepository repo =
          new InMemoryItemRepository();

  System.out.println("CREATE");

  Item server1 =
          new Item(
                  "SVT001",
                  "West Lafayette",
                  State.RUNNING
          );

  Item server2 =
          new Item(
                  "SVT002",
                  "Indianapolis",
                  State.STANDBY
          );

  repo.save(server1);
  repo.save(server2);

  System.out.println(repo.findAll());

  System.out.println("\nREAD");

  System.out.println(
          repo.findById(1)
  );

  System.out.println("\nUPDATE");

  Item updated =
          new Item(
                  "SVT001",
                  "Chicago",
                  State.RUNNING
          );

  updated.setId(1);

  repo.save(updated);

  System.out.println(
          repo.findById(1)
  );

  System.out.println("\nDELETE");

  repo.deleteById(2);

  System.out.println(
          repo.findAll()
  );
 }
}