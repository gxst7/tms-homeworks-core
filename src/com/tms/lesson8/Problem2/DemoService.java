package com.tms.lesson8.Problem2;

import com.tms.lesson8.Problem1.AccessToEmptyCollectionException;
import com.tms.lesson8.Problem1.OutOfMemoryException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoService {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        InputValidateService service = new Memory();
        String str;

        System.out.println("Enter text.");
        System.out.println("Press 'get' to get the oldest element.");
        System.out.println("Press 'put' to put element to memory.");
        System.out.println("Press 'stop' clear memory and exit.");

        while (true) {
            str = bufferedReader.readLine();
            try {
                if (str.equals("get")) {
                    service.get();
                    continue;
                } else if (str.equals("stop")) {
                    System.out.println("Clearing memory.");
                    System.out.println("Bye.");
                    return;
                }
            } catch (AccessToEmptyCollectionException e) {
                System.out.println(e.getMessage());
            }
            try {
                service.put(str);
            } catch (OutOfMemoryException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
