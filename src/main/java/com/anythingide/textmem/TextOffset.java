package com.anythingide.textmem;

import com.anythingide.textmem.imp.TextOffsetImp;

public interface TextOffset {
	
	public static final TextOffset LINE_END = offsetByChars(-1);

	int getLineOffset();
	
	int getCharOffset();
	
	public static TextOffset identity() {
		return new TextOffsetImp(0, 0);
	}
	
	public static TextOffset offsetByChars(int chars) {
		return new TextOffsetImp(0, chars);
	}
	
	public static TextOffset offsetByLines(int lines) {
		return new TextOffsetImp(lines, 0);
	}
	
}
