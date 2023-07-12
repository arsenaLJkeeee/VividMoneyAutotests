
# QA Auto project for Vivid Money [Vivid Money](https://vivid.money/en-eu/)

> Vivid Money is a new online banking app that is designed to help you grow your money.

## **Contains:**
____

* <a href="#tools">Technologies and tools</a>

* <a href="#cases">Examples of automated test-cases</a>

* <a href="#jenkins">Build in Jenkins</a>

* <a href="#console">Launch from Terminal</a>

* <a href="#allure">Allure report</a>

* <a href="#video">Test execution in Selenoid (video)</a>
____
<a id="tools"></a>
## <a name="Technologies and tools">**Technologies and tools:**</a>

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/logo/Github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>   
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>  
</p>

____
<a id="cases"></a>
## <a name="Examples of automated test-cases">**Examples of automated test-cases:**</a>
____
- ✓ *Check that Banking pop-up is working*
- ✓ *Check that items from Banking pop-up is working*
____
<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="images/logo/Jenkins.svg" width="25"/></a><a name="Build"></a>Build in [Jenkins](https://jenkins.autotests.cloud/job/VRBorchevskiy-qa_guru_20_jenkins_remote/)</a>
____
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/VRBorchevskiy-qa_guru_20_jenkins_remote"><img src="images/screen/jenkins_build.jpg" alt="Jenkins" width="950"/></a>  
</p>


### **Configuration in Jenkins:**

- *baseUrl (address of tested web page)*
- *remoteUrl (login, password, and address of remote Selenoid server)*

<a id="console"></a>
## Commands for launch
___
***Local launch:***
```bash  
clean remote_test
```

***Remote launch via Jenkins:***
```bash  
clean remote_test
"-Dbrowser=${browser}"
"-DbrowserVersion=${browserVersion}"
"-DbrowserSize=${browserSize}"
"-DbaseUrl=${baseUrl}"
"-DremoteUrl=${remoteUrl}"
```
___
<a id="allure"></a>
## <img alt="Allure" height="25" src="images/logo/Allure.svg" width="25"/></a> <a name="Allure"></a>Allure [report](https://jenkins.autotests.cloud/job/VRBorchevskiy-qa_guru_20_jenkins_remote/allure/)</a>
___

### *Main page of report*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/jenkins.jpg" width="850">  
</p>  

### *Test-cases*

<p align="center">  
<img title="Allure Tests" src="images/screen/vividmoneytestcases.jpg" width="850">  
<img title="Allure Tests" src="images/screen/vividmoneydataoftestcases.jpg" width="850">  
</p>

### *Graphics*

  <p align="center">  
<img title="Allure Graphics" src="images/screen/graph1.jpg" width="850">

<img title="Allure Graphics" src="images/screen/graph.jpg" width="850">  
</p>

____
<a id="video"></a>
## <img alt="Selenoid" height="25" src="images/logo/Selenoid.svg" width="25"/></a> Video of launched automated tests
____
<p align="center">
<img title="Selenoid Video" src="images/video/vividmoney.gif" width="550" height="350"  alt="video">   
</p>

