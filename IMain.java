interface Playable 
{
    void play();
}
//Football.java
class Football implements Playable {
  public void play() {                         
    System.out.println("Playing football");
    
  }
}
// Volleyball.java
class Volleyball implements Playable 
{
        public void play() 
           {
                System.out.println("Playing volleyball");
            }
}
// Basketball.java
class Basketball implements Playable
 {
        public void play() 
            {
                System.out.println("Playing basketball");
            }
} 
// Main.java
public class IMain {
    public static void main(String[] args)
 {
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();
        football.play();
        volleyball.play();
        basketball.play();
    }
}
