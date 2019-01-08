package ch2_inner_class;

/**
 * Created by xu on 2017/6/7.
 */
public class Run {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("usernameValue");
        publicClass.setPassword("passwordValue");
        System.out.println(publicClass.getUsername() + ", " + publicClass.getPassword());

        //声明内部类对象
        PublicClass.PrivateClass privateClass = publicClass.new PrivateClass();

        //声明静态内部类对象
        PublicClass.StaticClass statclass = new PublicClass.StaticClass();


        privateClass.setAge("ageValue");
        privateClass.setAddress("addressValue");
        System.out.println(privateClass.getAddress() + ", " + privateClass.getAge());
    }
}
