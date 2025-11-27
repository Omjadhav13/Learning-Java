package first;

import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;


@Component
public class FirstComponent {
	public void doManage() {
		System.out.println("Managing First Component");
	}
}
