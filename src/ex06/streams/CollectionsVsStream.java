package ex06.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsVsStream {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("james");
        names.add("jim");
        names.add("jenny");
        System.out.println("---Iterate One---");
        for (String name : names){
            System.out.println(name);
        }

        System.out.println("---Iterate Two---");
        for (String name : names){
            System.out.println(name);
        }

        names.remove(0);
        System.out.println("All Names : " + names); //OP: [jim, jenny]

        Stream<String> namesStream = names.stream();
        namesStream.forEach(System.out::println);
        namesStream.forEach(System.out::println); //RE as because we can iterate once from stream

        //OP:

        /*
        ---Iterate One---
        james
        jim
        jenny
        ---Iterate Two---
        james
        jim
        jenny
        All Names : [jim, jenny]
        Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
            at java.util.stream.AbstractPipeline.sourceStageSpliterator(AbstractPipeline.java:279)
            at java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:580)
            at ex06.streams.CollectionsVsStream.main(CollectionsVsStream.java:30)
        jim
        jenny
         */

    }
}
