package com.anythingide.textmem.listener;

import org.reactivestreams.Publisher;

import com.anythingide.textmem.TextSelection;

public interface TextBufferSelectionChangeListener<UserType> {

	Publisher<Void> onSelectionsChanged(UserType user, TextSelection[] selections);
	
}
