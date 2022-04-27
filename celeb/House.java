// Insomniac Raccoons :: Faiza Huda, Tasnim Chowdhury, Diana Akhmedova
// APCS pd08
// L09 -- Some Folks Call It A Charades
// 2022-04-27w
// time spent: 4 hours

public class House extends Building {
  private String houseNumber = "";

  public House(int floor, int people, String houseNumber) {
    super(floor, people);
    this.houseNumber = houseNumber;
  }
  public String getHouseNumber(){
    return this.houseNumber;
  }

}
