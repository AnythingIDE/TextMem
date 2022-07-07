package com.anythingide.textmem;

import java.util.function.Function;

import org.reactivestreams.Publisher;

import com.anythingide.textmem.listener.TextBufferTextChangeListener;

public interface TextBufferClientReadCapability<DataType, UserType> extends TextBufferClientCapability<DataType, UserType> {

	Publisher<DataType[]> get(TextPoint startPoint, TextOffset length, Function<Integer, DataType[]> arraySupplier);
	
	Publisher<Integer> countLines();
	
	Publisher<Integer> countCharacters(int line);
	
	Publisher<Integer> countLength();
	
	void addTextChangeListener(TextBufferTextChangeListener<DataType, UserType> listener);
	
	void removeTextChangeListener(TextBufferTextChangeListener<DataType, UserType> listener);
	
}
