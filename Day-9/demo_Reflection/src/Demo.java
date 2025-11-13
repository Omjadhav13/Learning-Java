import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Demo {

	public static void main(String[] args) {
		Project p=new Project();
		Class c=p.getClass();
		String name=c.getName();
		System.out.println(name);
		
		Method[]m=c.getMethods();
		for(Method m1 : m) {
			System.out.println(m1.getName());
		}
		
		
		String s="om";
		Class ctr=s.getClass();

			Field[] f=ctr.getDeclaredFields();
			for(Field f1:f) {
				System.out.println(f1.getName()+"\t \t"+Modifier.toString(f1.getModifiers()));
			}

			System.out.println("==========================================================================");
			
		Method[] ms=ctr.getDeclaredMethods();
		for(Method m11:ms) {
			System.out.println(Modifier.toString(m11.getModifiers())+" "+m11.getReturnType()+" "+m11.getName() );
		}
	}

}
