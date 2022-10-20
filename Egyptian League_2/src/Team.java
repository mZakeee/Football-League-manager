import java.util.ArrayList;

public class Team  {
     private String Name;
     public ArrayList<Player>ListOfPlayers=new ArrayList<Player>();
     public ArrayList<Match>ListOfMatches=new ArrayList<Match>();

    public Team() {
    }
     
     
 public Team(String Name) {
        this.Name=Name;
        
    }
  
public String getName()
{
    return this.Name;
}

public void setName(String Name)
{
    this.Name=Name;
}
}