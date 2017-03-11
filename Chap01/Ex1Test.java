import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.hamcrest.Matcher;

public class Ex1Test {

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
}
