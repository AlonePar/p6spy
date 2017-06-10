
package com.p6spy.engine.spy.appender;

/**
 * @author Quinton McCombs
 * @since 09/2013
 */
public interface MessageFormattingStrategy {
  /**
   * Formats a log message for the logging module
   *
   * @param connectionId the id of the connection
   * @param now the current ime expressing in milliseconds
   * @param elapsed the time in milliseconds that the operation took to complete
   * @param category the category of the operation
   * @param prepared the SQL statement with all bind variables replaced with actual values
   * @param sql the sql statement executed
   * @return the formatted log message
   */
  String formatMessage(int connectionId, String now, long elapsed, String category, String prepared, String sql);

}
