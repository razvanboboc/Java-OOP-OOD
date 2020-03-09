package com.iquestint.ju.list;

import com.iquestint.ju.exceptions.InvalidNumberFormatException;
import com.iquestint.ju.exceptions.NullOrEmptyException;
import com.iquestint.ju.exceptions.OutOfBoundsException;

public interface List<T> {

	void add(T element) throws InvalidNumberFormatException, NullOrEmptyException;
	
	T get(int positon) throws OutOfBoundsException;
	
	boolean contains(T element);
	
	boolean containsAll(List<T> foreignList) throws OutOfBoundsException;
	
	int size();
}
