import java.util.ArrayList;
public class Stadium {
   private String Name;
   private String Location;
   private int SeatCapacity; 
   ArrayList<Match>listOfMatches;

    public Stadium() {
    }

    public Stadium(String Name, String Location, int SeatCapacity) {
        this.Name = Name;
        this.Location = Location;
        this.SeatCapacity = SeatCapacity;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getLocation() {
        return Location;
    }
    public void setLocation(String Location) {
        this.Location = Location;
    }
    public int getSeatCapacity() {
        return SeatCapacity;
    }
    public void setSeatCapacity(int SeatCapacity) {
        this.SeatCapacity = SeatCapacity;}}