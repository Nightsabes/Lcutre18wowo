package hackerpacker.tools;

import hackerpacker.Interfaces.FileHandler;

import java.io.*;

public class StringFileHandler implements FileHandler<String> {
    @Override
    public void writeToFile(String fileName, String inputString) {
        //implementerer filskriving
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))){

            bufferedWriter.write(inputString);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public String readFromFile(String fileName) {
        //vi trenger en variabel som returner samme datatype
        String content = "";//tom data type som blir oppdatert

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){

            String line;
            while ( (line = bufferedReader.readLine()) != null){
                content += line + "\n";
            }

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        return content;
    }
}
