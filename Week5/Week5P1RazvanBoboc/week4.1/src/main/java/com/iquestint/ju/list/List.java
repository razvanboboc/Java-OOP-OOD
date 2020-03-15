package com.iquestint.ju.list;

public interface List<T> {

	void add(T element);
	
	T get(int positon);
	
	boolean contains(T element);
	
	boolean containsAll(List<T> foreignList);
	
	int size();
}
