@ECHO OFF
start java -jar selenium-server-standalone-3.141.59.jar -role hub
start java -Dwebdriver.chrome.driver=chromedriver.exe -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://localhost:4444/grid/register -port 5558 -browser browserName=chrome
start java -Dwebdriver.gecko.driver=geckodriver.exe -jar selenium-server-standalone-3.141.59.jar -role webdriver -hub http://localhost:4444/grid/register -port 5559 -browser browserName=firefox
start java -jar selenium-server-standalone-3.141.59.jar -role node -hub http://localhost:4444/grid/register