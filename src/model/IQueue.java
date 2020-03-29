package model;

public interface IQueue<E> {

	public void enqueue(E obj);
	public void dequeue();
	public E peek();
	public int getSize();
	
}
