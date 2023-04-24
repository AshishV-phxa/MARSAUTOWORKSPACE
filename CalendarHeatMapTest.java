package Mars10.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Mars10.base.BaseClass;
import mars.v10.pages.DefaultPage;
import mars.v10.pages.RepLookUp;

public class CalendarHeatMapTest extends BaseClass{
	DefaultPage DefaultPage;
	RepLookUp RepLookUp;
	
	public CalendarHeatMapTest() {
		super();
	}
	@BeforeClass
	public void setup() {
		DefaultPage = new DefaultPage();	
		RepLookUp = new RepLookUp();
	}
	@Test(priority = 1)
	public void clickrep() {
	RepLookUp.clickrep();
		
	}
	 @Test(priority = 2)
	public void repname_search() {
		RepLookUp.repname_search();
	} 
	 
	 @Test(priority = 3)
		public void AccessCalendarHeatMap() {
		RepLookUp.AccessCalendarHeatMap();
		} 
	 @Test(priority = 4)
		public void AccessHeatMapDate() {
		RepLookUp.AccessHeatMapDate();
		} 
	 
	 @Test(priority = 5)
		public void AccessNewRepCall() {
		RepLookUp.AccessNewRepCall();
		} 
	 @Test(priority = 6)
		public void ScheduleCall() {
		 DefaultPage.ScheduleCall();
		} 
	 @Test(priority = 7)
		public void AccessCalendarHeatMapLogCal() {
		RepLookUp.AccessCalendarHeatMap();
		} 
	 @Test(priority = 8)
		public void AccessHeatMapDateLogCall() {
		RepLookUp.AccessHeatMapDate();
		} 
	 @Test(priority = 9)
		public void AccessNewMeeting() {
		RepLookUp.AccessNewMeeting();
		} 
	 @Test(priority = 10)
		public void ScheduleMeeting() {
		 DefaultPage.ScheduleMeeting();
		} 

}
