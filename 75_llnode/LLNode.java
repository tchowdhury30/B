// Team Acid: Yuki Feng, Tasnim Chowdhury, Faiyaz Rafee
// APCS pd08
// HW75: Node Recall
// 2022-03-09
// time spent: 0.5 hrs

/*
DISCO

QCC
*/

public class LLNode {
  private String cargo;
  private LLNode cdr;

  public LLNode(String cargo, LLNode cdr) {
    this.cargo = cargo;
    this.cdr = cdr;
  }

  public String getCargo() {
    return this.cargo;
  }

  public LLNode getCDR() {
    return this.cdr;
  }

  public setCargo(String ncargo) {
    String old = this.cargo;
    this.cargo = ncargo;
    return old;
  }

  public setCDR(LLNode nCDR) {
    LLNode old = this.cdr;
    this.cdr = nCDR;
    return old;
  }

  public String toString() {
    return this.cargo + ", " + this.cdr;
  }

  public public static void main(String[] args) {

  }

}
