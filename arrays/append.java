import java.util.ArrayList;

public class append {

  public static void main (String[] args) {

    ArrayList<String> a = new ArrayList<String>();

    a.add("foo");
    a.add("bar");
    a.add("baz");

    for (String s : a) {
      System.out.println(s);
    }


  }

}
