###This Project is a cucumber based project for POC on Functional Test Automation

**To Run From Test Runner:**
 
**Using single tag:**<br>
tags = "@SwagLabs"<br>

**Using multiple or conditional tags:**<br>
tags = "@SwagLabs or  @Regression"<br>
tags = "(@SwagLabs or  @Regression) and @Smoke"<br>
tags = "(@SwagLabs or  @Regression) and not @Smoke"<br>

**To Run through command line:**<br>

mvn clean install -Dcucumber.filter.tags="@SwagLabs or  @Regression"<br>
mvn clean verify -Dcucumber.filter.tags="@SwagLabs or  @Regression"<br>

**WIP for setting browser through command line**<br>
mvn clean verify -Dcucumber.filter.tags="@SwagLabs or  @Regression" -DbrowserPlatform=chrome -Denv=dev<br>