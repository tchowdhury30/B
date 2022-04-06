public class happy{
  private String country;
  private int rank;

  happy(String country, int rank) {
     this.country = country;
     this.rank = rank;
  }

  public static String getCountry(){
    return this.country;
  }

  public static int getRank(){
    return this.rank;
  }
}
