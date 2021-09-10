package sec03.exam01_name_implement_class;

import sec02.exam_interface_declaration.RemoteControl;

//Television 구현 클래스
public class Audio implements RemoteControl {
	//필드
	private int volume;
	//생성자
	
	//매소드
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨: "+volume);
	}

}
