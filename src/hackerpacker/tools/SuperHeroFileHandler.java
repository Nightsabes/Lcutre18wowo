package hackerpacker.tools;

import hackerpacker.Interfaces.FileHandler;
import hackerpacker.models.SuperHero;

public class SuperHeroFileHandler implements FileHandler<SuperHero> {

    @Override
    public void writeToFile(String fileName, SuperHero superHero) {

    }

    @Override
    public SuperHero readFromFile(String fileName) {
        return null;
    }
}
