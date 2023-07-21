import vector.*;

class Main {
  public static void main(String[] args) {
    

    // # Vector
    ArrayVector vector = new ArrayVector();
    vector.insertAtRank(0, 0);
    vector.insertAtRank(1, 6);
    vector.insertAtRank(2, 4);
    vector.insertAtRank(3, 9);
    vector.insertAtRank(4, 1);
    vector.insertAtRank(5, 7);
    vector.insertAtRank(6, 3);
    vector.insertAtRank(7,2);
    vector.insertAtRank(8, 5);
    vector.insertAtRank(9, 8);
    vector.toString();
    // vector.radixSort();
    // vector.toString();


  }
}