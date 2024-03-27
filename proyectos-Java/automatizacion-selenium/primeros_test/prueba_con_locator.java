package selenium.maven.practicas.primeros_test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.Select;

public class prueba_con_locator {
    
    EdgeDriver driver = new EdgeDriver();
    By signinlocator = By.linkText("Sign In");
    By registerlocator = By.linkText("Register Now!");
    By newaccount = By.name("newAccount");
    //Select language = new Select((WebElement) driver.findElements(By.name("account.languagepreference")));
    //Select favoriteCategory = new Select((WebElement) driver.findElements(By.name("account.favouriteCategoryId")));
    String usuario = "pinina5";
    @BeforeAll public void entrarenpagina() throws InterruptedException{
            driver.manage().window().maximize();
            driver.get("https://petstore.octoperf.com/actions/Catalog.action");
            Thread.sleep(10000);
        }

        @AfterAll public void cerrar(){

            System.out.println("listo, favor revisar los datos");
        }

    @Test public void registrodeusuario() throws InterruptedException{
        driver.findElement(signinlocator).click();
        Thread.sleep(5000);
        
        if(driver.findElement(registerlocator).isDisplayed()){
                driver.findElement(registerlocator).click();
                Thread.sleep(5000);
            if(driver.findElement(newaccount).isDisplayed()){
                driver.findElement(By.name("username")).sendKeys(usuario);
                driver.findElement(By.name("password")).sendKeys("unacontraseña");
                driver.findElement(By.name("repeatedPassword")).sendKeys("unacontraseña");
                driver.findElement(By.name("account.firstName")).sendKeys("pinina");
                driver.findElement(By.name("account.lastName")).sendKeys("garcia");
                driver.findElement(By.name("account.email")).sendKeys("pinina.nuevo@yahoo.es");
                driver.findElement(By.name("account.phone")).sendKeys("02514822156");
                driver.findElement(By.name("account.address1")).sendKeys("calle los perros avenida guau guau");
                driver.findElement(By.name("account.address2")).sendKeys("cerca de la licoreria los sabuesos");
                driver.findElement(By.name("account.city")).sendKeys("san bernardo julian");
                driver.findElement(By.name("account.state")).sendKeys("pequinecia");
                driver.findElement(By.name("account.zip")).sendKeys("2023");
                driver.findElement(By.name("account.country")).sendKeys("republica canina de perrutra");
                //language.selectByValue("english");                    favoriteCategory.selectByValue("DOGS");
                driver.findElement(By.name("account.listOption")).click();
                driver.findElement(By.name("account.bannerOption")).click();
                driver.findElement(By.name("newAccount")).submit();
                    
            }else{
                    System.out.println("new account page no found");
                }

        }else{
                System.out.println("sign in page no found");
        }

            
   // }

    //@Test public void iniciarsesion() throws InterruptedException{

        Thread.sleep(10000);

       // if(driver.findElement(By.xpath("//img[@src='https://petstore.octoperf.com/images/splash.gif']")).isDisplayed()){

            //Thread.sleep(5000);
            //driver.findElement(signinlocator).click();
            //Thread.sleep(5000);
            driver.findElement(By.name("username")).sendKeys(usuario);
            driver.findElement(By.name("password")).sendKeys("unacontraseña");
            driver.findElement(By.cssSelector("input[name= 'signon']")).submit();

            Thread.sleep(5000);

            //driver.findElement(By.linkText("My Account")).isDisplayed();


            
        //}else{
            System.out.println("error registro no exitoso");
       // }
    }


}
