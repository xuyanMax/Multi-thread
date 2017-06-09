package ch3_pipe_reader_writer;


import java.io.PipedReader;

/**
 * Created by xu on 2017/6/9.
 */
public class ThreadRead extends Thread {
    private ReadData read;
    private PipedReader inputStream;

    public ThreadRead(ReadData read, PipedReader inputStream) {
        super();
        this.read = read;
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        read.readMethod(inputStream);
    }
}
