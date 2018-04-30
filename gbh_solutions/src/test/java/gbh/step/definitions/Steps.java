package gbh.step.definitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gbh.step.definitions.BrowserConfig;
import gbh.views.GBHView;
import static org.junit.Assert.assertTrue;

public class Steps {

	private WebDriver driver = BrowserConfig.driver;
	private GBHView gbh;
	
	@Given("^user enters GBH Solutions page$")
	public void user_enters_GBH() throws Throwable {
		
		driver.get("http://gbh.com.do");
		
		gbh = new GBHView(driver);
		gbh.inicioPageIsDisplayed();
	}
	
	@When("^user clicks on 'Inicio' menu$")
	public void user_clicks_Inicio() throws Throwable {
		
		gbh.clickInicioMenu();
	}
	
	@Then("^user should see 'Inicio' page$")
	public void inicio_page_displayed() throws Throwable {
		
		gbh.inicioPageIsDisplayed();
	}
	
	@When("^user hovers over 'Servicios' menu and clicks on 'Asesoria de interfaz y experiencia de usuario'$")
	public void user_hovers_Servicios_clicks_asesoria(WebDriver driver) throws Throwable {
		
		gbh.clickServiciosMenu(driver);
	}
	
	@Then("^user should see 'Servicios' page$")
	public void servicios_page_displayed() throws Throwable {
		
		gbh.serviciosPageIsDisplayed();
	}
	
	@When("^user clicks on 'Portafolio' menu$")
	public void user_clicks_portafolio() throws Throwable {
		
		gbh.clickPortafolioMenu();
	}
	
	@Then("^user should see 'Portafolio' page$")
	public void portafolio_page_displayed() throws Throwable {
		
		gbh.portafolioPageIsDisplayed();
	}
	
	@When("^user clicks on 'Conocenos' menu$")
	public void user_clicks_conocenos() throws Throwable {
		
		gbh.clickConocenosMenu();
	}
	
	@Then("^user should see 'Conocenos' page$")
	public void conocenos_page_displayed() throws Throwable {
		
		gbh.conocenosPageIsDisplayed();
	}
	
	@When("^user clicks on 'Empleos' menu$")
	public void click_empleos_page() throws Throwable {
		
		gbh.clickEmpleosMenu();
	}
	
	@Then("^user should see 'Empleos' page$")
	public void empleos_page_displayed() throws Throwable {
		
		gbh.empleosPageIsDisplayed();
	}
	
	@When("^user clicks on 'Blog' menu$")
	public void click_blog_menu() throws Throwable {
		
		gbh.clickBlogMenu();
	}
	
	@Then("^user should see 'Blog' page$")
	public void blog_page_displayed() throws Throwable {
		
		gbh.blogPageIsDisplayed();
	}
	
}
