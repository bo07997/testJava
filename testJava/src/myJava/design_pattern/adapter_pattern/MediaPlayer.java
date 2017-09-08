package myJava.design_pattern.adapter_pattern;

public interface MediaPlayer {

	void play(String audioType, String fileName);

}
interface AdvancedMediaPlayer {	
	   public void playVlc(String fileName);
	   public void playMp4(String fileName);
	}