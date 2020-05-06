package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertEquals;

public class CalculatorPage extends BasePage {
    public CalculatorPage(WebDriver driver) {
        super(driver);
    }

    @Step("Открытие страницы")
    public CalculatorPage openPage() {
        driver.get("https://www.freedieting.com/calorie-calculator");
        return this;
    }

    @Step("Ввод возраста")
    public CalculatorPage writeAge(String text){
        driver.findElement(By.id("age")).sendKeys(text);
        return this;
    }

    @Step("Выбор женского пола")
    public CalculatorPage selectFemaleGender(){
        driver.findElement(By.id("sexFem")).click();
        return this;
    }

    @Step("Выбор мужского пола")
    public CalculatorPage selectMaleGender(){
        driver.findElement(By.id("sexMale")).click();
        return this;
    }

    @Step("Ввод веса")
    public CalculatorPage writeCurrentWeight(String text){
        driver.findElement(By.id("weight")).sendKeys(text);
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

    @Step("Ввод роста по английской системе")
    public CalculatorPage writeFeet(String text){
        driver.findElement(By.id("feet")).sendKeys(text);
        return this;
    }

    public CalculatorPage writeInches(String text){
        driver.findElement(By.id("inches")).sendKeys(text);
        return this;
    }


    public CalculatorPage selectCmsHeight(){
        driver.findElement(By.id("heightCM")).click();
        return this;
    }

    @Step("Ввод роста по метрической системе")
    public CalculatorPage writeCm(String text) {
        driver.findElement(By.id("cm")).sendKeys(text);
        return this;
    }

    @Step("Выбор уровня активности")
    public CalculatorPage selectExerciseLevel(String text){
        Select exercise = new Select(driver.findElement(By.id("activity")));
        exercise.selectByVisibleText(text);
        driver.findElement(By.cssSelector(".icon-cogs")).click();
        return this;
    }

    @Step("")
    public CalculatorPage resultsInCalories(){
        driver.findElement(By.id("optResults")).click();
        return this;
    }

    @Step("")
    public CalculatorPage resultsInKilojoules(){
        driver.findElement(By.id("optResults2")).click();
        return this;
    }

    @Step("")
    public CalculatorPage formulaMifflinStJeor() {
        driver.findElement(By.id("optMS")).click();
        return this;
    }

    @Step("")
    public CalculatorPage formulaKatchMcArdle(String BodyFat) {
        driver.findElement(By.id("optLM")).click();
        driver.findElement(By.id("txtBF")).sendKeys(BodyFat);
        return this;
    }

    @Step("")
    public CalculatorPage formulaHarrisBenedict() {
        driver.findElement(By.id("optHB")).click();
        return this;
    }

    @Step("")
    public CalculatorPage calculate(){
        driver.findElement(By.id("Button1")).click();
        return this;
    }

    @Step("")
    public CalculatorPage maintenanceResult(String maintenance){
        String isExist = driver.findElement(By.id("answer")).getText();
        assertEquals(isExist,maintenance);
        return this;
    }

    @Step("")
    public CalculatorPage fatLossResult(String fatLoss){
        String isExist = driver.findElement(By.id("lose")).getText();
        assertEquals(isExist,fatLoss);
        return this;
    }

    @Step("")
    public CalculatorPage extremeFatLossResult(String extremeFatLoss){
        String isExist = driver.findElement(By.id("ca12")).getText();
        assertEquals(isExist,extremeFatLoss);
        return this;
    }
}
