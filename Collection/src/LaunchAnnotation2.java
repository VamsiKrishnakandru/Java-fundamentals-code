import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.FIELD)
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD})
@interface CricketPlayer //@ -> specifies compiler that annotation type is being creating
{
	String country()default "India";
	int age()default 34;
}
@CricketPlayer(country = "India")
class ViratKohli
{
	//@CricketPlayer - error since target is given
	private int innings;

	@CricketPlayer
	public int getInnings() {
		return innings;
	}

	public void setInnings(int innings) {
		this.innings = innings;
	}
	
}
public class LaunchAnnotation2 {

	public static void main(String[] args) 
	{
		ViratKohli vk = new ViratKohli();
		Class<? extends ViratKohli> c = vk.getClass(); //using reflection class
		Annotation an = c.getAnnotation(CricketPlayer.class); //Annotation is parent class for all annotations
		CricketPlayer cp = (CricketPlayer) an;
		int age = cp.age();
		System.out.println(age);
		String co=cp.country();
		System.out.println(co);
	}

}
