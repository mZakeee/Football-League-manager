import java.util.ArrayList;
public class Refree extends Person{
    String Name;
    int Height;
    ArrayList<String> listOfMatches;
    ArrayList<Refree> ref=new ArrayList();
    Refree refree1 = new Refree("Mostafa Ghorbal",185,70);
Refree refree2 = new Refree("Mahmoud El Banna",173,87);

    public Refree() {
    }

    public Refree(String Name, int Height, int weight) {
        super(weight);
        this.Height=Height;
        this.Name=Name;
        
    }
    public String getName() {
        ref.add(refree1);
        ref.add(refree2);
        return this.Name;
        
    }
    
    public void setName(String name) {
        this.Name=name;
    }
    
    public int getHeight() {
        return this.Height;
    }
    
    public void setHeight(int height) {
          this.Height=height;
    }
    
    public int getweight() {
        return getWeight();
    }

    public void setweight(int weight) {
        this.setWeight(weight);
    }
    
}
