package GestionEquipe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class TestUpdateTeam {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		String path = "C:\\Users\\Firas\\Desktop\\shit 33\\MiniProj\\operadriver_win64\\operadriver.exe";
        OperaOptions options = new OperaOptions();
        options.setBinary("C:\\Program Files\\Opera\\56.0.3051.116\\opera.exe");
        System.setProperty("webdriver.opera.driver",path);
        WebDriver driver= new OperaDriver(options);
        
        driver.get("http://localhost:4200/team");
		WebElement link;
		
		link = driver.findElement(By.xpath("//*[contains(text(), 'Modifier')]"));
		link.click();
		Thread.sleep(4000);

		WebElement search;
		search = driver.findElement(By.id("UpdNomPresTeam"));
		search.clear();
		search.sendKeys("Nom President");
		search = driver.findElement(By.id("UpdPrenomPresTeam"));
		search.clear();
		search.sendKeys("Prenom pres");
		search = driver.findElement(By.id("UpdNumTelPresTeam"));
		search.clear();
		search.sendKeys("111111");
		search = driver.findElement(By.id("UpdRegionTeam"));
		search.clear();
		search.sendKeys("Tunis");
		search = driver.findElement(By.id("UpdAdresseTeam"));
		search.clear();
		search.sendKeys("Tunis");
		search = driver.findElement(By.id("UpdEmailTeam"));
		search.clear();
		search.sendKeys("aaaa");
		search = driver.findElement(By.id("UpdDateCreTeam"));
		search.clear();
		search.sendKeys("22/01/1919");
		search = driver.findElement(By.id("UpdFaxTeam"));
		search.clear();
		search.sendKeys("2555");
		search = driver.findElement(By.id("UpdNumTelTeam"));
		search.clear();
		search.sendKeys("15999");
		search = driver.findElement(By.id("UpdAdresseTerrTeam"));
		search.clear();
		search.sendKeys("Adresse");
		search = driver.findElement(By.id("UpdTerrainPrTeam"));
		search.clear();
		search.sendKeys("Terr");
		search = driver.findElement(By.id("UpdPrenomSecTeam"));
		search.clear();
		search.sendKeys("Prenom sec");
		search = driver.findElement(By.id("UpdNomSecTeam"));
		search.clear();
		search.sendKeys("Nom Sec");
		search = driver.findElement(By.id("UpdTelSecTeam"));
		search.clear();
		search.sendKeys("7533");
		search = driver.findElement(By.id("UpdImageURLTeam"));
		search.clear();
		search.sendKeys("");
		search = driver.findElement(By.id("UpdNomEquTeam"));
		search.clear();
		search.sendKeys("Nom Team");
		search = driver.findElement(By.id("UpdDivisionTeam"));
		search.clear();
		search.sendKeys("Div Team");
		
		
		link = driver.findElement(By.id("Updenreg"));
		link.click();
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}
