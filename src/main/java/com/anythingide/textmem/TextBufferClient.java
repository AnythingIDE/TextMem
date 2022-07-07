package com.anythingide.textmem;

import com.anythingide.textmem.listener.TextBufferClientCapabilityChangeListener;

public interface TextBufferClient<DataType, UserType> {

	TextBufferCursor createCursor(boolean autoAdvance);
	
	boolean hasCapability(TextBufferClientCapabilityType capabilityType);
	
	TextBufferClientCapability<DataType, UserType> getCapability(TextBufferClientCapabilityType capabilityType);
	
	void addCapabilityChangeListener(TextBufferClientCapabilityChangeListener listener);
	
	void removeCapabilityChangeListener(TextBufferClientCapabilityChangeListener listener);
	
}
