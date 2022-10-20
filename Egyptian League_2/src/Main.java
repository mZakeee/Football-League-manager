import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
       Boolean w=false;
      Admin1 admin = new Admin1();
      Team tmm = new Team();
      Match match = new Match(admin.Ahly,admin.Zamalek,21,"Sunday",admin.Salam,"AhlyVSZamalek","Omar","6-1");
      Match mtch = new Match(admin.Ismaily,admin.Ittihad,21,"Sunday",admin.Cairo,"IsmailyVSIttihad","Ghorbal","0-0");
      Stadium Salam = new Stadium("Salam","Salam",30000);
      Stadium Cairo = new Stadium("Cairo" , "Cairo",80000);
      //Refree ref = new Refree(" ",51,5412);
      System.out.println("press 1 to login or 2 to to sign up");
      int x = input.nextInt();
      int num = 99/0;
    if(x==1)
    {
      System.out.println("Enter username");
      String user = input.next();
      System.out.println("Enter password");
      String pass = input2.next();
       w =admin.login(user, pass);
      if(w)
      {
          System.out.println("login success");
      }
      if(admin.login(user, pass)==false)
      {
          System.out.println("Login failed");
      }
    }
    if(x==2)
    {
        System.out.println("Enter your name");
        admin.setUsername(input.next());
        System.out.println("Enter password");
        admin.setPassword(input.next());
            System.out.println("Registered sccessfully");
            w=true;
    }
    if(w)
    {
     admin.addTeam(tmm);
    admin.stadium.add(Cairo);
    admin.stadium.add(Salam);
    System.out.println("Press 5 to display league reports");
    int l = input.nextInt();
    admin.display();
    
    admin.refree.size();
    
     admin.match.add(match);
     admin.addMatch(mtch);
      
     admin.deleteMatch(0);
      
    admin.editTeam(0,tmm);
    Player p99 = new Player ();
    admin.addPlayer(admin.team, p99);
    admin.editPlayer(1, p99,admin.Ahly);
    admin.displayPlayer(admin.team,0);
    admin.editStadium(0,Salam);  
    admin.deletePlayer(0,admin.team);
    admin.displayTeam(0);
    admin.editMatch(0,mtch);
    admin.addStadium(Salam);
    admin.addStadium(Cairo);
    admin.displayStadium(0);
    admin.deleteStadium(0); 
    admin.deleteTeam(0);
   
    admin.displayMatch(0);
    
    }   
} 
}