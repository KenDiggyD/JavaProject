package model.model;

public class Item {

 private int id;
 private String serviceTag;
 private String location;
 private State state;
 private boolean inService;

 public Item(String serviceTag,
             String location,
             State state) {

  setServiceTag(serviceTag);
  this.location = location;
  this.state = state;
  this.inService = state.getInService();
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {

  if (id < 0) {
   throw new IllegalArgumentException(
           "ID cannot be negative.");
  }

  this.id = id;
 }

 public String getServiceTag() {
  return serviceTag;
 }

 public void setServiceTag(String serviceTag) {

  if (serviceTag == null ||
          serviceTag.trim().isEmpty()) {

   throw new IllegalArgumentException(
           "Service Tag cannot be empty."
   );
  }

  this.serviceTag = serviceTag;
 }

 public String getLocation() {
  return location;
 }

 public State getState() {
  return state;
 }

 public boolean isInService() {
  return inService;
 }

 @Override
 public String toString() {
  return String.format(
          "#%d %s %s %s",
          id,
          serviceTag,
          location,
          state
  );
 }
}