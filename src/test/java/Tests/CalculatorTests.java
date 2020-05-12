package Tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class CalculatorTests extends BaseTest {

    @Test(description = "Cteationg of progrct")
    @Description("Создание какого-то проекта")
    public void Test1() {
        calculatorPage
                .openPage()
                .writeAge("13")
                .selectFemaleGender()
                .writeCurrentWeight("41")
                .selectValueInKilos()
                .selectCmsHeight()
                .writeCm("50")
                .selectExerciseLevel("Basal Metabolic Rate")
                .resultsInCalories()
                .formulaMifflinStJeor()
                .calculate()
                .maintenanceResult("497");
        //.fatLossResult("-")
        //.extremeFatLossResult("-");

    }

    @Test()
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
                .selectExerciseLevel("Little/no exercise")
                .resultsInKilojoules()
                .formulaMifflinStJeor()
                .calculate()
                .maintenanceResult("4109")
                .fatLossResult("3287")
                .extremeFatLossResult("2465");
    }

    @Test
    public void Test3(){
        calculatorPage
        .openPage()
        .writeAge("35")
        .selectFemaleGender()
       .writeCurrentWeight("83")
      .selectValueInKilos()
        .selectCmsHeight()
        .writeCm("123")
        .selectExerciseLevel("3 times/week")
        .resultsInCalories()
        .formulaKatchMcArdle("5")
        .calculate()
        .maintenanceResult("2851")
        .fatLossResult("2280")
        .extremeFatLossResult("1710");
    }

    @Test
    public void Test4(){
        calculatorPage
                .openPage()
                .writeAge("41")
                .selectMaleGender()
                .writeCurrentWeight("70")
                .selectValueInPounds()
                .selectFeetHeight()
                .writeFeet("5")
                .writeInches("6")
                .selectExerciseLevel("4 times/week")
                .resultsInKilojoules()
                .formulaKatchMcArdle("31")
                .calculate()
                .maintenanceResult("5011")
                .fatLossResult("4009")
                .extremeFatLossResult("3007");
    }

    @Test
    public void Test5(){
        calculatorPage
                .openPage()
                .writeAge("50")
                .selectFemaleGender()
                .writeCurrentWeight("101")
                .selectValueInKilos()
                .selectCmsHeight()
                .writeCm("186")
                .selectExerciseLevel("5 times/week")
                .resultsInCalories()
                .formulaKatchMcArdle("45")
                .calculate()
                .maintenanceResult("2296")
                .fatLossResult("1837")
                .extremeFatLossResult("1778");
    }

    @Test
    public void Test6(){
        calculatorPage
                .openPage()
                .writeAge("56")
                .selectMaleGender()
                .writeCurrentWeight("252")
                .selectValueInPounds()
                .selectFeetHeight()
                .writeFeet("6")
                .writeInches("8")
                .selectExerciseLevel("Daily")
                .resultsInKilojoules()
                .formulaKatchMcArdle("67")
                .calculate()
                .maintenanceResult("7695")
                .fatLossResult("6156")
                .extremeFatLossResult("4617");
    }

    @Test
    public void Test7(){
        calculatorPage
                .openPage()
                .writeAge("68")
                .selectFemaleGender()
                .writeCurrentWeight("456")
                .selectValueInPounds()
                .selectFeetHeight()
                .writeFeet("7")
                .writeInches("0")
                .selectExerciseLevel("5 times/week (intense)")
                .resultsInCalories()
                .formulaHarrisBenedict()
                .calculate()
                .maintenanceResult("4444")
                .fatLossResult("3648")
                .extremeFatLossResult("TOO LOW!");

    }

    @Test
    public void Test8(){
        calculatorPage
                .openPage()
                .writeAge("73")
                .selectMaleGender()
                .writeCurrentWeight("600")
                .selectValueInKilos()
                .selectCmsHeight()
                .writeCm("241")
                .selectExerciseLevel("Daily (intense) or twice daily")
                .resultsInKilojoules()
                .formulaHarrisBenedict()
                .calculate()
                .maintenanceResult("65156")
                .fatLossResult("52125")
                .extremeFatLossResult("44183");
    }

    @Test
    public void Test9(){
        calculatorPage
                .openPage()
                .writeAge("80")
                .selectMaleGender()
                .writeCurrentWeight("600")
                .selectValueInKilos()
                .selectFeetHeight()
                .writeFeet("7")
                .writeInches("11")
                .selectExerciseLevel("Daily exercise + physical job")
                .resultsInCalories()
                .formulaHarrisBenedict()
                .calculate()
                .maintenanceResult("17065")
                .fatLossResult("13652")
                .extremeFatLossResult("10560");
    }
}
