/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.calcite.avatica;

import org.apache.calcite.avatica.ColumnMetaData.Rep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class for {@link Rep}.
 */
public class RepTest {

  @Test public void testNonPrimitiveRepForType() {
    assertEquals(Rep.BOOLEAN, Rep.getNonPrimitiveRep(SqlType.BIT));
    assertEquals(Rep.BOOLEAN, Rep.getNonPrimitiveRep(SqlType.BOOLEAN));
    assertEquals(Rep.BYTE, Rep.getNonPrimitiveRep(SqlType.TINYINT));
    assertEquals(Rep.SHORT, Rep.getNonPrimitiveRep(SqlType.SMALLINT));
    assertEquals(Rep.INTEGER, Rep.getNonPrimitiveRep(SqlType.INTEGER));
    assertEquals(Rep.LONG, Rep.getNonPrimitiveRep(SqlType.BIGINT));
    assertEquals(Rep.DOUBLE, Rep.getNonPrimitiveRep(SqlType.FLOAT));
    assertEquals(Rep.DOUBLE, Rep.getNonPrimitiveRep(SqlType.DOUBLE));
    assertEquals(Rep.STRING, Rep.getNonPrimitiveRep(SqlType.CHAR));
  }

  @Test public void testSerialRep() {
    assertEquals(Rep.BOOLEAN, Rep.getSerialRep(SqlType.BIT));
    assertEquals(Rep.BOOLEAN, Rep.getSerialRep(SqlType.BOOLEAN));
    assertEquals(Rep.BYTE, Rep.getSerialRep(SqlType.TINYINT));
    assertEquals(Rep.SHORT, Rep.getSerialRep(SqlType.SMALLINT));
    assertEquals(Rep.INTEGER, Rep.getSerialRep(SqlType.INTEGER));
    assertEquals(Rep.LONG, Rep.getSerialRep(SqlType.BIGINT));
    assertEquals(Rep.DOUBLE, Rep.getSerialRep(SqlType.FLOAT));
    assertEquals(Rep.DOUBLE, Rep.getSerialRep(SqlType.DOUBLE));
    assertEquals(Rep.INTEGER, Rep.getSerialRep(SqlType.DATE));
    assertEquals(Rep.INTEGER, Rep.getSerialRep(SqlType.TIME));
    assertEquals(Rep.LONG, Rep.getSerialRep(SqlType.TIMESTAMP));
  }
}

// End RepTest.java
