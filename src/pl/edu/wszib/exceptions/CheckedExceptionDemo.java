package pl.edu.wszib.exceptions;

import java.net.MalformedURLException;
import java.net.URL;



public class CheckedExceptionDemo {
    public void urlTesterByTryCatch(String urlStr) {
        try {
            URL url = new URL(urlStr);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("Niepoprawny url" + e.getMessage());
        }
    }

    public void urlTesterByThrows(String urlStr) throws MalformedURLException {
        URL url = new URL(urlStr);
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
    }


    public static void main(String[] args) throws MalformedURLException {
        CheckedExceptionDemo ced = new CheckedExceptionDemo();
//        ced.urlTesterByTryCatch("onet.pl");
        ced.urlTesterByThrows("ajp://wszib.edu.pl");








    }
}
