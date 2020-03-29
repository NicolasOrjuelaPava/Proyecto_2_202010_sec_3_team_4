package model;

public interface IStack <E>{

	
	public E pop();
	public E peek();
	public boolean empty();
	public void push(E obj);
	public int getSize();

}
