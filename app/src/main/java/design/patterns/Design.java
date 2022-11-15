package design.patterns;

import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Design {
    public static void main(String[] args) {
        // Singleton
        Thanks thanks = Thanks.getInstance();

        thanks.addThanks();
        System.out.println(thanks.toString());

        thanks.addBigThanks();
        System.out.println("After adding big thanks: " + thanks.toString());
    }
}
