public class Rectangle {
  int A;
  int B;
  int S;
  public Rectangle(int A, int B, int S){
      this.A=A;
      this.B=B;
      this.S=S;
  }

    @Override
    public String toString() {
        return "Rectangle: \n" +
                "A=" + A +"\n"+
                " B=" + B +"\n"+
                " S=" + S +"";
    }
}

