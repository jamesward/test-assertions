import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

public class JUnitTest {
  @Test
  public void one() {
    assertThat("Bob")
            .startsWith("B")
            .endsWith("c");
  }

  @Test
  public void two() {
    assertTrue("Bob".startsWith("B") && "Bob".endsWith("c"));
  }
}
