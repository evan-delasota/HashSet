import java.util.LinkedList;

class Main {
  public static void main(String[] args) {
    HashSet obj = new HashSet();
    obj.add(1);
    obj.add(2);
    obj.remove(1);
    boolean param_3 = obj.contains(2);

  }
}

class Bucket {
  private LinkedList<Integer> container;

  public Bucket() {
    container = new LinkedList<Integer>();
  }

  public void Insert(Integer key) {
    int index = container.indexOf(key);
    if (index == -1) {
      container.addFirst(key);
    }

  }

  public void Delete(Integer key) {
    container.remove(key);
  }

  public boolean Contains(Integer key) {
    int index = container.indexOf(key);
    return (index != -1);
  }

}

class HashSet {
  private int range;
  private Bucket[] bucket;

  public HashSet() {
    range = 769;
    bucket = new Bucket[range];
    for (int i = 0; i < range; ++i) {
      bucket[i] = new Bucket();
    }

  }

  protected int Hash(int key) {
    return (key % range);
  }

  public void add(int key) {
    int index = Hash(key);
    bucket[index].Insert(key);

  }

  public void remove(int key) {
    int index = Hash(key);
    bucket[index].Delete(key);

  }

  public boolean contains(int key) {
    int index = Hash(key);
    return (bucket[index].Contains(key));
  }
}
