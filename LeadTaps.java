package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadTaps {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		System.out.println(title);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");

		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();

		WebElement crmlink = driver.findElement(By.linkText("CRM/SFA"));
		crmlink.click();

		WebElement leadLink = driver.findElement(By.linkText("Leads"));
		leadLink.click();

		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();

		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Amazon");

		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Jisha");

		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("A");

		WebElement title2 = driver.findElement(By.id("createLeadForm_generalProfTitle"));
		title2.sendKeys("Mrs");

		WebElement salutation = driver.findElement(By.id("createLeadForm_personalTitle"));
		salutation.sendKeys("Mrs");

		WebElement annualRev = driver.findElement(By.id("createLeadForm_annualRevenue"));
		annualRev.sendKeys("3,00,000");

		WebElement birthDate = driver.findElement(By.id("createLeadForm_birthDate"));
		birthDate.sendKeys("03.05.1997");
		
		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("91");
		
		WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("jishachajima@gmail.com");
		
		WebElement phnum = driver.findElement(By.id("createLeadForm_primaryEmail"));
		phnum.sendKeys("7010756688");
		
		WebElement address = driver.findElement(By.id("createLeadForm_generalAddress1"));
				address.sendKeys("no.28,mkb nagar");
				
				
		WebElement city = driver.findElement(By.id("createLeadForm_generalCity"));
				city.sendKeys("chennai");
				
			
			
	
	}

}
