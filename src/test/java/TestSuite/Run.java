package TestSuite;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Darren\\IdeaProjects\\AsdaGroceryProject\\src\\test\\Resources\\asdaProductSearch.feature", plugin = "json:target/cucumber.json")
public class Run {
}
