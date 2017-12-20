
public class Caller {
    private String name;
    private int id;
    private static int nextid;
    
    public Caller(String n) {
      name = n;
      nextid++;
      id=nextid;
    }
    
    public String toString(){
        return "ID " + id + "\nName";
        //Isaiah was here
    }
}
