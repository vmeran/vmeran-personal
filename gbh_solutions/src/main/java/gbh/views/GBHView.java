package gbh.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import gbh.containers.GBHContainer;;

public class GBHView {
	
	private GBHContainer container;
	
	public GBHView(WebDriver driver) {
		
		container = new GBHContainer(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void clickInicioMenu() {
		
		container.getInicioMenu().click();
	}
	
	public void inicioPageIsDisplayed() {
		
		container.getInicioPage().isDisplayed();
	}
	
	public void clickServiciosMenu(WebDriver driver) {
		
		Actions builder = new Actions(driver);
		WebElement servicios = container.getServiciosMenu();
		builder.moveToElement(servicios).build().perform();
		 
		 container.getAsesoriaDeInterfazSubmenu().click();
	}
	
	public void serviciosPageIsDisplayed() {
		
		container.getServiciosPage().isDisplayed();
	}
	
	public void clickPortafolioMenu() {
		
		container.getPortafolioMenu().click();
	}
	
	public void portafolioPageIsDisplayed() {
		
		container.getPortafolioPage().isDisplayed();
	}
	
	public void clickConocenosMenu() {
		
		container.getConocenosMenu().click();
	}
	
	public void conocenosPageIsDisplayed() {
		
		container.getConocenosPage().isDisplayed();
	}
	
	public void clickEmpleosMenu() {
		
		container.getEmpleosMenu().click();
	}
	
	public void empleosPageIsDisplayed() {
		
		container.getEmpleosPage().isDisplayed();
	}
	
	public void clickBlogMenu() {
		
		container.getBlogMenu().click();
	}
	
	public void blogPageIsDisplayed() {
		
		container.getBlogPage().isDisplayed();
	}

}
