package lab.iphone.model;

public class user {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		System.out.println("Cellphone funtions");
		iphone.call("(11) 91234-1234");
		iphone.Answer();
		iphone.voiceMensage();
		
		System.out.println("Music player funtions");
		iphone.playMusic();
		iphone.stopMusic();
		iphone.selectMusic("The only exception - Paramore");
		
		System.out.println("Webbrowser funtions");
		iphone.showPages("HLTV.org");
		iphone.newTab();
		iphone.refreshPage();
	}
}
