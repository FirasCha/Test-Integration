package GestionEquipe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class TestDetailTeam {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		String path = "C:\\Users\\Firas\\Desktop\\shit 33\\MiniProj\\operadriver_win64\\operadriver.exe";
        OperaOptions options = new OperaOptions();
        options.setBinary("C:\\Program Files\\Opera\\56.0.3051.116\\opera.exe");
        System.setProperty("webdriver.opera.driver",path);
        WebDriver driver= new OperaDriver(options);
        
        driver.get("http://localhost:4200/team");
		WebElement link;
		
		link = driver.findElement(By.id("DetailTeam"));
		link.click();
		Thread.sleep(4000);
		
		
		driver.quit();

	}

}
