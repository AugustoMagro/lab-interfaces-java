package lab.iphone.model;

import lab.iphone.service.Cellphone;
import lab.iphone.service.Internet;
import lab.iphone.service.Music;

public class Iphone implements Cellphone, Internet, Music {

	@Override
	public void call(String number) {
		// TODO Auto-generated method stub
		System.out.println("Calling " + number);
	}
	
	@Override
	public void Answer() {
		// TODO Auto-generated method stub
		System.out.println("Answering");
	}

	@Override
	public void voiceMensage() {
		// TODO Auto-generated method stub
		System.out.println("Recording voice mensage");
	}

	@Override
	public void showPages(String url) {
		// TODO Auto-generated method stub
		System.out.println("Pages " + url);
	}

	@Override
	public void newTab() {
		// TODO Auto-generated method stub
		System.out.println("Open new tab");
	}

	@Override
	public void refreshPage() {
		// TODO Auto-generated method stub
		System.out.println("Refreshing");
	}

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("Playing music");
	}

	@Override
	public void stopMusic() {
		// TODO Auto-generated method stub
		System.out.println("Stoping music");
	}

	@Override
	public void selectMusic(String music) {
		// TODO Auto-generated method stub
		System.out.println("Selecting " + music + " to play");
	}
}
