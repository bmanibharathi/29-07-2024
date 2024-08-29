package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;



public class ShutterbugLaunch {
	    public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		Shutterbug.shootPage(driver,Capture.FULL,true).save("D:\\selenium\\shutter.png");
		System.out.println("hello");
		System.out.println("print");
		
		System.out.println("mani");
		System.out.println("dave");
}
}