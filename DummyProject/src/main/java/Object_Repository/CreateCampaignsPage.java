package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignsPage {

	public CreateCampaignsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
@FindAll({@FindBy(xpath="//img[@title='Create Campaign...']"),@FindBy(css="[alt='Create Campaign...']")})
private WebElement campPlusSign;

@FindBy(name="campaignname")
private WebElement campaignName;

@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
private WebElement plusSignToNavigateProductPage;

@FindBy(xpath = "//input[@title='Save [Alt+S]']")
private WebElement saveButton;

public WebElement getCampPlusSign() {
	return campPlusSign;
}

public WebElement getCampaignName() {
	return campaignName;
}

public WebElement getPlusSignToNavigateProductPage() {
	return plusSignToNavigateProductPage;
}

public WebElement getSaveButton() {
	return saveButton;
}
/**
 * 
 */
public void clickCampPlusSign()
{
	campPlusSign.click();
}
	
public void enterCampName(String campName)
{
	campaignName.sendKeys(campName);
}
public void clickProductPlusSign()
{
	plusSignToNavigateProductPage.click();
}
public void clickOnSaveButton()
{
	saveButton.click();
}

}
