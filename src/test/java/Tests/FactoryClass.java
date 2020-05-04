package Tests;

import org.testng.annotations.Factory;

public class FactoryClass {
    @Factory
    public Object[] factoryMethod() {
        return new Object[]{
                new CalculatorTests(), new CalculatorTests()};
        }
    }