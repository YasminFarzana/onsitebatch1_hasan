package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class loginDef {


    WebDriver driver;

    @Given("Student at talentTEK Homepage")
    public void studentAtTalentTEKHomepage() {
        driver = new ChromeDriver();
        driver.get("https://qa.taltektc.com/");
    }

    @And("Student enter their valid email address")
    public void studentEnterTheirValidEmailAddress() {
        driver.findElement(By.name("email")).sendKeys("farzana123@gmail.com");
    }



    @And("Student enter their valid password")
    public void studentEnterTheirValidPassword() {

        driver.findElement(By.name("password")).sendKeys("123456");
    }

    

    @When("Student clicks on Login button From login page")
    public void studentClicksOnLoginButtonFromLoginPage() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='login_form']/input")).click();
        Thread.sleep(1500);
    }

    @Then("Student should be able to login successfully login")
    public void studentShouldBeAbleToLoginSuccessfullyLogin() throws InterruptedException {
      // Assert if student successfully logged in or not
        String exp= "Student Information";
       String act=driver.findElement(By.xpath("//*[@id='wrap']/div/div/div[1]/h2")).getText();
        Assert.assertEquals(act,exp);
    }

    @And("Student enter their invalid email address")
    public void studentEnterTheirInvalidEmailAddress() {
        driver.findElement(By.name("email")).sendKeys("Invalidemail123@gmail.com");
    }

    @Then("Student should not be able to login successfully login")
    public void studentShouldNotBeAbleToLoginSuccessfullyLogin() {
        // Assert if student successfully logged in or not
        String exp= "Invalid email address";
        String act=driver.findElement(By.xpath("//*[@id='error-msg']")).getText();
        Assert.assertEquals(act,exp);

    }

    @And("Student enter their invalid password")
    public void studentEnterTheirInvalidPassword() {
        driver.findElement(By.name("password")).sendKeys("1587567689623456");
    }

    @Then("Student should see invalid incorrect email or password error message")
    public void studentShouldSeeInvalidIncorrectEmailOrPasswordErrorMessage() {
        String exp="Invalid email address";
        String act= driver.findElement(By.xpath("  //*[@id='error-msg']")).getText();
        Assert.assertEquals(act,exp);
    }


    @And("Student enter their valid email address {string}")
    public void studentEnterTheirValidEmailAddress(String arg0) {
        driver.findElement(By.name("email")).sendKeys("emailValue");
    }

    @And("Student enter their valid password {string}")
    public void studentEnterTheirValidPassword(String passwordValue) {
        driver.findElement(By.name("password")).sendKeys("passwordValue");
    }
}
