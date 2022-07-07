package com.anythingide.textmem;

import org.reactivestreams.Publisher;

public interface TextBuffer<DataType, UserType, SessionInfo> {

	Publisher<TextBufferClient<DataType, UserType>> getBufferClient(SessionInfo sessionInfo);
	
}
