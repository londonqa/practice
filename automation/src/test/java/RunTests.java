import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(tags = "@registration", format={"pretty", "html:target/cucumber"})
public class RunTests {
}
