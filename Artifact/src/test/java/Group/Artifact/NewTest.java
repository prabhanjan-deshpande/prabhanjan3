package Group.Artifact;

import org.testng.annotations.Test;

public class NewTest {
	HomePage homepage = new HomePage();
	
  @Test
  public void basicTest() throws InterruptedException {
	  homepage.openHomePage();
	  homepage.selectType("One-way");
	  homepage.enterValidDetails("NYC", "SFO");
	  homepage.selectDate();
	  homepage.searchButton();
  }
}
