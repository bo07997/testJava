package myJava.design_pattern.adapter_pattern;
/**
 * 
 * 适配器模式
 * 主要解决：主要解决在软件系统中，常常要将一些"现存的对象"放到新的环境中，
 * 而新环境要求的接口是现对象不能满足的。
何时使用： 1、系统需要使用现有的类，而此类的接口不符合系统的需要。
 2、想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，
 包括一些可能在将来引进的类一起工作，这些源类不一定有一致的接口。 
 3、通过接口转换，将一个类插入另一个类系中。
 （比如老虎和飞禽，现在多了一个飞虎，在不增加实体的需求下，增加一个适配器，在里面包容一个虎对象，
 实现飞的接口。）
 * <p>
 * <a href="Test.java"><i>View Source</i></a>
 * 
 * @author dianbo
 * @version 1.0
 * @since 1.0
 */
public class Test {
	   public static void main(String[] args) {
	      AudioPlayer audioPlayer = new AudioPlayer();

	      audioPlayer.play("mp3", "beyond the horizon.mp3");
	      audioPlayer.play("mp4", "alone.mp4");
	      audioPlayer.play("vlc", "far far away.vlc");
	      audioPlayer.play("avi", "mind me.avi");
	   }
	}
