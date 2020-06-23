package Primero;

import org.junit.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Auxiliar {
	@Test
	public void HtmlUnitTest1() {
		HtmlUnitDriver Htddriver1 = new HtmlUnitDriver();
		Htddriver1.get("https://www.google.com/");
		String pagetitle=Htddriver1.getTitle();
		System.out.println(pagetitle);
	}
	@Test
	public void HtmlUnitTest2() {
		HtmlUnitDriver Htddriver2 = new HtmlUnitDriver();
		Htddriver2.get("https://www.upc.edu.pe/");
		String pagetitle=Htddriver2.getTitle();
		System.out.println(pagetitle);
	}
}
