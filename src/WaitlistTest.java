import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class WaitlistTest {
  
  // TODO: Implement tests for removeStudents

  // Hints:
  // - removeStudents is an instance method, so your arrange will need to create an instance of Waitlist
  // - When comparing arrays you should use Arrays.equals instead of the equals instance method or ==
  //     java.util.Arrays is imported for you at the top of this file. 
  @Test
  void TestOne() {
    String[] students = {"Hello", "Octopus", "Barnyard", "e", "r", "x"};
    String[] removed = {"Hello", "Barnyard", "e", "r"};
    Waitlist wait = new Waitlist(students, 6);

    Set<String> toRemove = new HashSet<String>();
    toRemove.add("x");
    toRemove.add("Octopus");

    wait.removeStudents(toRemove);
    System.out.println(wait.getWaitlist().toString());
    boolean equals = Arrays.equals(wait.getWaitlist(), removed);
    if(equals == false) {
      fail("Not equals");
    }
  }
}