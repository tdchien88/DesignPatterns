package com.tdchien88.designParrtens.type03_Behavioral.chap304_IteratorPattern;

public interface ItemIterator<T> {

	boolean hasNext();

	T next();
}