import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.hamcrest.Matcher;

public class Ex1Test {

  // Exercise 1.1 --------------------------------------------------------------
  @Test
  public void testNormalInputIsUnique() {
    Ex1 ex1 = new Ex1();
    assertTrue("expected true", ex1.isUnique("New York"));
    assertFalse("expected false", ex1.isUnique("outstanding"));
    assertTrue("expected trure", ex1.isUnique("!"));
    assertTrue("expected true", ex1.isUnique("qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM"));
    assertFalse("expected false", ex1.isUnique("aaaaaaaa"));
    assertTrue("expected true", ex1.isUnique("bB"));
  }

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void testNullExceptionIsUnique() {
    Ex1 ex1 = new Ex1();

    thrown.expect(NullPointerException.class);
    //thrown.expectMessage("Uninitialised String passed to isUnique()");
    ex1.isUnique(null);
  }

  @Test
  public void testIllegalArgumentExceptionIsUnique() {
    Ex1 ex1 = new Ex1();

    thrown.expect(IllegalArgumentException.class);
    //thrown.expectMessage("");
    ex1.isUnique("");
  }

  // Exercise 1.2 --------------------------------------------------------------
  @Test
  public void testNormalInputIsPermutation() {
    Ex1 ex1 = new Ex1();
    assertTrue("expected true", ex1.isPermutation("banana", "nabana"));
    assertFalse("expected false", ex1.isPermutation("12345", "12346"));
    assertFalse("expected false", ex1.isPermutation("acted", "act"));
    assertFalse("expected false", ex1.isPermutation("out", "feast"));
    assertFalse("expected false", ex1.isPermutation("1234555", "1112345"));
    assertFalse("expected false", ex1.isPermutation("equal", "equal"));
    assertTrue("expected true", ex1.isPermutation("qwertyuiopasdfghjklzxcvbnm", "mnbvcxzlkjhgfdsapoiuytrewq"));
    assertFalse("expected false", ex1.isPermutation("a", "b"));
    assertFalse("expected false", ex1.isPermutation("aaaaa", "aaa"));
  }

  @Test
  public void testTwoEmptyStringsIsPermutation() {
    Ex1 ex1 = new Ex1();

    thrown.expect(IllegalArgumentException.class);
    ex1.isPermutation("", "");
  }

  @Test
  public void testFirstEmptyStringsIsPermutation() {
    Ex1 ex1 = new Ex1();

    thrown.expect(IllegalArgumentException.class);
    ex1.isPermutation("", "foo");
  }

  @Test
  public void testSecondEmptyStringsIsPermutation() {
    Ex1 ex1 = new Ex1();

    thrown.expect(IllegalArgumentException.class);
    ex1.isPermutation("bar", "");
  }

  @Test
  public void testTwoNullsIsPermutation() {
    Ex1 ex1 = new Ex1();

    thrown.expect(NullPointerException.class);
    ex1.isPermutation(null, null);
  }

  @Test
  public void testFirstNullsIsPermutation() {
    Ex1 ex1 = new Ex1();

    thrown.expect(NullPointerException.class);
    ex1.isPermutation(null, "bar");
  }

  @Test
  public void testSecondNullsIsPermutation() {
    Ex1 ex1 = new Ex1();

    thrown.expect(NullPointerException.class);
    ex1.isPermutation(null, "bar");
  }

  @Test
  public void testNullsWithEmptyStringIsPermutation() {
    Ex1 ex1 = new Ex1();

    thrown.expect(NullPointerException.class);
    ex1.isPermutation(null, "");
  }
}
