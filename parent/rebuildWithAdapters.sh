rm src/main/kotlin/edsl/model/*JsonAdapter.kt
mvn clean install -f pom-aux.xml && \
    cp -R target/generated-sources/kaptKotlin/compile/* src/main/kotlin/  && \
    diff  target/generated-sources/kaptKotlin/compile/edsl/model/ src/main/kotlin/edsl/model/ 
mvn clean install -f pom-aux.xml

