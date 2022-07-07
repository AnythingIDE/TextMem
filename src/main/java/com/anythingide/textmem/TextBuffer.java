package com.anythingide.textmem;

public interface TextBuffer<DataType, UserType> {

	TextBufferClient<DataType, UserType> createClientInstance();
	
}
