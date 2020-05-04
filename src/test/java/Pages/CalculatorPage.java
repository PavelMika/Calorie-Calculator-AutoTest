package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertEquals;

public class CalculatorPage extends BasePage {
    public CalculatorPage(WebDriver driver) {
        super(driver);
    }

    public CalculatorPage openPage() {
        driver.get("https://www.freedieting.com/calorie-calculator");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public CalculatorPage writeAge(String text){
        driver.findElement(By.id("age")).sendKeys(text);
        return this;
    }

    public CalculatorPage selectFemaleGender(){
        driver.findElement(By.id("sexFem")).click();
        return this;
    }

    public CalculatorPage selectMaleGender(){
        driver.findElement(By.id("sexMale")).click();
        return this;
    }

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

    public CalculatorPage writeCm(String text) {
        driver.findElement(By.id("cm")).sendKeys(text);
        return this;
    }

    public CalculatorPage selectBasalMetabolicRateExerciseLevel(){
        driver.findElement(By.id("activity")).click();
        WebElement exercise = driver.findElement(By.xpath("//*[@id=\"activity\"]/option[1.0]"));
        exercise.click();
        return this;
    }

    public CalculatorPage selectLittleLevel(){
        driver.findElement(By.id("activity")).click();
        WebElement exercise = driver.findElement(By.xpath("//*[@id=\"activity\"]/option[1.2]"));
        exercise.click();
        return this;
    }

    public CalculatorPage select3TimesWeekLevel(){
        driver.findElement(By.id("activity")).click();
        WebElement exercise = driver.findElement(By.xpath("//*[@id=\"activity\"]/option[1.375]"));
        exercise.click();
        return this;
    }

    public CalculatorPage select4TimesWeekLevel(){
        driver.findElement(By.id("activity")).click();
        WebElement exercise = driver.findElement(By.xpath("//*[@id=\"activity\"]/option[1.4187]"));
        exercise.click();
        return this;
    }

    public CalculatorPage select5TimesWeekLevel(){
        driver.findElement(By.id("activity")).click();
        WebElement exercise = driver.findElement(By.xpath("//*[@id=\"activity\"]/option[1.4625]"));
        exercise.click();
        return this;
    }

    public CalculatorPage selectDailyLevel(){
        driver.findElement(By.id("activity")).click();
        WebElement exercise = driver.findElement(By.xpath("//*[@id=\"activity\"]/option[1.550]"));
        exercise.click();
        return this;
    }

    public CalculatorPage select5TimesWeekIntenseLevel(){
        driver.findElement(By.id("activity")).click();
        WebElement exercise = driver.findElement(By.xpath("//*[@id=\"activity\"]/option[1.6375]"));
        exercise.click();
        return this;
    }

    public CalculatorPage selectDailyIntenseLevel(){
        driver.findElement(By.id("activity")).click();
        WebElement exercise = driver.findElement(By.xpath("//*[@id=\"activity\"]/option[1.725]"));
        exercise.click();
        return this;
    }

    public CalculatorPage selectDailyPhysicalJobLevel(){
        driver.findElement(By.id("activity")).click();
        WebElement exercise = driver.findElement(By.xpath("//*[@id=\"activity\"]/option[1.9]"));
        exercise.click();
        return this;
    }

    //public CalculatorPage button(){
        //driver.findElement(By.className("text-center-dropdown-calc"));
        //driver.findElement(By.xpath("//button[text()='Advanced Options']"));
    //}

    public CalculatorPage resultsInCalories(){
        driver.findElement(By.id("optResults")).click();
        return this;
    }

    public CalculatorPage resultsInKilojoules(){
        driver.findElement(By.id("optResults2")).click();
        return this;
    }

    public CalculatorPage formulaMifflinStJeor() {
        driver.findElement(By.id("optMS")).click();
        return this;
    }

    public CalculatorPage formulaKatchMcArdle(String BodyFat) {
        driver.findElement(By.id("optLM")).click();
        driver.findElement(By.id("txtBF")).sendKeys(BodyFat);
        return this;
    }

    public CalculatorPage formulaHarrisBenedict() {
        driver.findElement(By.id("optHB")).click();
        return this;
    }

    public CalculatorPage calculate(){
        driver.findElement(By.id("Button1")).click();
        return this;
    }

    public CalculatorPage maintenanceResult(String maintenance){
        String isExist = driver.findElement(By.id("answer")).getText();
        assertEquals(isExist,maintenance);
        return this;
    }

    public CalculatorPage fatLossResult(String fatLoss){
        String isExist = driver.findElement(By.id("lose")).getText();
        assertEquals(isExist,fatLoss);
        return this;
    }

    public CalculatorPage extremeFatLossResult(String extremeFatLoss){
        String isExist = driver.findElement(By.id("ca12")).getText();
        assertEquals(isExist,extremeFatLoss);
        return this;
    }

    public void button(){
        WebElement drop = driver.findElement(By.id("activity"));
        drop.click();
        //drop.selectByVisibleText("ANTARCTICA");

    }
}
