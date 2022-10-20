import java.util.ArrayList;
public class Match {
    
    private int time;
    private String date;
    private Stadium stadium;
    private String matchTeams;
    private String matchRefree;
    private String result;

    public Match() {
    }
    
    public Match(Team team1 , Team team2 ,int time,String date,Stadium stadium , String matchTeams , String matchRefree, String result) {
        this.time=time;
        this.date=date;
        this.stadium=stadium;
        this.matchTeams=matchTeams;
        this.matchRefree=matchRefree;
        this.result=result;
    }
    Team Ahly = new Team("Ahly");
    Team Zamalek = new Team("Ahly");
    Stadium Salam = new Stadium("Salam","Salam",30000);
  
    public int gettime (){
         
        return this.time;
    }
    public void settime (int time) {
        this.time=time;
    }
    public String getdate (){
        return this.date;
    }
    public void setdate (String date){
        this.date=date;
    }
    public Stadium getstadium (){
        return this.stadium;
    }
    public void setstadium (Stadium stadium){
        this.stadium=stadium;
    }
    public String getmatchTeams (){
        return this.matchTeams;
    }
    public void setmatchTeams (String matchTeams){
        this.matchTeams=matchTeams;
    }
    public String getmatchRefree (){
        return this.matchRefree;
    }
    public void setmatchRefree (String matchRefree){
        this.matchRefree=matchRefree;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    

}
