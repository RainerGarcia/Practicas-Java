package selenium.maven.practicas.prueba;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class mercury_tours_logintest {

        EdgeDriver driver = new EdgeDriver();
        String usuario = "caso@email.com";
        String contraseña = "12345";
        
        @BeforeSuite public void inicio() throws InterruptedException{

                driver.get("https://demo.guru99.com/test/newtours/");
                Thread.sleep(10000);

        }
                
        @Test(priority = 1) public void registro() throws InterruptedException{

                driver.findElement(By.linkText("REGISTER")).click();
                Thread.sleep(10000);
                driver.findElement(By.id("email")).sendKeys(usuario);
                driver.findElement(By.name("password")).sendKeys(contraseña);
                driver.findElement(By.name("confirmPassword")).sendKeys(contraseña);
                driver.findElement(By.name("submit")).click();



        }

        @Test(priority = 2) public void iniciarsesion() throws InterruptedException{

                Thread.sleep(10000);
                if(driver.findElement(By.linkText("sign-in")).isDisplayed()){

                        driver.findElement(By.linkText("sign-in")).click();
                        Thread.sleep(10000);
                        driver.findElement(By.name("userName")).sendKeys(usuario);
                        driver.findElement(By.name("password")).sendKeys(contraseña);
                        driver.findElement(By.name("submit")).click();
                        Thread.sleep(10000);
                        driver.findElement(By.xpath("//h3[contains(text(), 'Login Successfully')]")).isDisplayed();


                }else{
                        System.out.println("register no successfully");
                }

        }

        @AfterSuite public void finalizar(){
                System.out.println("registro exitoso");
        }

}
