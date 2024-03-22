package hackerpacker;

import hackerpacker.tools.StringFileHandler;

public class Main {
    public static void main(String[] args) {
        StringFileHandler stringFileHandler = new StringFileHandler();
        stringFileHandler.writeToFile("something.txt",
                "Something intereseting.... XDDDDDD");
        //lager en variabel for å ta imot readinga
        String textFromFile = stringFileHandler.readFromFile("something.txt");
        System.out.println(textFromFile);
        //deilig den leaka IP-en min :D
    }
}
