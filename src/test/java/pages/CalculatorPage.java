package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.AllureUtils;

import static org.testng.Assert.assertEquals;

@Log4j2
public class CalculatorPage extends BasePage {
    public CalculatorPage(WebDriver driver) {
        super(driver);
    }

    @Step("Opening Capabilities Generator")
    public CalculatorPage openPage() {
        driver.get("https://www.freedieting.com/calorie-calculator");
        AllureUtils.takeScreenshot(driver);
        return this;
    }

    @Step("Writing age into calculator: {text}")
    public CalculatorPage writeAge(String text){
        log.info("Writing age into calculator" +text);
        driver.findElement(By.id("age")).sendKeys(text);
        AllureUtils.takeScreenshot(driver);
        return this;
    }

    @Step("Selecting female gender")
    public CalculatorPage selectFemaleGender(){
        driver.findElement(By.id("sexFem")).click();
        return this;
    }

    @Step("Selecting male gender")
    public CalculatorPage selectMaleGender(){
        driver.findElement(By.id("sexMale")).click();
        return this;
    }

    @Step("Writihg current weight: {text}")
    public CalculatorPage writeCurrentWeight(String text){
        log.info("Writihg current weight" +text);
        driver.findElement(By.id("weight")).sendKeys(text);
        AllureUtils.takeScreenshot(driver);
        return this;
    }

    public CalculatorPage selectValueInPounds(){
        driver.findElement(By.id("weighttype1")).click();
        return this;
    }

    public CalculatorPage selectValueInKilos(){
        driver.findElement(By.id("weighttype2")).click();
        return this;
    }

    public CalculatorPage selectFeetHeight(){
        driver.findElement(By.id("heightFeet")).click();
        return this;
    }

    @Step("Writing feet: {text}")
    public CalculatorPage writeFeet(String text){
        log.info("Writing feet" + text);
        driver.findElement(By.id("feet")).sendKeys(text);
        AllureUtils.takeScreenshot(driver);
        return this;
    }

    @Step("Writing inches: {text}")
    public CalculatorPage writeInches(String text){
        log.info("Writing inches" + text);
        driver.findElement(By.id("inches")).sendKeys(text);
        AllureUtils.takeScreenshot(driver);
        return this;
    }


    public CalculatorPage selectCmsHeight(){
        driver.findElement(By.id("heightCM")).click();
        return this;
    }

    @Step("Writing cm: {text}")
    public CalculatorPage writeCm(String text) {
        log.info("Writing cm" + text);
        driver.findElement(By.id("cm")).sendKeys(text);
        AllureUtils.takeScreenshot(driver);
        return this;
    }

    @Step("Selecting exercise level: {text}")
    public CalculatorPage selectExerciseLevel(String text){
        log.info("Selecting exercise level" +text);
        Select exercise = new Select(driver.findElement(By.id("activity")));
        exercise.selectByVisibleText(text);
        driver.findElement(By.cssSelector(".icon-cogs")).click();
        return this;
    }

    @Step("Selecting result in calories")
    public CalculatorPage resultsInCalories(){
        driver.findElement(By.id("optResults")).click();
        return this;
    }

    @Step("Selecting result in kilojoules")
    public CalculatorPage resultsInKilojoules(){
        driver.findElement(By.id("optResults2")).click();
        return this;
    }

    @Step("Selecting formula Mifflin St Jeor")
    public CalculatorPage formulaMifflinStJeor() {
        driver.findElement(By.id("optMS")).click();
        return this;
    }

    @Step("Selecting formula Katch Mc Ardle: {BodyFat}")
    public CalculatorPage formulaKatchMcArdle(String BodyFat) {
        log.info("Selecting formula Katch Mc Ardle"+BodyFat);
        driver.findElement(By.id("optLM")).click();
        driver.findElement(By.id("txtBF")).sendKeys(BodyFat);
        return this;
    }

    @Step("Selecting formula Harris Benedict")
    public CalculatorPage formulaHarrisBenedict() {
        driver.findElement(By.id("optHB")).click();
        return this;
    }

    public CalculatorPage calculate(){
        driver.findElement(By.id("Button1")).click();
        return this;
    }

    @Step("Validation that message contains number: {maintenance}")
    public CalculatorPage maintenanceResult(String maintenance){
        log.info("Validation that message contains number" + maintenance);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("answer")));
        String isExist = driver.findElement(By.id("answer")).getText();
        assertEquals(isExist,maintenance);
        AllureUtils.takeScreenshot(driver);
        return this;
    }

    @Step("Validation that message contains number: {fatLoss}")
    public CalculatorPage fatLossResult(String fatLoss){
        log.info("Validation that message contains number" + fatLoss);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lose")));
        String isExist = driver.findElement(By.id("lose")).getText();
        assertEquals(isExist,fatLoss);
        AllureUtils.takeScreenshot(driver);
        return this;
    }

    @Step("Validation that message contains number: {extremeFatLoss}")
    public CalculatorPage extremeFatLossResult(String extremeFatLoss){
        log.info("Validation that message contains number" + extremeFatLoss);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loseExt")));
        String isExist = driver.findElement(By.id("loseExt")).getText();
        assertEquals(isExist,extremeFatLoss);
        AllureUtils.takeScreenshot(driver);
        return this;
    }
}
