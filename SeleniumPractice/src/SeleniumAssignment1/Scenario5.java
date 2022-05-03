package SeleniumAssignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario5 {

	public static void main(String[] args) {

		String Driverpath = ".\\executable\\geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", Driverpath);

		WebDriver driver = new FirefoxDriver();

		driver.get("https://demosite.executeautomation.com/Login.html");
		String PageTitle = driver.getTitle();

		System.out.println("Page Title: " + PageTitle);
		System.out.println("Page Title lenght: " + PageTitle.length());

		String ExpectedURL = "https://demosite.executeautomation.com/Login.html";
		String ActualURL = driver.getCurrentUrl();
		if (ExpectedURL.equals(ActualURL)) {
			System.out.println("Login page opened sucessfully...");

		} else {
			System.out.println("Either login page not opened or URL title got changed");
		}

		System.out.println("Current page URL:  " + ActualURL);

		WebElement UserNameInputField = driver.findElement(By.name("UserName"));

		UserNameInputField.sendKeys("execution");

		WebElement PwdInputField = driver.findElement(By.name("Password"));

		PwdInputField.sendKeys("admin");

		WebElement LoginButton1 = driver.findElement(By.name("Login"));
		LoginButton1.click();

	}

}