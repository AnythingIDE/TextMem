package com.anythingide.textmem;

public interface TextPosition {

	public static final TextPosition FILE_START = TextPoint.of(0, 0);
	public static final TextPosition FILE_END = new TextPosition() {};
	
}
