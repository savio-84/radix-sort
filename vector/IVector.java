package vector;

public interface IVector<Type> {
  Type elementAtRank(int index);
  Type replaceAtRank(int index, Type object);
  void insertAtRank(int index, Type object);
  Type removeAtRank(int index);
  Integer size();
  boolean isEmpty();
}
