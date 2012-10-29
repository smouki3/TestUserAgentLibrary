package testing.ua.lib;

import nl.bitwalker.useragentutils.UserAgent;

public class TestingLib {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] userAgentStr = {"Mozilla/5.0 (iPhone; U; CPU iPhone OS 3_1_3 like Mac OS X; en-us) "
				+ "AppleWebKit/528.18 (KHTML, like Gecko) Version/4.0 Mobile/7E18 Safari/528.16",
				"Mozilla/5.0 (iPad; CPU OS 5_1_1 like Mac OS X) AppleWebKit/534.46 (KHTML, like Gecko) Version/5.1 Mobile/9B206 Safari/7534.48.3",
				"Mozilla/5.0 (iPad; U; CPU iPhone OS 5_1_1 like Mac OS X; en-GB) iPadTimesAnvil/2.7",
				"Mozilla/5.0 (iPad; U; CPU iPhone OS 5_1_1 like Mac OS X; en-CA) iPadTimesAnvil/2.7",
				"Mozilla/5.0 (iPad; CPU OS 6_0 like Mac OS X) AppleWebKit/536.26 (KHTML, like Gecko) Version/6.0 Mobile/10A403 Safari/8536.25",
				"Mozilla/5.0 (Linux; U; Android 2.3.6; en-gb; GT-I8160 Build/GINGERBREAD) Times/1.3.0",
				" Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.1; Trident/4.0; .NET CLR 1.1.4322; .NET CLR 2.0.50727; .NET CLR 3.0.4506.2152; .NET CLR 3.5.30729; MS-RTC LM 8; .NET4.0C; .NET4.0E)",
				"BlackBerry8520/5.0.0.681 Profile/MIDP-2.1 Configuration/CLDC-1.1 VendorID/123,platform,unknown",
				"BlackBerry9105/6.6.0.223 Profile/MIDP-2.0 Configuration/CLDC-1.1 VendorID/120 The Times/1.0,platform,unknown",
				"BlackBerry9300/6.6.0.236 Profile/MIDP-2.0 Configuration/CLDC-1.1 VendorID/123 The Times/1.0,platform,unknown",
				"BlackBerry9360/8.0.0.388 Profile/MIDP-2.0 Configuration/CLDC-1.1 VendorID/600 The Times/1.0,platform,unknown",
				"BlackBerry9700/5.0.0.593 Profile/MIDP-2.1 Configuration/CLDC-1.1 VendorID/123,platform,unknown",
				"BlackBerry9790/9.16.0.129 Profile/MIDP-2.0 Configuration/CLDC-1.1 VendorID/120 The Times/1.0,platform,unknown",
				"BlackBerry9800/6.4.0.105 Profile/MIDP-2.0 Configuration/CLDC-1.1 VendorID/142 The Times/1.0,platform,unknown",
				"BlackBerry9800/6.6.0.200 Profile/MIDP-2.0 Configuration/CLDC-1.1 VendorID/125 The Times/1.0,platform,unknown","Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.1; Trident/4.0; BTRS123400; GTB7.4; Media Center PC 3.0; .NET CLR 1.0.3705; .NET CLR 2.0.50727; .NET CLR 3.0.4506.2152; .NET CLR 3.5.30729; .NET CLR 1.1.4322),platform,unknown","kasmnkad/d23233qw" };

		printPropertyOfUserAgent(userAgentStr);

	}

	// UserAgent ua = UserAgent
	// .parseUserAgentString("Mozilla/5.0 (iPad; U; CPU iPhone OS 5_1_1 like Mac OS X; en-GB) iPadTimesAnvil/2.7");
	//
	// System.out.println("the user agent is:\t" + ua + "\n the browser is:\t"
	// + ua.getBrowser() + "\n the browser's version is:\t"
	// + ua.getBrowserVersion() + "\n operating system is:\t"
	// + ua.getOperatingSystem() + "\n the browser type is:\t"
	// + ua.getBrowser().getBrowserType()
	// + "\n the os manifacture  is:\t"
	// + ua.getOperatingSystem().getManufacturer()
	// + "\n the device type  is:\t"
	// + ua.getOperatingSystem().getDeviceType()
	// + "\n the group is:\t" + ua.getOperatingSystem().getGroup());
	// }

	public static void printPropertyOfUserAgent(String[] userAgentArr) {

		for (int i = 0; i <= userAgentArr.length-1; i++) {
			UserAgent ua = UserAgent.parseUserAgentString(userAgentArr[i]);
			
			System.out
					.println("the user agent is:\t" + ua
							+ "\n the browser is:\t" + ua.getBrowser()
							+ "\n the browser's version is:\t"
							+ ua.getBrowserVersion()
							+ "\n operating system is:\t"
							+ ua.getOperatingSystem().getName()
							+ "\n the browser type is:\t"
							+ ua.getBrowser().getBrowserType().getName()
							+ "\n the os manifacture  is:\t"
							+ ua.getOperatingSystem().getManufacturer().getName()
							+ "\n the device type  is:\t"
							+ ua.getOperatingSystem().getDeviceType().getName()
							+ "\n the group is:\t"
							+ ua.getOperatingSystem().getGroup());
			
			System.out.println();
			System.out.println();
	
		}
	
	}

}
