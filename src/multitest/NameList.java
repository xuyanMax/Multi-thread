package multitest;

import java.util.ArrayList;
import java.util.List;

public class NameList {
    /*
    * 在每个线程中都是顺序执行的，所以sl.printAll();必须在前三句执行之后执行，也就是输出的内容必有（连续或非连续的）ABC。
     而线程之间是穿插执行的，所以一个线程执行 sl.printAll();之前可能有另一个线程执行了前三句的前几句。
     E答案相当于线程1顺序执行完然后线程2顺序执行完。
     G答案则是线程1执行完前三句add之后线程2插一脚执行了一句add然后线程1再执行 sl.printAll();输出ABCA。接着线程2顺序执行完输出ABCABC
     输出加起来即为ABCAABCABC。

     E: The code may run with output “A B C '|' A B C A B C “, then exit.
     G: The code may run with output “A B C A '|' A B C A B C “, then exit.

     加synchronized解决线程不安全问题
*/
    private List names = new ArrayList();

    public synchronized void add(String name) {
        names.add(name);
    }

    public synchronized void printAll() {
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + "");
        }
    }

    public static void main(String[] args) {
        final NameList sl = new NameList();
        for (int i = 0; i < 2; i++) {

            new Thread(new Runnable() {
                @Override
                public void run() {
                    sl.add("A");
                    sl.add("B");
                    sl.add("C");
                    sl.printAll();
                }
            }).start();

        }
    }
}
