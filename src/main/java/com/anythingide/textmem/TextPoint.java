package com.anythingide.textmem;

import com.anythingide.textmem.imp.TextPointImp;

public interface TextPoint extends TextPosition {

	int getRow();
	
	int getColumn();
	
	public static TextPoint of(int row, int column) {
		return new TextPointImp(row, column);
	}
	
}
