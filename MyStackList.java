package practise;

import java.util.ArrayList;

/*public class MyStackList<E> extends ArrayList<E> {

  private static final long serialVersionUID = 1L;

  public E pop() {
    E e = get(size() - 1);
    remove(size() - 1);
    return e;
  }

  public void push(E e) {
    add(e);
  }

} */

public class MyStackList<E>{
	ArrayList<E> elements = new ArrayList<E>();
	
	
	public void push(E e){
		elements.add(e);
	}
	public E pop(){
		E e = elements.get(elements.size()-1);
		elements.remove(elements.size()-1);
		return e;
	}
}

/*
 public class MyStackArray<E> {
  private int size = 0;
  private static final int DEFAULT_CAPACITY = 10;
  private Object elements[];

  public MyStackArray() {
    elements = new Object[DEFAULT_CAPACITY];
  }

  public void push(E e) {
    if (size == elements.length) {
      ensureCapa();
    }
    elements[size++] = e;
  }

  @SuppressWarnings("unchecked")
  public E pop() {
    E e = (E) elements[--size];
    elements[size] = null;
    return e;
  }

  private void ensureCapa() {
    int newSize = elements.length * 2;
    elements = Arrays.copyOf(elements, newSize);
  }
} 
 */
