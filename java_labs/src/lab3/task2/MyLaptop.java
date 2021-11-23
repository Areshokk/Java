package lab3.task2;

import java.io.IOException;

class MyLaptop implements AutoCloseable{

    public void read() throws IOException {
        if(true){
            throw new IOException();
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("closed");
    }
}