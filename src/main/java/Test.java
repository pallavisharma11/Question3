import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("bean.xml");
		BankAccountController bankAccountController= (BankAccountController)context.getBean("controller");
		bankAccountController.print();
	}

}
