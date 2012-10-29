 CIP 39 User Agent Parser
====================

The project is for parsing User Agent String to User Agent Object

###There is a [UserAgent](https://github.com/Gpetkov/UserAgentRepository/blob/master/UserAgentParser/src/uk/co/newsint/cip/utilities/ua/UserAgent.java) class with eight properties
-
<p>* deviceType          (example --> TABLET)
<p>* deviceMaker        (example --> BlackBerry)
<p>* deviceModel          (example --> Bold)
<p>* deviceModelVersion  (example --> 9900)
<p>* os                   (Operation system (example --> Windows))
<p>* osVersion (Operation system version (example --> 5.0))
<p>* browser (Current browser MSIE,Safari,Chrome)
<p>* browserVersion (Current browser version example --> 534.57.2 (Safari))

--

###And four Parsing classes:
-
####[UserAgentParser](https://github.com/Gpetkov/UserAgentRepository/blob/master/UserAgentParser/src/uk/co/newsint/cip/utilities/ua/UserAgentParser.java): base abstract class for all parser classes

#####[UserAgentUtilsParser](https://github.com/Gpetkov/UserAgentRepository/blob/master/UserAgentParser/src/uk/co/newsint/cip/utilities/ua/UserAgentUtilsParser.java): extends UserAgentParser and use [UserAgentUtils](http://user-agent-utils.java.net/) - library to parse the UAString to an UAObject

#####[RegexpUserAgentParser:](https://github.com/Gpetkov/UserAgentRepository/blob/master/UserAgentParser/src/uk/co/newsint/cip/utilities/ua/RegexpUserAgentParser.java) extends UserAgentParser and use our own RegEx to parse the UAString to an UAObject

#####[CompositeUserAgentParser:](https://github.com/Gpetkov/UserAgentRepository/blob/master/UserAgentParser/src/uk/co/newsint/cip/utilities/ua/CompositeUserAgentParser.java) extends UserAgentParser and this combines the above two classes for more efficiency#
 
###### All tree classes @Override parse(String userAgentString) method
--

