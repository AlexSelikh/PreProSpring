import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean(HelloWorld.class);
        System.out.println(bean1.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean(HelloWorld.class);
        System.out.println(bean2.getMessage());
        System.out.println("bean1 и bean2 одинаковые?" + (bean1 == bean2));
        System.out.println(bean1+"\n"+bean2);

        Cat beanCat1 =
                (Cat) applicationContext.getBean(Cat.class);
        System.out.println(beanCat1.getName());
        Cat beanCat2 =
                (Cat) applicationContext.getBean(Cat.class);
        System.out.println(beanCat2.getName());

        System.out.println("beanCat1 и beanCat2 одинаковые?" + (beanCat1 == beanCat2));
        System.out.println(beanCat1+"\n"+beanCat2);

    }
}