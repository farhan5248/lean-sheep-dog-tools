cd ..
call mvn clean
call mvn org.farhan:sheep-dog-maven-plugin:LATEST:asciidoctor-to-uml -Dtag="%1"
call mvn org.farhan:sheep-dog-maven-plugin:LATEST:uml-to-cucumber -Dtag="%1"
cd scripts 