package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature", glue="stepDefinition", monochrome= true,
tags="@AddCart",
//@ShopSale or @FilterByPrice or @ReadMore or  @ShopProduct or @SortBy 
 
plugin= {"html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} )


public class TestRunner extends  AbstractTestNGCucumberTests { 

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}	
}								
