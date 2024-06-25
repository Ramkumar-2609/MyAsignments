package week1Day2;

public class Browser {
	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return (browserName);
	}
public void loadUrl() {
	System.out.println("Application loaded successfully");
}
         	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser bro=new Browser();
		String browserName= bro.launchBrowser("Chrome");
		System.out.println(browserName);
		bro.loadUrl();
		

	}

}
