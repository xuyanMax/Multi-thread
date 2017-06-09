package ch3_pipe_input_output_stream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by xu on 2017/6/9.
 */
public class Run {
     public static void main(String[] args){
/*通过"管道"，进行线程间通信，字节流*/
         try {


             try {
                 WriteData wd = new WriteData();
                 ReadData read = new ReadData();

                 PipedInputStream inputStream = new PipedInputStream();
                 PipedOutputStream outputStream = new PipedOutputStream();

                 outputStream.connect(inputStream);

                 ThreadRead tread = new ThreadRead(read, inputStream);
                 ThreadWrite twrite = new ThreadWrite(wd, outputStream);

                 tread.start();
                 Thread.sleep(1000);

                 twrite.start();

             } catch (InterruptedException e) {
                 e.printStackTrace();
             }

         } catch (IOException e) {
             e.printStackTrace();
         }

     }

}
