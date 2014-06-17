package uk.co.slc.helloworld.resources;

     import uk.co.slc.helloworld.representation.Saying;
     import com.google.common.base.Optional;
     import org.junit.Test;
     import static org.assertj.core.api.Assertions.assertThat;

public class TestHelloWorldResources {

    @Test
    public void shouldTakeDefaultNameIfNotNameProvided() throws Exception {
        HelloWorldResource resource = new HelloWorldResource("Hello, %s", "Greg");

        Saying saying = resource.sayHello(Optional.<String>absent());

        assertThat(saying.getContent()).isEqualTo("Hello, Greg");
    }

    @Test
    public void shouldSayHelloUsingTheNameSentInTheQuery() throws Exception {
        HelloWorldResource resource = new HelloWorldResource("Hello, %s", "Greg");

        String bob = "Bob";
        Saying saying = resource.sayHello(Optional.of(bob));

        assertThat(saying.getContent()).isEqualTo("Hello, Bob");
    }

}
