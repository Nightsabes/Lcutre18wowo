package hackerpacker.Interfaces;

public interface FileHandler<T> {//<T> sier til java at vi skal ta imot en datatypen og T betyr placeholder i dette tilfellet. Da bytter vi de gamle string filene til T
    void writeToFile(String fileName, T t);//Tidlig var (String fileName, String string)

    T readFromFile(String fileName);
    //kan bli sett på som et verktøy så vi oppretter en ny pakke
}
