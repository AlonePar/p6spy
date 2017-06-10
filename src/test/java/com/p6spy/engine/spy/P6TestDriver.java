
package com.p6spy.engine.spy;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.sql.Driver;
import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.p6spy.engine.test.P6TestFramework;

@RunWith(Parameterized.class)
public class P6TestDriver extends P6TestFramework {

  public P6TestDriver(String db) throws SQLException, IOException {
    super(db);
  }

  @Test
  public void testVersion() throws Exception {
    Driver driver = new P6SpyDriver();
    assertEquals(2, driver.getMajorVersion());
    assertEquals(0, driver.getMinorVersion());
  }

}
