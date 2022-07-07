package com.anythingide.textmem;

public interface TextBufferCursor extends TextPosition {
	
	void advance();
	
	void advance(int columns);
	
	void advance(TextOffset offset);
	
	void advanceLine();
	
	void advanceLine(int lines);
	
	void setAutoAdvance(boolean autoAdvance);
	
	boolean getAutoAdvance();
	
}
