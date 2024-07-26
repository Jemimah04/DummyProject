package campaign;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import Generic_Utilities.BaseClass;
import Object_Repository.CreateCampaignsPage;
import Object_Repository.HomePage;


public class CreateCampaignTest extends BaseClass {
	//pass
	@Test(groups = "smokeTest")
	public void createCampaignTest() throws Throwable {
		HomePage home = new HomePage(driver);
        home.clickMoreLink();
         home.clickCampaignLink();   
        CreateCampaignsPage campPage = new CreateCampaignsPage(driver);
        campPage.clickCampPlusSign();
        int ranNum = jlib.getRandomNumber();
        
        String campaginName = elib.readExcelDataUsingDataFormatter("Campaign", 0, 0)+ranNum;
        campPage.enterCampName(campaginName);
        
          campPage.clickOnSaveButton();
  String actData = driver.findElement(By.xpath("//span[@id='dtlview_Campaign Name']")).getText();
  
   //Assert.assertEquals(actData, campaginName);
      
  Assert.assertTrue(actData.contains(campaginName));
  
 // Assert.assertTrue(actData.contains(campaginName),campaginName+"campaign name is not verified");
 //  SoftAssert soft = new SoftAssert();
//  soft.assertEquals(actData, campaginName);
//  soft.assertAll();
	
}

}
