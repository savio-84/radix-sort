package vector;

public class ArrayVector  {
  private int[] storage;
  private int length;

  public ArrayVector() {
    this.length = 10;
    this.storage = new int[this.length];
  }

  public int elementAtRank(int index) {
    return this.storage[index];
  }

  public int replaceAtRank(int index, int object) {
    int aux = this.storage[index];
    this.storage[index] = object;
    return aux;
  }

  public void insertAtRank(int index, int object) {
    if (this.storage.length == this.length-1) {
      int[] aux = new int[this.length * 2];
      for(int i=0; i<this.storage.length; i++) {
        aux[i] = this.storage[i];
      }
      this.storage = aux;
    }
    if (!isEmpty()) {
      for (int i = this.storage.length - 1; i > index; i--) {
        this.storage[i] = this.storage[i-1]; 
      }
    }
    this.storage[index] = object;
  }

  public int removeAtRank(int index) {
    int aux = this.storage[index];
    for (int i=index; i<this.storage.length; i++) {
      this.storage[i] = this.storage[i+1]; 
    }
    return aux;
  }

  public Integer size() {
    return this.storage.length;
  }

  public boolean isEmpty() {
    return this.storage.length == 0;
  }  

  public String toString() {
		String result = "";
		for (int i=0; i<this.storage.length; i++) {
			result += String.format("%d ", this.storage[i]);
		}
		System.out.println(result);
		return result;
	}

  private int getMax() {
    int max = this.storage[0];
    for (int i=1; i<this.length; i++)
      if (this.storage[i] > max)
        max = this.storage[i];
    return max;
  }

  private void countSort(int exp) {
    int output[] = new int[this.length];
    int count[] = new int[10];
    for (int a = 0; a < 10; a++) 
      count[a] = 0;
    
    for (int i=0; i<this.length; i++) 
      count[(this.storage[i] / exp) % 10]++;
    
    for (int i=1; i<count.length; i++)
      count[i] += count[i-1];

    for (int i=this.length-1; i>=0; i--) {
      output[count[(this.storage[i]/exp)%10]-1] = this.storage[i];
      count[(this.storage[i]/exp)%10]--;
    }

    for (int i=0; i<this.length; i++)
      this.storage[i] = output[i];
    
    
  }

  public void radixSort() {
    int max = this.getMax();
    for (int exp=1; max/exp>0; exp *= 10)
      this.countSort(exp);
  }
}
