package Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTests extends BaseTest {

    @DataProvider(name = "firstDataProvider", parallel = true)
    public Object[] firstDataProvider() {
        return new Object[] { };
    }

    @DataProvider(name = "secondDataProvider", parallel = true)
    public Object[] secondDataProvider() {
        return new Object[] { };
    }

    @Test(dataProvider = "firstDataProvider")
    public void Test1() {
        calculatorPage
                .openPage()
                .writeAge("13")
                .selectFemaleGender()
                .writeCurrentWeight("41")
                .selectValueInKilos()
                .selectCmsHeight()
                .writeCm("50")
                .selectBasalMetabolicRateExerciseLevel()
                .resultsInCalories()
                .formulaMifflinStJeor()
                .calculate()
                .maintenanceResult("497");
        //.fatLossResult("-");
        //.extremeFatLossResult("-");
    }

    @Test(dataProvider = "secondDataProvider")
    public void Test2(){
        calculatorPage
                .openPage()
                .writeAge("27")
                .selectMaleGender()
                .writeCurrentWeight("41")
                .selectValueInPounds()
                .selectFeetHeight()
                .writeFeet("4")
                .writeInches("0")
                .selectLittleLevel()
                .resultsInKilojoules()
                .formulaMifflinStJeor()
                .calculate()
                .maintenanceResult("4109")
                .fatLossResult("3287")
                .extremeFatLossResult("2465");
    }

    @Test
    public void Test3(){
        calculatorPage.openPage();
        calculatorPage.writeAge("35");
        calculatorPage.selectFemaleGender();
        calculatorPage.writeCurrentWeight("83");
        calculatorPage.selectValueInKilos();
        calculatorPage.selectCmsHeight();
        calculatorPage.writeCm("123");
        calculatorPage.select3TimesWeekLevel();
        calculatorPage.resultsInCalories();
        calculatorPage.formulaKatchMcArdle("5");
        calculatorPage.calculate();
        calculatorPage.maintenanceResult("2851");
        calculatorPage.fatLossResult("2280");
        calculatorPage.extremeFatLossResult("1710");
    }
    @Test
    public void Test4(){
        calculatorPage.openPage();
        calculatorPage.writeAge("41");
        calculatorPage.selectMaleGender();
        calculatorPage.writeCurrentWeight("70");
        calculatorPage.selectValueInPounds();
        calculatorPage.selectFeetHeight();
        calculatorPage.writeFeet("5");
        calculatorPage.writeInches("6");
        calculatorPage.select4TimesWeekLevel();
        calculatorPage.resultsInKilojoules();
        calculatorPage.formulaKatchMcArdle("31");
        calculatorPage.calculate();
        calculatorPage.maintenanceResult("5011");
        calculatorPage.fatLossResult("4009");
        calculatorPage.extremeFatLossResult("3007");
    }

    @Test
    public void Test5(){
        calculatorPage.openPage();
        calculatorPage.writeAge("50");
        calculatorPage.selectFemaleGender();
        calculatorPage.writeCurrentWeight("101");
        calculatorPage.selectValueInKilos();
        calculatorPage.selectCmsHeight();
        calculatorPage.writeCm("186");
        calculatorPage.select5TimesWeekLevel();
        calculatorPage.resultsInCalories();
        calculatorPage.formulaKatchMcArdle("45");
        calculatorPage.calculate();
        calculatorPage.maintenanceResult("2296");
        calculatorPage.fatLossResult("1837");
        calculatorPage.extremeFatLossResult("1778");
    }

    @Test
    public void Test6(){
        calculatorPage.openPage();
        calculatorPage.writeAge("56");
        calculatorPage.selectMaleGender();
        calculatorPage.writeCurrentWeight("252");
        calculatorPage.selectValueInPounds();
        calculatorPage.selectFeetHeight();
        calculatorPage.writeFeet("6");
        calculatorPage.writeInches("8");
        calculatorPage.selectDailyLevel();
        calculatorPage.resultsInKilojoules();
        calculatorPage.formulaKatchMcArdle("67");
        calculatorPage.calculate();
        calculatorPage.maintenanceResult("7695");
        calculatorPage.fatLossResult("6156");
        calculatorPage.extremeFatLossResult("4617");
    }

    @Test
    public void Test7(){
        calculatorPage.openPage();
        calculatorPage.writeAge("68");
        calculatorPage.selectFemaleGender();
        calculatorPage.writeCurrentWeight("456");
        calculatorPage.selectValueInPounds();
        calculatorPage.selectFeetHeight();
        calculatorPage.writeFeet("7");
        calculatorPage.writeInches("0");
        calculatorPage.select5TimesWeekIntenseLevel();
        calculatorPage.resultsInCalories();
        calculatorPage.formulaHarrisBenedict();
        calculatorPage.calculate();
        calculatorPage.maintenanceResult("4444");
        calculatorPage.fatLossResult("3648");
        calculatorPage.extremeFatLossResult("TOO LOW!");
    }

    @Test
    public void Test8(){
        calculatorPage.openPage();
        calculatorPage.writeAge("73");
        calculatorPage.selectMaleGender();
        calculatorPage.writeCurrentWeight("600");
        calculatorPage.selectValueInKilos();
        calculatorPage.selectCmsHeight();
        calculatorPage.writeCm("241");
        calculatorPage.selectDailyIntenseLevel();
        calculatorPage.resultsInKilojoules();
        calculatorPage.formulaHarrisBenedict();
        calculatorPage.calculate();
        calculatorPage.maintenanceResult("65156");
        calculatorPage.fatLossResult("52125");
        calculatorPage.extremeFatLossResult("44183");
    }

    @Test
    public void Test9(){
        calculatorPage.openPage();
        calculatorPage.writeAge("80");
        calculatorPage.selectMaleGender();
        calculatorPage.writeCurrentWeight("600");
        calculatorPage.selectValueInKilos();
        calculatorPage.selectFeetHeight();

        calculatorPage.writeFeet("7");
        calculatorPage.writeInches("11");
        calculatorPage.selectDailyPhysicalJobLevel();
        calculatorPage.resultsInCalories();
        calculatorPage.formulaHarrisBenedict();
        calculatorPage.calculate();
        calculatorPage.maintenanceResult("17065");
        calculatorPage.fatLossResult("13652");
        calculatorPage.extremeFatLossResult("10560");
    }

    @Test
    public void sometest(){
        calculatorPage.openPage();
        calculatorPage.button();

    }
}
