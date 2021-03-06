package cn.net.pikachu.basic;

import java.util.NoSuchElementException;

public class Stack {
	private ArrayList elementData = new ArrayList();
	
	public void push(Object o){
		elementData.add(o);
	}
	
	public Object pop(){
		if (isEmpty()){
			throw new NoSuchElementException();
		}
		return elementData.remove(elementData.size()-1);
	}
	
	public Object peek(){
		return elementData.get(elementData.size()-1);
	}
	public boolean isEmpty(){
		return elementData.size()==0;
	}
	public int size(){
		return elementData.size();
	}

	@Override
	public String toString() {
		return elementData.toString();
	}
}
