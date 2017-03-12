import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Ex1 {
  // Exercise 1.1 --------------------------------------------------------------

  /** isUnique() checks whether a String has any repeating characters. It is
      case sensitive. It does this by copying each character from the String
      into a Set, if the size of the set is equal to the length of the String,
      then the String has no duplicate characters.
   */
  public boolean isUnique(String str) {

    // Empty String check
    if (str.length() == 0) {
      throw new IllegalArgumentException("Empty String passed to isUnique()");
    }

    // Uninitialised String check
    if (str == null) {
      throw new NullPointerException("Uninitialised String passed to isUnique()");
    }

    Set<Character> uniques = new HashSet<Character>();

    // Add all chars in str to set
    for (int ii = 0; ii < str.length(); ii++) {
      uniques.add(new Character(str.charAt(ii)));
    }

    if (uniques.size() == str.length()) {
      return true;
    }
    else {
      return false;
    }
  }

  // Exercise 1.2 --------------------------------------------------------------
  public boolean isPermutation(String s1, String s2) {

    // Uninitialised string check
    if (s1 == null || s2 == null) {
      throw new NullPointerException();
    }

    // Empty string check
    if (s1.length() == 0 || s2.length() == 0) {
      throw new IllegalArgumentException("Empty String/s passed to isPermutation()");
    }

    // identical string check
    if (s1.equals(s2)) {
      return false;
    }

    int[] asciiCounts1 = getAsciiCounts(s1);
    int[] asciiCounts2 = getAsciiCounts(s2);

    if (Arrays.equals(asciiCounts1, asciiCounts2)) {
      return true;
    }
    else {
      return false;
    }
  }

  private int[] getAsciiCounts(String s) {

    int[] counts = new int[128];
    int asciiCode;

    for (int ii = 0; ii < s.length(); ii++) {
      asciiCode = (int)s.charAt(ii);
      counts[asciiCode]++;
    }

    return counts;
  }
}
