package gbh.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GBHContainer {
	
	private WebDriver driver;
	
	public GBHContainer(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getInicioMenu() {
		return driver.findElement(By.xpath("/html/body/header/div[1]/nav/ul[2]/li[1]/a"));
	}
	
	public WebElement getInicioPage() {
		return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[1]/h2[contains(text(), 'DESARROLLO')]"));
	}
	
	public WebElement getServiciosMenu() {
		return driver.findElement(By.xpath("/html/body/header/div[1]/nav/ul[2]/li[2]/a"));
	}
	
	public WebElement getAsesoriaDeInterfazSubmenu() {
		return driver.findElement(By.xpath("/html/body/header/div[1]/nav/ul[2]/li[2]/ul/li[1]/ul/li[1]/a"));
	}
	
	public WebElement getServiciosPage() {
		return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/h1[contains(text(), 'INTERFAZ')]"));
	}
	
	public WebElement getPortafolioMenu() {
		return driver.findElement(By.xpath("/html/body/header/div[1]/nav/ul[2]/li[3]/a"));
	}
	
	public WebElement getPortafolioPage() {
		return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/h1[contains(text(), 'NUESTRO')]"));
	}
	
	public WebElement getConocenosMenu() {
		return driver.findElement(By.xpath("/html/body/header/div[1]/nav/ul[2]/li[4]/a"));
	}
	
	public WebElement getConocenosPage() {
		return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/h1[contains(text(), 'SOLUCIONES')]"));
	}
	
	public WebElement getEmpleosMenu() {
		return driver.findElement(By.xpath("/html/body/header/div[1]/nav/ul[2]/li[5]/a"));
	}
	
	public WebElement getEmpleosPage() {
		return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/h1[contains(text(), 'EQUIPO')]"));
	}
	
	public WebElement getBlogMenu() {
		return driver.findElement(By.xpath("/html/body/header/div[1]/nav/ul[2]/li[6]/a"));
	}
	
	public WebElement getBlogPage() {
		return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/h1[contains(text(), 'NOTICIAS')]"));
	}

}
