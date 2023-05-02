
public class base_Url {
	public class LogIn extends b_Drive{
		
		String Url = "timf.imikrof.com";
		public void browser_Start() throws InterruptedException{
			driver.get(Url);
			driver.manage().window().maximize();
			Thread.sleep(60000);
			
		}
		
	}
}
