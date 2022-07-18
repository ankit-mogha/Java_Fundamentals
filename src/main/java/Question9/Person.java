package Question9;

public class Person {
  int addressId;
  String name;
  String city;
  String Flat;
  String State;

  public Person(int addressId, String name, String city, String flat, String state) {
    this.addressId = addressId;
    this.name = name;
    this.city = city;
    Flat = flat;
    State = state;
  }

  public String getCity() {
    return city;
  }
}
