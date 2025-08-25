package testng.framework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@Test (dataProvider= "getData")
	public void StringConcat(String a, String b) {
		
		String myStr =a.concat(b);
		System.out.println(myStr);
		
	}
	
	@DataProvider (name="getData")
	public Object[][] getData() {
		
		Object[][] data=new Object[3][2]; 
		data[0][0]="Anusha";
		data[0][1]="Thangella";
		
		data[1][0]="Tech";
		data[1][1]="Mahindra";
		
		data[2][0]="Selenium";
		data[2][1]="Java";
		
		return(data);
	}
}
