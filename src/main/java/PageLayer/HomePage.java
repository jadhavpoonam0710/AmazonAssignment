package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class HomePage extends BaseClass{
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBox;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement searchBoxClick;
	
	@FindBy(name="customerName")
	private WebElement firstAndLast;
	
	@FindBy(id="ap_phone_number")
	private WebElement mob;
	
	@FindBy(id="ap_password")
	private WebElement password;
	
	@FindBy(id="continue")
	private WebElement verifyMob;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBox1;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement searchBoxClick1;
	
	
	
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void usersearchproduct(String productName)
	
	{
		UtilsClass.enterValue(searchBox,productName);
		UtilsClass.clickOnElement(searchBoxClick);
	}
	
	public void enterAllDetails(String name,String mobNo,String pass)
	{
		UtilsClass.enterValue(firstAndLast,name);
		UtilsClass.enterValue(mob,mobNo);
		UtilsClass.enterValue(password,pass);
		
	}
	
	public void verifyMobNo()
	{
		UtilsClass.clickOnElement(verifyMob);
	}
	
public void usersearchPhoneproduct(String phone)
	
	{
		UtilsClass.enterValue(searchBox,phone);
		UtilsClass.clickOnElement(searchBoxClick1);
	}

}
