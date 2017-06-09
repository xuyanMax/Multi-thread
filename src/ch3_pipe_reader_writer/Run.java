package ch3_pipe_reader_writer;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * Created by xu on 2017/6/9.
 */
public class Run {
      public static void main(String[] args){
          /*字符流*/
          try {


              try {
                  WriteData wd = new WriteData();
                  ReadData read = new ReadData();

                  PipedReader inputStream = new PipedReader();
                  PipedWriter outputStream = new PipedWriter();

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
