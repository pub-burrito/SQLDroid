/*
 * Created on May 9, 2012
 *
 * To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package android.util;

import org.apache.log4j.Logger;

public class Log {

  public static final int VERBOSE = 2;
  public static final int DEBUG = 3;
  public static final int INFO = 4;
  public static final int WARN = 5;
  public static final int ERROR = 6;
  public static final int ASSERT = 7;
  
  public static int i(String string, String sql) {
    Logger.getLogger(Log.class).info(string + ":" + sql);
    return 0;
  }

  public static int v(String string, String sql) {
    Logger.getLogger(Log.class).debug(string + ":" + sql);
    return 0;
  }

  public static int e(String string, String sql) {
    Logger.getLogger(Log.class).error(string + ":" + sql);    
    return 0;
  }

  public static int e(String string, String sql, Throwable error) {
	  Logger.getLogger(Log.class).error(string + ":" + sql, error);  
	  return 0;
  }
  
  public static int d(String string, String sql) {
    Logger.getLogger(Log.class).debug(string + ":" + sql);    
    return 0;
  }

  public static int e(String string, String string2, Exception e) {
    Logger.getLogger(Log.class).error(string + ":" + string2, e);
    return 0;
  }

}
