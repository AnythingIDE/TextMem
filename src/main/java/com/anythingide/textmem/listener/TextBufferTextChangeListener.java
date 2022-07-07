package com.anythingide.textmem.listener;

import org.reactivestreams.Publisher;

import com.anythingide.textmem.TextOffset;
import com.anythingide.textmem.TextPoint;

public interface TextBufferTextChangeListener<DataType, UserType> {
	
	Publisher<Void> onTextInserted(UserType causingUser, TextPoint point, DataType[] text);
	
	Publisher<Void> onTextReplaced(UserType causingUser, TextPoint point, TextOffset length, DataType[] text);
	
	Publisher<Void> onTextDeleted(UserType causingUser, TextPoint startPoint, TextOffset length);
	
}
