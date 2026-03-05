NOTEs :


A stream is not a data structure itself. It is a bunch of operations applied to a source. The source can be collections,
arrays or I/O channels.

Streams don’t change the original data structure.

There can be zero or more intermediate operations that transform a stream into another stream.

Streams are lazy. They don’t do anything until you call a terminal operation. 
Intermediate operations are not executed until a terminal operation is invoked on the stream pipeline.

Stream creation : 
 a) Stream.of(v1, v2, v3….)
 b) List.stream()
 c) Arrays.stream(array)
 d) Stream.generate(Supplier<T> s)
 e ) str.chars()
.mapToObj(c -> (char) c)
.forEach(System.out::println);

<<-------------- The Stream interfaces--------------->>
The Stream API defines a few interfaces such as Stream, IntStream, LongStream, etc.
The Stream<T> interface is for object elements. For primitives, it defines IntStream, LongStream and DoubleStream interfaces.
It is a good practice to use primitive streams if you are dealing with primitives because wrapping primitives to objects and auto-boxing is a costly process.

-----------------------Operations on Stream----------------------
Intermediate operations
These methods do not produce any results. They usually accept functional interfaces as parameters and always return a 
new stream. Some examples of intermediate operations are filter(), map(), etc.

Terminal operations
These methods produce some results, e.g., count(), toArray(..), and collect(..).


1. Filtering operation :  its takes prdicate as parametre   Stream filter(Predicate<? super T> predicate)
Ex : list.stream()
   .filter(person -> person.getAge() > 18 && person.getAge() < 60)
   .forEach(System.out::println);



filter chaining : 


2. Mapping operation :     <R> Stream<R> map(Function<? super T, ? extends R> mapper)