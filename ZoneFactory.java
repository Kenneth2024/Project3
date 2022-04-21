package Project3_Factory_Pattern;

/* Project: Project3_Factory_Pattern
 * Class: ZoneFactory.java
 * Author: Kenneth Wong
 * Date April 18, 2022
 */

public class ZoneFactory {
	public Zone createZone(String zoneid) {
		if(zoneid == null || zoneid.isEmpty()) 
			return null;
		switch (zoneid) {
		case "US/Eastern":
			return new ZoneUSEastern();
		case "US/Central":
			return new ZoneUSCentral();
		case "US/Mountain":
			return new ZoneUSMountain();
		case "US/Pacific":
			return new ZoneUSPacific();
		default:
			throw new IllegalArgumentException("Unknown US timezone: " +zoneid);
		}
	}
}
