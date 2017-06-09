package ch3_pipe_input_output_stream;

import java.io.PipedInputStream;

/**
 * Created by xu on 2017/6/9.
 */
public class ThreadRead extends Thread {
    private ReadData read;
    private PipedInputStream inputStream;

    public ThreadRead(ReadData read, PipedInputStream inputStream) {
        super();
        this.read = read;
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        read.readMethod(inputStream);
    }
}
