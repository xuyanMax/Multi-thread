package ch6_singleton_7_1;

import java.io.*;

/**
 * Created by xu on 2017/7/2.
 */
public class SaveAndRead {
    /*序列化与反序列化的单例模式实现
    * 如果遇到序列化对象时，使用默认的方式运行得到的结果还是多例的
    * */
     public static void main(String[] args) {
         try {
             MyObject myObject = MyObject.getInstance();

             FileOutputStream fosRef = new FileOutputStream(new File("myObjectFile.txt"));

             ObjectOutputStream oosRef = new ObjectOutputStream(fosRef);

             oosRef.writeObject(myObject);

             oosRef.close();

             fosRef.close();
             System.out.println(myObject.hashCode());
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }


         try {
             FileInputStream fisRef = new FileInputStream(new File("myObjectFile.txt"));

             ObjectInputStream iosRef = new ObjectInputStream(fisRef);

             MyObject myObject = (MyObject) iosRef.readObject();

             iosRef.close();
             fisRef.close();
             System.out.println(myObject.hashCode());


         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         }
     }

}
