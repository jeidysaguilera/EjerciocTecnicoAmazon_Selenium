package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonSearch_Page extends Base_Page{

	
	WebDriver driver;
	
	public AmazonSearch_Page(WebDriver driver) {
		super(driver);
		
	}
	
	
	By inputSearch=By.id("twotabsearchtextbox");
	By searchButton=By.id("nav-search-submit-button");
	
	By secondsPage=By.linkText("/s?k=alexa&page=2&crid=17TORDLNRQTV0&qid=1709666161&sprefix=alexa%2Caps%2C326&ref=sr_pg_2");
	By thirdElemnt=By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[1]/div[1]/div[4]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]");
	
	By addToCart=By.id("submit.add-to-cart");
	By messagAddToCard=By.xpath("//h1[contains(text(),'Agregado al carrito')]");
	
	
	
	public void Visit() {
		visitUrl("https://www.amazon.com/ref=nav_logo");
	}
	
	public void WhriteSearch(String name) {
		type(name, inputSearch);
	}
	
	
	public void ClicSearch() {
		Clic(searchButton);
	}
	
	//tan solo estoy haciendo referencia al linktxt de ese link de lapagina 2
	public void GoToLink2() {
		goTolinkText("2");
	}
	
	public void GoToThird3elemnt() {
		Clic(thirdElemnt);
	}
	
	public void AddToCard() {
		Clic(addToCart);
	}
	
	public String MessegAddToCard() {
		return getText(messagAddToCard);
		
	}
}
