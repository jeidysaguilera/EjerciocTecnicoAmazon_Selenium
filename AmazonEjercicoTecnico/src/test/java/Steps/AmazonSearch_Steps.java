package Steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import Page.AmazonSearch_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AmazonSearch_Steps {

	WebDriver driver=null;
	AmazonSearch_Page amazon;
	
	@Given("el usuario navega a www.amazon.com")
	public void el_usuario_navega_a_www_amazon_com() throws InterruptedException {
		
		amazon=new AmazonSearch_Page(driver);
		driver=amazon.ChromeConection();
	     
	    amazon.Visit();
	    Thread.sleep(2000);
	}

	@And("Busca por {string}")
	public void busca_por(String string) {
		amazon.WhriteSearch(string);
		amazon.ClicSearch();
	}

	@And("navega a la segunda pagina")
	public void navega_a_la_segunda_pagina() {
	    amazon.GoToLink2();
	}

	@And("selecciona el tercer elemento")
	public void selecciona_el_tercer_elemento() throws InterruptedException {
		 Thread.sleep(2000);
		amazon.GoToThird3elemnt();
	   
	}

	@Then("Verifica que puede agregar al carrito de compra")
	public void verifica_que_puede_agregar_al_carrito_de_compra() {
	    amazon.AddToCard();
	    assertEquals("Agregado al carrito", amazon.MessegAddToCard());
	    amazon.Quit();
	}

	
	
}
