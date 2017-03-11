import java.util.Set;
import java.util.HashSet;

public class Ex1 {

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
}
