package com.anythingide.textmem.listener;

import com.anythingide.textmem.TextBufferClientCapabilityType;

public interface TextBufferClientCapabilityChangeListener {

	void onCapabilityAvailable(TextBufferClientCapabilityType capabilityType);
	
}
