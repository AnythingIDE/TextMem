package com.anythingide.textmem;

import org.reactivestreams.Publisher;

public interface TextBufferClientWriteCapability<DataType, UserType> extends TextBufferClientCapability<DataType, UserType> {

	Publisher<Void> insert(TextPoint point, DataType[] text);
	
	Publisher<Void> insert(TextPoint point, String text);
	
	Publisher<Void> replace(TextPoint point, TextOffset length, DataType[] text);
	
	Publisher<Void> replace(TextPoint point, TextOffset length, String text);
	
	Publisher<Void> delete(TextPoint point);
	
	Publisher<Void> delete(TextPoint startPoint, TextOffset length);
	
}
