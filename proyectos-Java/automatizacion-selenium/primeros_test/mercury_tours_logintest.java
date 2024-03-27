package selenium.maven.practicas.primeros_test;

import org.testng.annotations.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.edge.EdgeDriver;

public class mercury_tours_logintest {

        EdgeDriver driver = new EdgeDriver();
        
        @BeforeAll public void inicio() throws InterruptedException{


        }
                
        @Test public void prueba(){



        }
                

        @AfterAll public void finalizar(){
                driver.quit();
        }

}