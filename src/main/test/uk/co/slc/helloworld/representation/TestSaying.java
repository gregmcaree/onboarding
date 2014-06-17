package uk.co.slc.helloworld.representation;

   import org.junit.Test;
   import static org.assertj.core.api.Assertions.assertThat;

public class TestSaying  {

    @Test
    public void shouldSaySomething()
    {
        Saying something = new Saying(1, "something");
        assertThat(something.getContent()).isEqualTo("something");
    }
}
