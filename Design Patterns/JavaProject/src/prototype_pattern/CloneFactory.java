package prototype_pattern;

public class CloneFactory {
  public Animal getClone(Animal animal) {
    return animal.makeCopy();
  }
  
}
