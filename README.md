/home/sergii/java/open-jdk-12.0.1/bin/java -javaagent:/home/sergii/idea-18/lib/idea_rt.jar=34433:/home/sergii/idea-18/bin -Dfile.encoding=UTF-8 -classpath /home/sergii/project/test/target/classes:/home/sergii/.m2/repository/com/fasterxml/jackson/dataformat/jackson-dataformat-xml/2.9.9/jackson-dataformat-xml-2.9.9.jar:/home/sergii/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.9.9/jackson-core-2.9.9.jar:/home/sergii/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.9.0/jackson-annotations-2.9.0.jar:/home/sergii/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.9.9/jackson-databind-2.9.9.jar:/home/sergii/.m2/repository/com/fasterxml/jackson/module/jackson-module-jaxb-annotations/2.9.9/jackson-module-jaxb-annotations-2.9.9.jar:/home/sergii/.m2/repository/org/codehaus/woodstox/stax2-api/3.1.4/stax2-api-3.1.4.jar:/home/sergii/.m2/repository/com/fasterxml/woodstox/woodstox-core/5.1.0/woodstox-core-5.1.0.jar repro.ReproduceTest
com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Cannot construct instance of `repro.ClientResponseData` (no Creators, like default construct, exist): cannot deserialize from Object value (no delegate- or property-based Creator)
 at [Source: (StringReader); line: 1, column: 21]
	at com.fasterxml.jackson.databind.exc.InvalidDefinitionException.from(InvalidDefinitionException.java:67)
	at com.fasterxml.jackson.databind.DeserializationContext.reportBadDefinition(DeserializationContext.java:1452)
	at com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:1028)
	at com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1297)
	at com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:326)
	at com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:159)
	at com.fasterxml.jackson.databind.ObjectMapper._readMapAndClose(ObjectMapper.java:4013)
	at com.fasterxml.jackson.databind.ObjectMapper.readValue(ObjectMapper.java:3004)
	at repro.ReproduceTest.main(ReproduceTest.java:15)
