package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;

public class CalculatorTests extends BaseTest {

    @Test(description = "Сhecking the level of \"Basal Metabolic Rate\"")
    @Description("Сhecking the level of \"Basal Metabolic Rate\"")
    @Link
    @Issue("rusak")
    @TmsLink("rusak")
    public void checkBasalMetabolicRate() {
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
                .maintenanceResult("497")
                .fatLossResult("-")
                .extremeFatLossResult("-");
    }

    @Test(description = "Сhecking the level of \"Little/no exercise\"")
    @Description("Сhecking the level of \"Little/no exercise\"")
    public void checkLittleNoExercise(){
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

    @Test(description = "Сhecking the level of \"3 times/week\"")
    @Description("Сhecking the level of \"3 times/week\"")
    public void check3TimesInWeek(){
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

    @Test(description = "Сhecking the level of \"4 times/week\"")
    @Description("Сhecking the level of \"4 times/week\"")
    public void check4TimesInWeek(){
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

    @Test(description = "Сhecking the level of \"5 times/week\"")
    @Description("Сhecking the level of \"5 times/week\"")
    public void check5TimesInWeek(){
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

    @Test(description = "Сhecking the level of \"Daily\"")
    @Description("Сhecking the level of \"Daily\"")
    public void checkDaily(){
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

    @Test(description = "Сhecking the level of \"5 times/week (intense)\"")
    @Description("Сhecking the level of \"5 times/week (intense)\"")
    public void check5TimesWeekIntense(){
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

    @Test(description = "Сhecking the level of \"Daily (intense) or twice daily\"")
    @Description("Сhecking the level of \"Daily (intense) or twice daily\"")
    public void checkDailyIntenseOrTwiceDaily(){
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

    @Test(description = "Сhecking the level of \"Daily exercise + physical job\"")
    @Description("Сhecking the level of \"Daily exercise + physical job\"")
    public void checkDailyExerciseAndPhysicalJob(){
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
