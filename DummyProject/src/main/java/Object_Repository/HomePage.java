package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Utilities.WebDriver_utility;

public class HomePage {

	//initilzation
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(linkText = "Organizations")
	private WebElement organizationLink;

	@FindBy(linkText = "Products")
	private WebElement productLink;
	
	@FindBy(linkText = "More")
    private WebElement moreLink;	

	@FindBy(linkText = "Campaigns")
	private WebElement campaignsLink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement logOutImg;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOut;
	
	//gettermethods
	public WebElement getOrganizationLink() {
		return organizationLink;
	}
	
	public WebElement getProductLink() {
		return productLink;
	}

	public WebElement getMoreLink() {
		return moreLink;
	}

	public WebElement getCampaignsLink() {
		return campaignsLink;
	}
	
   public WebElement getLogOutImg() {
		return logOutImg;
	}

    public WebElement getSignOut() {
		return signOut;
	}

	//Business Logics
	/**
	 * this method is used to click organization link
	 */
    public void clickOrganizationLink()
	{
		organizationLink.click();
	}
    
    /**
     *  this method is used to click product link
     */
    public void clickProductLink()
    {
    	productLink.click();
    }
    
    /**
     *  this method is used to click more link
     */
    public void clickMoreLink()
    {
    	moreLink.click();
    }
    
    /**
     *  this method is used to click campaign link
     */
    public void clickCampaignLink()
    {
    	campaignsLink.click();
    }
    
    /**
     * This methos is used to Logout from Application
     */
    public void logOutFromApp()
    {
    	logOutImg.click();
    	signOut.click();
    }
  
    /**
     * This method is used to Logout from Application(Altervative Approch)
     * @param driver
     */
    public void logOut(WebDriver driver)
    {
    	WebDriver_utility wlib = new WebDriver_utility();
    	wlib.moveToElement(driver, logOutImg);
    	signOut.click();
    }
}
