import java.util.ArrayList;

public class League  {
    private int startingDate;
    private int endingDate;
    ArrayList <Match> listOfMatches;
    ArrayList <Team> listOfTeams;
    ArrayList<Player> ListOfPlayers;

    public League() {
    }
  
    public League(int startingDate , int endingDate )
    {
        this.endingDate=endingDate;
        this.startingDate=startingDate;
     

    }
    
    public int getstartingDate()
    {
        return this.startingDate;
    
    }
    public void setstartingDate(int startingDate)
    {
        this.startingDate=startingDate;
    }
    public int getendingDate()
    {
        return this.endingDate;
    }
    public void setendingDate(int endingDate)
    {
        this.endingDate=endingDate;
    }
   
}
