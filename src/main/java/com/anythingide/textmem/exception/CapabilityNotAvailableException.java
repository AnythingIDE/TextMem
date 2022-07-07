package com.anythingide.textmem.exception;

import com.anythingide.textmem.TextBufferClientCapabilityType;

public class CapabilityNotAvailableException extends RuntimeException {

	private static final long serialVersionUID = 4480226020652216288L;
	
	private final TextBufferClientCapabilityType capabilityType;
	
	public CapabilityNotAvailableException(TextBufferClientCapabilityType capabilityType) {
		this.capabilityType = capabilityType;
	}

	public TextBufferClientCapabilityType getCapabilityType() {
		return this.capabilityType;
	};
	
}
