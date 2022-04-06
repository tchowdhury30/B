import core.data.*;

public class Welcome04_Happiness {
  public static void main(String[] args) {
    DataSource ds = DataSource.connect("happyCrnty.xml").load();
    ArrayList<happy> allcrnty = ds.fetchList("Country", "RANK");
    String happyCrnty;
    int happyRank;
    for (happy crnty : allcrnty) {
      if (crnty.getRank() > happyRank){
        happyRank = crnty.getRank();
        happyCrnty = crnty.getCountry();
      }
    }
    System.out.println(happyCrnty + " is the happiest country. This country gives me hope that one day I'll move there and be happy too.");
  }
}
