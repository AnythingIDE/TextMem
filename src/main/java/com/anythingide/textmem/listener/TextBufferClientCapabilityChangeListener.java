package com.anythingide.textmem.listener;

import org.reactivestreams.Publisher;

import com.anythingide.textmem.TextBufferClientCapabilityType;

public interface TextBufferClientCapabilityChangeListener {

	Publisher<Void> onCapabilityAvailable(TextBufferClientCapabilityType capabilityType);
	
}
