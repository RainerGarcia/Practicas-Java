package selenium.maven.practicas.primeros_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class App {

        EdgeDriver driver = new EdgeDriver();
        
        @BeforeAll public void inicio() throws InterruptedException{

                
                driver.manage().window().maximize();
                driver.get("https://www.google.com");
                WebElement buscar = driver.findElement(By.name("q"));
                buscar.sendKeys("no hay lugar conexion cielo acordes");
                buscar.submit();
                Thread.sleep(10000);
        }
                
        @Test public void prueba(){


                        
                        String titulo = "no hay lugar conexion cielo acordes - Buscar con Google";

                        assertEquals(titulo, driver.getTitle());
                        /* 
                        if( titulo.equals(driver.getTitle()))
                        {
                                System.out.println("correcto");
                        }else
                        {
                                System.out.println("error");
                        }
                        */
        }
                

        @AfterAll public void finalizar(){
                driver.quit();
        }

}
