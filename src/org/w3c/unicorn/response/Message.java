// $Id: Message.java,v 1.2 2009-10-23 12:36:12 tgambet Exp $
// Author: Thomas Gambet
// (c) COPYRIGHT MIT, ERCIM and Keio, 2009.
// Please first read the full copyright statement in file COPYRIGHT.html
package org.w3c.unicorn.response;

import java.util.List;

public interface Message {

	public static final int INFO = 0;
	
	public static final int WARNING = 1;
	
	public static final int ERROR = 2;
	
	public String getTitle();
	
	public String getDescription();
	
	public int getType();
	
	public int getLevel();
	
	public String getURI();
	
	public List<Context> getContexts();
	
	public String getGroupName();
	
	public String getLang();
	
}
