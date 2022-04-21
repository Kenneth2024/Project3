package Project3_Factory_Pattern;

/* Project: Project3_Factory_Pattern
 * Class: Test.java
 * Author: Kenneth Wong
 * Date April 18, 2022
 */

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.*;

class Test {
	@org.junit.jupiter.api.Test
	void testZoneFactory() {
		ZoneFactory testZoneFactory = new ZoneFactory();
		assertNotSame("Should not be the same", testZoneFactory.createZone("US/Central"), testZoneFactory.createZone("US/Eastern"));
	}
	
	@org.junit.jupiter.api.Test
	void testMountainZone() {
		ZoneUSMountain test = new ZoneUSMountain();
		assertSame("Should be the same", test.displayName, "Mountain");
		assertSame("Should be the same", test.offset, -7);
	}
}
