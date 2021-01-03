class Main {
  public static void main(String[] args) {
    HashSet obj = new HashSet();
    obj.add(1);
    obj.add(2);
    obj.remove(1);
    System.out.println(obj.contains(1));
    System.out.println(obj.contains(2));
  }
}


