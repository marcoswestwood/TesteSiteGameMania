package br.senai.sp.testepagina;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLoginGame {
	private WebDriver driver;
	
	@Before
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void TestarLogin() {
		driver.get("http://localhost:4200/");
		
		driver.findElement(By.id("login")).click();
		
		//teste 1
		driver.findElement(By.id("email")).sendKeys("marcos@mail.com");
		
		driver.findElement(By.id("senha")).sendKeys("marcos2021");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.id("btn-login")).click();
		
		WebElement mensagem = driver.findElement(By.id("mensagem"));
		
		System.out.println(mensagem.getText());
			
	
	}
}
