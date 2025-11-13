import java.util.function.*;
public class FunctionalDemo {
	public static void main(String[] args) {
		
		Predicate<String> p= s -> s.equals("Mumbai");
		System.out.println(p.test("Mumbai"));
		
		Function<String,Integer> f=s->s.length();
		System.out.println(f.apply("Mumbai"));
		
		Supplier<String> s=()->"Mumbai";
		System.out.println(s.get());
		
		Consumer<String> c=str->System.out.println(str);
		c.accept("Mumbai");
	}
}
