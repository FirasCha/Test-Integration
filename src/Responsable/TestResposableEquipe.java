package Responsable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class TestResposableEquipe {

	public static void main(String[] args) throws InterruptedException {
		
		String path = "C:\\Users\\Firas\\Desktop\\shit 33\\MiniProj\\operadriver_win64\\operadriver.exe";
        OperaOptions options = new OperaOptions();
        options.setBinary("C:\\Program Files\\Opera\\56.0.3051.116\\opera.exe");
        System.setProperty("webdriver.opera.driver",path);
        WebDriver driver= new OperaDriver(options);
        
        driver.get("http://localhost:4200/responsable/:id");
		WebElement link;
		
		/***Add***/
		link = driver.findElement(By.xpath("//*[contains(text(), 'Ajouter')]"));
		link.click();
		Thread.sleep(4000);
		
		WebElement search;
		search = driver.findElement(By.id("NomResponsable"));
		search.sendKeys("Nom");
		
		search = driver.findElement(By.id("PrenomResponsable"));
		search.sendKeys("Prenomom");
		
		search = driver.findElement(By.id("DateNaissResponsable"));
		search.sendKeys("22/12/1995");
		
		search = driver.findElement(By.id("NatResponsable"));
		search.sendKeys("Tunisienne");
		
		search = driver.findElement(By.id("ImageURLResponsable"));
		search.sendKeys("");
		
		search = driver.findElement(By.id("AdresseResponsable"));
		search.sendKeys("Tunis");
		
		search = driver.findElement(By.id("VilleResponsable"));
		search.sendKeys("Ville");
		
		search = driver.findElement(By.id("EquipeResponsable"));
		search.sendKeys("Equipe");
		
		search = driver.findElement(By.id("RegionResponsable"));
		search.sendKeys("Region");
		
		search = driver.findElement(By.id("EmailResponsable"));
		search.sendKeys("Email");
		
		search = driver.findElement(By.id("FonctionResponsable"));
		search.sendKeys("Fonction");
		
		search = driver.findElement(By.id("CinOuPassResponsable"));
		search.sendKeys("13000");
		
		search = driver.findElement(By.id("TelResponsable"));
		search.sendKeys("22459887");
		
		search = driver.findElement(By.id("CommResponsable"));
		search.sendKeys("Commentaire");
		
		/**/
		link = driver.findElement(By.xpath("//*[contains(text(),'enregistrer')]"));
		link.click();
		Thread.sleep(4000);
		
		
		driver.quit();
		}
}
