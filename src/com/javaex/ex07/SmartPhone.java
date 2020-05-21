package com.javaex.ex07;

public class SmartPhone extends MusicPhone {

	public void execute(String str) {
		if (str.equals("앱")) {
			System.out.println("앱 실행");
		}

		else if (str.equals("음악")) {
			playMusic();
		}

		else if (str.equals("통화")) {
			super.execute("엄준식");
		}

	}

	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
	// 메소드작성

	// 메소드작성

}
