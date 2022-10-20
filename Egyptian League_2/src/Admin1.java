import java.util.ArrayList;
import java.util.Scanner;

public class Admin1 {
  private String username;
  private String password;
   
  Team Ahly = new Team("Ahly");
  Team Zamalek = new Team ("Zamalek");
  Team Ittihad = new Team("Ittihad");
  Team Pyramids = new Team("Pyramids");
  Team Ismaily = new Team("Ismaily");
  Team add = new Team("to add new players");
  ArrayList<Match>match=new ArrayList<Match>();
  Team team=new Team("Ahly");
  Team Keeper = new Team(" ");
  Stadium Cairo = new Stadium("Cairo Stadium" , "Cairo" ,80000);
  Stadium Salam = new Stadium("Salam Stadium", "Salam",30000);    
  ArrayList <Team> teams=new ArrayList<Team>();
  ArrayList<Refree>refree=new ArrayList<Refree>();
  ArrayList<Stadium>stadium=new ArrayList<Stadium>();
  Player p1 = new Player("Tau",160,60,Ahly,"Forward");
        Player p2 = new Player("Fathy",180,75,Ahly,"Midfielder");
        Player p3 = new Player("Ashour",175,78,Ittihad,"Midfielder");
        Player p4 = new Player("Zizo",182,73,Zamalek,"Midfielder");
        Player p5 = new Player("Alaa",187,79,Zamalek,"Defender");
        Player p6 = new Player("Salah",172,70,Ismaily,"Midfielder");
        Player p7 = new Player("Halwani",184,77,Pyramids,"Midfielder");
        Player p8 = new Player("Shikabala",178,63,Zamalek,"Forward");
        Player p9 = new Player("Ramadan",186,76,Pyramids,"Forward");
        Player p10 = new Player("Rahil",165,83,Ismaily,"Defender");
        Player p11 = new Player("Shenawy",200,82,Ahly,"Goalkeeper");
        Player p12 = new Player("Zonfoly",190,74,Ismaily,"Goalkeeper");
        Player p13 = new Player("Oussa",195,85,Pyramids,"Goalkeeper");
        Player p14 = new Player("Sherief",188,71,Ahly,"Forward");
        Player p15 = new Player("Maalol",179,72,Ahly,"Defender");
        Player p16 = new Player("Gad",191,80,Pyramids,"Goalkeeper");
 
  Match m = new Match(Ahly,Zamalek,9,"first of may",Cairo,"Ahly vs Zamalek","mostafa ghorbal","two-zero for Ahly");
  
    public Admin1() {
        this.username ="admin";
        this.password ="123";
        stadium.add(0,Cairo);
        stadium.add(1,Salam);
    }
    
    public void SignUp(String name , String pass)
    {
        username=name;
        password=pass;
    }
     public boolean login(String user, String pass)
    {
    if (user.equals(username)&&(pass.equals(password)))
    {
        return true ;
    }
    else 
    {
            return false;
    }
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
       
    public void display()
    {
          
         
       match.add(m);
        

                
        teams.add(Ahly);
        teams.add(Ittihad);
        teams.add(Zamalek);
        teams.add(Pyramids);
        teams.add(Ismaily);
        
        Ahly.ListOfPlayers.add(p1);
        Ahly.ListOfPlayers.add(p2);
        Ittihad.ListOfPlayers.add(p3);
        Zamalek.ListOfPlayers.add(p4);
        Zamalek.ListOfPlayers.add(p5);
        Ismaily.ListOfPlayers.add(p6);
        Pyramids.ListOfPlayers.add(p7);
        Zamalek.ListOfPlayers.add(p8);
        Pyramids.ListOfPlayers.add(p9);
        Ismaily.ListOfPlayers.add(p10);
        Ahly.ListOfPlayers.add(p11);
        Ismaily.ListOfPlayers.add(p12);
        Pyramids.ListOfPlayers.add(p13);
        Ahly.ListOfPlayers.add(p14);
        Ahly.ListOfPlayers.add(p15);
        
       
        
       team.ListOfPlayers.add(p1);
        team.ListOfPlayers.add(p2);
        team.ListOfPlayers.add(p3);
        team.ListOfPlayers.add(p4);
        team.ListOfPlayers.add(p5);
        team.ListOfPlayers.add(p6);
        team.ListOfPlayers.add(p7);
        team.ListOfPlayers.add(p8);
        team.ListOfPlayers.add(p9);
        team.ListOfPlayers.add(p10);
        team.ListOfPlayers.add(p14);
        team.ListOfPlayers.add(p15);
        Keeper.ListOfPlayers.add(p16);
        Keeper.ListOfPlayers.add(p11);
        Keeper.ListOfPlayers.add(p12);
        Keeper.ListOfPlayers.add(p13);
       
       for(int j=0 ; j<10;j++){
            for(int k=j+1 ; k<team.ListOfPlayers.size();k++){
               if(team.ListOfPlayers.get(k).getHeight()>team.ListOfPlayers.get(j).getHeight()){
                         Player temp;
            temp=team.ListOfPlayers.get(j);
            team.ListOfPlayers.set(j,team.ListOfPlayers.get(k));
            team.ListOfPlayers.set(k, temp);
            }}
        }
       for(int j=0 ; j<10;j++){
            for(int k=j+1 ; k<Keeper.ListOfPlayers.size();k++){
               if(Keeper.ListOfPlayers.get(k).getHeight()>Keeper.ListOfPlayers.get(j).getHeight()){
                         Player temp;
            temp=Keeper.ListOfPlayers.get(j);
            Keeper.ListOfPlayers.set(j,Keeper.ListOfPlayers.get(k));
            Keeper.ListOfPlayers.set(k, temp);
            }}
        }    
    
    
    }
    public String bestM()
    {
      return "Best Match: Ahly VS Zamalek";  
    }
    public String bestR()
    {
        return "Best Refree: Mostafa Ghorbal";
    }
    public String bestS()
    {
        return "Best Stadium: Cairo Stadium";
    }
     public void addPlayer(Team r, Player z)
    {
          r.ListOfPlayers.add(z);
    }
     public void addTeam(Team t )
     {
         teams.add(t);
     }
    public void addStadium(Stadium c)
    {
        stadium.add(c);
    }
    public void addRefree(Refree r)
    {
        refree.add(r);
    }
    public void addMatch(Match a)
    {
        match.add(a);
    }
public void deletePlayer (int index,Team r)
{   
 r.ListOfPlayers.remove(index);
}
public void deleteMatch (int index)
{
match.remove(index);
}

public void deleteTeam (int index)
{
    teams.remove(index);
}
public void deleteRefree(int index)
{
    refree.remove(index);
}
public void deleteStadium(int index)
{
    stadium.remove(index);
}
public void editPlayer (int index,Player a,Team c) 
{
c.ListOfPlayers.set(index, a);
}

    
public void editMatch (int index , Match b) 
{
match.set(index, b);
}

    
public void editTeam (int index , Team c)   
{
    teams.set(index,c);
}
public void editRefree(int index,Refree t)
{
    refree.set(index, t);
}
public void editStadium(int index ,Stadium g)
{
    stadium.set(index,g);
}
 public Player displayPlayer(Team r,int index)
 {
    return r.ListOfPlayers.get(index);
 }
 public Team displayTeam(int index)
 {
     return teams.get(index);
 }
 public Stadium displayStadium(int index)
 {
     return stadium.get(index);
 }
 public Refree displayRefree(int index)
 {
    return refree.get(index);
 }
 public Match displayMatch(int index)
 {
     return match.get(index);
 }
}