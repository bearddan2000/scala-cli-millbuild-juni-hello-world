package example;

import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._

class TestMain {
    @Test
    def testGreeting  {
      assertEquals("Hello World", hello.Constants.hello)
    }
}
