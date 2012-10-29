package testing.ua.lib;

import static org.junit.Assert.*;

import org.junit.Test;

public class Jtest {

	@Test
	public void test() {
		String header = "Mozilla/5.0 (iPhone; U; CPU iPhone OS 3_1_3 like Mac OS X; en-us) " +
                "AppleWebKit/528.18 (KHTML, like Gecko) Version/4.0 Mobile/7E18 Safari/528.16";
		 nl.bitwalker.useragentutils.UserAgent uap=nl.bitwalker.useragentutils.UserAgent.parseUserAgentString(header); 
 assertEquals("iPhone", uap.getOperatingSystem().getGroup().getName());
 assertEquals("Safari", uap.getBrowser());
 assertEquals("528.16", uap.getBrowserVersion());
	}

	}


