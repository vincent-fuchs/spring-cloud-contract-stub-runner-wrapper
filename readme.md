I realized later that this is actually equivalent to what you can get by doing the following :  
- cloning https://github.com/spring-cloud-samples/stub-runner-boot.git 
- running _mvn clean install_

--> it would generate an executable fat jar in : M2_LOCAL_REPO/com/example/stub-runner-boot/0.0.1/stub-runner-boot-0.0.1.jar

==================================================


This is a very simple wrapper over spring-cloud-starter-contract-stub-runner : as indicated on https://cloud.spring.io/spring-cloud-contract/spring-cloud-contract.html#_how_to_use_it , 
it builds a fat jar that can be called from command line with arguments.

For instance running this :

``
java -Dstubrunner.workOffline=true -Dstubrunner.ids="my.group:myArtifact:+:8090" -Dmaven.repo.local="C:/HOMEWARE/maven-2_local" -jar spring-cloud-contract-stub-runner-wrapper-1.0.0-SNAPSHOT.jar
``

Would fetch the stubs latest version for _myArtifact_ (belonging to _my.group_ ) from the local Maven repo mentioned by _maven.repo.local_ and run it in local on port _8090_
