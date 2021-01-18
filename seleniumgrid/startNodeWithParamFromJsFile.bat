start java -jar selenium-server-standalone-3.141.59.jar -role hub -port 4444
start java -jar selenium-server-standalone-3.141.59.jar -role node -port 5599 -hub http://localhost:4444/grid/register -nodeConfig NodeConfig.json -Dwebdriver.chrome.driver=chromedriver.exe -Dwebdriver.gecko.driver=geckodriver.exe
@pause