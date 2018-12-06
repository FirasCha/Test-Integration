package GestionEquipe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class TestAddTeam {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		String path = "C:\\Users\\Firas\\Desktop\\shit 33\\MiniProj\\operadriver_win64\\operadriver.exe";
        OperaOptions options = new OperaOptions();
        options.setBinary("C:\\Program Files\\Opera\\56.0.3051.116\\opera.exe");
        System.setProperty("webdriver.opera.driver",path);
        WebDriver driver= new OperaDriver(options);
        
        driver.get("http://localhost:4200/team");
		WebElement link;
		
		link = driver.findElement(By.xpath("//*[contains(text(), ' Ajouter ')]"));
		link.click();
		Thread.sleep(4000);
		
		WebElement search;
		
		search = driver.findElement(By.id("NomPresTeam"));
		search.sendKeys("Nom President");
		search = driver.findElement(By.id("PrenomPresTeam"));
		search.sendKeys("Prenom pres");
		search = driver.findElement(By.id("TelPresTeam"));
		search.sendKeys("111111");
		search = driver.findElement(By.id("RegionTeam"));
		search.sendKeys("Tunis");
		search = driver.findElement(By.id("AdresseTeam"));
		search.sendKeys("Tunis");
		search = driver.findElement(By.id("EmailTeam"));
		search.sendKeys("aaaa");
		search = driver.findElement(By.id("DateCreTeam"));
		search.sendKeys("22/01/1919");
		search = driver.findElement(By.id("FaxTeam"));
		search.sendKeys("2555");
		search = driver.findElement(By.id("TelTeam"));
		search.sendKeys("15999");
		search = driver.findElement(By.id("AdresseTerTeam"));
		search.sendKeys("Adresse");
		search = driver.findElement(By.id("TerrainPrTeam"));
		search.sendKeys("Terr");
		search = driver.findElement(By.id("PrenomSecreTeam"));
		search.sendKeys("Prenom sec");
		search = driver.findElement(By.id("NomSecreTeam"));
		search.sendKeys("Nom Sec");
		search = driver.findElement(By.id("TelSecTeam"));
		search.sendKeys("7533");
		search = driver.findElement(By.id("ImageURLTeam"));
		search.sendKeys("");
		search = driver.findElement(By.id("NomTeam"));
		search.sendKeys("Nom Team");
		search = driver.findElement(By.id("DivTeam"));
		search.sendKeys("Div Team");
		search = driver.findElement(By.id("CommTeam"));
		search.sendKeys("Commm");
		
		link = driver.findElement(By.xpath("//*[contains(text(),'enregistrer')]"));
		link.click();
		
		Thread.sleep(4000);
		
		driver.quit();

	}

}
