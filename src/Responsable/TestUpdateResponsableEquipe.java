package Responsable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class TestUpdateResponsableEquipe {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		String path = "C:\\Users\\Firas\\Desktop\\shit 33\\MiniProj\\operadriver_win64\\operadriver.exe";
        OperaOptions options = new OperaOptions();
        options.setBinary("C:\\Program Files\\Opera\\56.0.3051.116\\opera.exe");
        System.setProperty("webdriver.opera.driver",path);
        WebDriver driver= new OperaDriver(options);
        
        driver.get("http://localhost:4200/responsable/:id");
		WebElement link;
		
		link = driver.findElement(By.id("btnUpdateResponsable"));
		link.click();
		Thread.sleep(4000);
		
		WebElement search;
		search = driver.findElement(By.id("NomUpdateResponsable"));
		search.clear();
		search.sendKeys("NomUpdate");
		
		search = driver.findElement(By.id("PrenomUpdateResponsable"));
		search.clear();
		search.sendKeys("PrenomomUpdate");
		
		search = driver.findElement(By.id("DateNaissUpdateResponsable"));
		search.clear();
		search.sendKeys("22/12/1995");
		
		search = driver.findElement(By.id("NatUpdateResponsable"));
		search.clear();
		search.sendKeys("Tunisienne");
		
		search = driver.findElement(By.id("ImageURLUpdateResponsable"));
		search.clear();
		search.sendKeys("");
		
		search = driver.findElement(By.id("AdresseUpdateResponsable"));
		search.clear();
		search.sendKeys("Tunis");
		
		search = driver.findElement(By.id("VilleUpdateResponsable"));
		search.clear();
		search.sendKeys("Ville");
		
		search = driver.findElement(By.id("EquipeUpdateResponsable"));
		search.clear();
		search.sendKeys("Real ");
		
		search = driver.findElement(By.id("RegionUpdateResponsable"));
		search.clear();
		search.sendKeys("Region1");
		
		search = driver.findElement(By.id("EmailUpdateResponsable"));
		search.clear();
		search.sendKeys("Email");
		
		search = driver.findElement(By.id("FonctionUpdateResponsable"));
		search.clear();
		search.sendKeys("Fonction");
		
		search = driver.findElement(By.id("CinOuPassUpdateResponsable"));
		search.clear();
		search.sendKeys("13000");
		
		search = driver.findElement(By.id("TelUpdateResponsable"));
		search.clear();
		search.sendKeys("22455557");
		
		search = driver.findElement(By.id("CommUpdateResponsable"));
		search.clear();
		search.sendKeys("Commentaire");
		
		/**/
		link = driver.findElement(By.xpath("//*[contains(text(),' Enregistrer ')]"));
		link.click();
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}
