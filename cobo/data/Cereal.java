public class Cereal {

  private String _name;
  private char _type;
  private int _calories, _protein, _fat, _sodium, _sugar, _potassium, _vitamins, _shelf;
  private double _fiber, _carbohydrates, _weight, _cups, _rating;

  public Cereal(String name, char type, int calories, int protein, int fat, int sodium,
                double fiber, double carbohydrates, int sugar, int potassium, int vitamins,
                int shelf, double weight, double cups, double rating) {
    this._name = name;
    this._type = type;
    this._calories = calories;
    this._protein = protein;
    this._fat = fat;
    this._sodium = sodium;
    this._sugar = sugar;
    this._potassium = potassium;
    this._vitamins = vitamins;
    this._shelf = shelf;
    this._fiber = fiber;
    this._carbohydrates = carbohydrates;
    this._weight = weight;
    this._cups = cups;
    this._rating = rating;
  }

  public String getName() {
    return _name;
  }

  public char getType() {
    return _type;
  }

  public int getCalories() {
    return _calories;
  }

  public int getProtein() {
    return _protein;
  }

  public int getFat() {
    return _fat;
  }

  public int getSodium() {
    return _sodium;
  }

  public double getFiber() {
    return _fiber;
  }

  public double getCarbohydrates() {
    return _carbohydrates;
  }

  public int getSugar() {
    return _sugar;
  }

  public int getPotassium() {
    return _potassium;
  }

  public int getVitamins() {
    return _vitamins;
  }

  public int getShelf() {
    return _shelf;
  }

  public double getWeight() {
    return _weight;
  }

  public double getCups() {
    return _cups;
  }

  public double getRating() {
    return _rating;
  }

  public String toString() {
    String s = "";
    s += "Name: " + _name;
    s += "\nType: " + _type;
    s += "\nCalories: " + _calories;
    s += "\nProtein: " + _protein;
    s += "\nFat: " + _fat;
    s += "\nSodium: " + _sodium;
    s += "\nFiber: " + _fiber;
    s += "\nCarbohydrates: " + _carbohydrates;
    s += "\nSugar: " + _sugar;
    s += "\nPotassium: " + _potassium;
    s += "\nVitamins: " + _vitamins;
    s += "\nShelf: " + _shelf;
    s += "\nWeight: " + _weight;
    s += "\nCups: " + _cups;
    s += "\nRating: " + _rating;
    return s;
  }

  public static void main(String[] args) {
    Cereal hundo_bran = new Cereal("100% Bran", 'C', 70, 4, 1, 130, 10, 5, 6, 280, 25, 3, 1, 0.33, 68.402973);
    System.out.println(hundo_bran);
    System.out.println();

    Cereal hundo_nat_bran = new Cereal("100% Natural Bran", 'C', 120, 3, 5, 15, 2, 8, 8, 135, 0, 3, 1, 1, 33.983679);
    System.out.println(hundo_nat_bran);
    System.out.println();

    // a's
    Cereal all_bran = new Cereal("All-Bran", 'C', 70, 4, 1, 260, 9, 7, 5, 320, 25, 3, 1, 0.33, 59.425505);
    System.out.println(all_bran);
    System.out.println();

    Cereal all_bran_xtra_fiber = new Cereal("All-Bran with Extra Fiber", 'C', 50, 4, 0, 140, 14, 8, 0, 330, 25, 3, 1, 0.5, 93.704912);
    System.out.println(all_bran_xtra_fiber);
    System.out.println();

    Cereal almond_delight = new Cereal("Almond Delight", 'C', 110, 2, 2, 200, 1, 14, 8, -1, 25, 3, 1, 0.75, 34.384843);
    System.out.println(almond_delight);
    System.out.println();

    Cereal apple_cinnamon_cheerios = new Cereal("Apple Cinnamon Cheerios", 'C', 110, 2, 2, 180, 1.5, 10.5, 10, 70, 25, 1, 1, 0.75, 29.509541);
    System.out.println(apple_cinnamon_cheerios);
    System.out.println();

    Cereal apple_jacks = new Cereal("Apple Jacks", 'C', 110, 2, 0, 125, 1, 11, 14, 30, 25, 2, 1, 1, 33.174094);
    System.out.println(apple_jacks);
    System.out.println();

    // b's
    Cereal basic_four = new Cereal("Basic 4", 'C', 130, 3, 2, 210, 2, 18, 8, 100, 25, 3, 1.33, 0.75, 37.038562);
    System.out.println(basic_four);
    System.out.println();

    Cereal bran_chex = new Cereal("Bran Chex", 'C', 90, 2, 1, 200, 4, 15, 6, 125, 25, 1, 1, 0.67, 49.120253);
    System.out.println(bran_chex);
    System.out.println();

    Cereal bran_flakes = new Cereal("Bran Flakes", 'C', 90, 3, 0, 210, 5, 13, 5, 190, 25, 3, 1, 0.67, 53.313813);
    System.out.println(bran_flakes);
    System.out.println();

    // c's
    Cereal cap_n_crunch = new Cereal("Cap'n'Crunch", 'C', 120, 1, 2, 220, 0, 12, 12, 35, 25, 2, 1, 0.75, 18.042851);
    System.out.println(cap_n_crunch);
    System.out.println();

    Cereal cheerios = new Cereal("Cheerios", 'C', 110, 6, 2, 290, 2, 17, 1, 105, 25, 1, 1, 1.25, 50.764999);
    System.out.println(cheerios);
    System.out.println();

    Cereal cinnamon_toast_crunch = new Cereal("Cinammon Toast Crunch", 'C', 120, 1, 3, 210, 0, 13, 9, 45, 25, 2, 1, 0.75, 19.823573);
    System.out.println(cinnamon_toast_crunch);
    System.out.println();

    Cereal clusters = new Cereal("Clusters", 'C', 110, 3, 2, 140, 2, 13, 7, 105, 25, 3, 1, 0.5, 40.400208);
    System.out.println(clusters);
    System.out.println();

    Cereal cocoa_puffs = new Cereal("Cocoa Puffs", 'C', 110, 1, 1, 180, 0, 12, 13, 55, 25, 2, 1, 1, 22.736446);
    System.out.println(cocoa_puffs);
    System.out.println();

    Cereal corn_chex = new Cereal("Corn Chex", 'C', 110, 2, 0, 280, 0, 22, 3, 25, 25, 1, 1, 1, 41.445019);
    System.out.println(corn_chex);
    System.out.println();

    Cereal corn_flakes = new Cereal("Corn Flakes", 'C', 100, 2, 0, 290, 1, 21, 2, 35, 25, 1, 1, 1, 45.863324);
    System.out.println(corn_flakes);
    System.out.println();

    Cereal corn_pops = new Cereal("Corn Pops", 'C', 110, 1, 0, 90, 1, 13, 12, 20, 25, 2, 1, 1, 35.782791);
    System.out.println(corn_pops);
    System.out.println();

    Cereal count_chocula = new Cereal("Count Chocula", 'C', 110, 1, 1, 180, 0, 12, 13, 65, 25, 2, 1, 1, 22.396513);
    System.out.println(count_chocula);
    System.out.println();

    Cereal cracklin_oat_bran = new Cereal("Cracklin' Oat Bran", 'C', 110, 3, 3, 140, 4, 10, 7, 160, 25, 3, 1, 0.5, 40.448772);
    System.out.println(cracklin_oat_bran);
    System.out.println();

    Cereal cream_of_wheat = new Cereal("Cream of Wheat (Quick)", 'H', 100, 3, 0, 80, 1, 21, 0, -1, 0, 2, 1, 1, 64.533816);
    System.out.println(cream_of_wheat);
  }


}
