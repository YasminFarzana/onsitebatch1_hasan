import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practiceSelenium {
    public static void main(String[] args) {

    WebDriver driver= new ChromeDriver();
    driver.get("https://qa.taltektc.com/");


    driver.findElement(By.linkText("Create new account")).click();

    driver.findElement(By.name("firstName")).sendKeys("tanzila");
    driver.findElement(By.name("lastName")).sendKeys("yasmin");
    driver.findElement(By.name("email")).sendKeys("tanshuha123@gmail.com");
    driver.findElement(By.name("password")).sendKeys("123456");
    driver.findElement(By.name("confirmPassword")).sendKeys("123456");
    driver.findElement(By.name("month")).click();
    new Select(driver.findElement(By.name("month"))).selectByVisibleText("Nov");
    driver.findElement(By.name("day")).click();
    new Select(driver.findElement(By.name("day"))).selectByVisibleText("10");
    driver.findElement(By.name("year")).click();
    new Select(driver.findElement(By.name("year"))).selectByVisibleText("1993");
    driver.findElement(By.id("female")).click();
    driver.findElement(By.id("defaultCheck1")).click();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
}

}

