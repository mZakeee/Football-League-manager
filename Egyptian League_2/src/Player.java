
public class Player extends Person{
    private String Name;
    private int Height;
    private Team team ;
    private String position;

    public Player() {
    }

    public Player(String Name,int Height,int weight,Team team,String position) {
        super(weight);
        this.Name=Name;
        this.Height=Height;
        this.team=team;
        this.position=position;
    }

public String getName()
{
    return Name;
}

public void setName(String name)
{
    this.Name=name;
}

public int getHeight()
{
    return this.Height;
}

public void setHeight(int height)
{    
  this.Height=height ;
}

public int getweight()
{
    return this.getWeight();
}

public void setweight(int weight)
{
this.setWeight(weight);    
}
public Team getteam()
{
    return this.team;
}
public void setteam(Team team)
{
    this.team=team;
}
public String getposition()
{
 return this.position;
}
public void setposition (String position)
{
 this.position=position;   
}
}