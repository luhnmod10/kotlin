run:
	kotlinc *.kt -include-runtime -d luhnmod10.jar
	java -jar luhnmod10.jar
