package com.anythingide.textmem;

import org.reactivestreams.Publisher;

import com.anythingide.textmem.listener.TextBufferSelectionChangeListener;

public interface TextBufferClientSelectCapability<DataType, UserType> extends TextBufferClientCapability<DataType, UserType> {

	Publisher<Void> select(TextSelection[] selections);
	
	Publisher<Void> deselect();
	
	void addSelectListener(TextBufferSelectionChangeListener<UserType> listener);
	
	void removeSelectListener(TextBufferSelectionChangeListener<UserType> listener);
	
}
