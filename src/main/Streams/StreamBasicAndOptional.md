NOTES :

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

count occourence of a character in a string :
mapToInt()

If we use the mapToInt() method instead of map(), it will return IntStream instead of Stream.

----------------------------primitive flavour of stream--------------------
mapToInt() - when input is string and output is Integer - 
Ex : count the number of characters in a string :

if we are sure that our function is going to return a primitive, instead of using map() use mapToInt(), mapToLong() or mapToDouble().




-----------------------------flatmap()-------------------------
flatMap() method is used to flatten a stream of collections to a stream of elements combined from all collections.
Basically, flatMap() is used to do following operation:
- Stream<String[]> -> flatMap -> Stream<String>
- Stream<Set<String>> -> flatMap -> Stream<String>
- Stream<List<String>> -> flatMap -> Stream<String>


Ex : Filter the string and then peint filtered string.
    list.stream()
    .flatMap(s -> s.stream())
    .filter(x -> "a".equals(x))
    .forEach(System.out::println);


Why we need flatmap ?
Now, the question is why do we need to flatten our stream? The reason is that intermediate methods such as filter() and distinct() do not work on streams of Collections.

Similar to the map() method, flatMap() also has a primitive variation. These are:

    flatMapToInt
    flatMapToLong
    flatMapToDouble


=================================optional ------------------------------------
The Optional<T> is a wrapper class that stores an object of type T. The object may or may not be present in the optional.


Advantage : The benefit of Optional<T> is not that we are saved from applying a null check. The benefit is that Optional<T> class provides us lots of utility methods that we can apply to our wrapped objects.
-----Using ofNullable() method
   If while creating the Optional, you are not sure if the value is null or not null, then use the ofNullable() method. If a non-null value is passed in Optional.ofNullable(), then it will return the Optional, containing the specified value. Otherwise, it will return an empty Optional.

Methods in optional class- 
-- isPresent() ,  
-- ifPresent(Consumer<? super T> consumer), 
--get()
   The get() method returns a value if it is present in this Optional. Otherwise, it throws NoSuchElementException.
    It is risky to use this method without checking if the value is present or not using isPresent() method.

-- orElse(T other)
    This method returns the value present in the optional. If no value is present, then a default value provided as a parameter is returned.

-- orElseGet(Supplier<? extends T> other)#
This method returns the value present in the optional. If no value is present, then the value calculated from the supplier provided as a parameter is returned.

--orElseThrow(Supplier<? extends T> other)#

--Optional<T> filter(Predicate<? super T> predicate)
The filter() method is used to check if the value in our optional matches a particular condition. If yes, then the optional with the value is returned. Otherwise, an empty optional is returned.


--8) map(Function<? super T, ? extends U> mapper)
    As per Java docs, “if a value is present, apply the provided mapping function to it, and if the result is non-null, return an Optional describing the result. Otherwise, return an empty Optional.”
    Ex : Optional<Employee> optional = Optional.of(new Employee("Adam", 54, 20000));
           optional
                .map(emp -> emp.getSalary()) // Fetching the salary from employee object.
                .filter(sal -> sal > 10000) // Checking if the salary is greater than 10000.
                .ifPresent(System.out::println);


--9) flatMap(Function<? super T, Optional<U>> mapper)#
    The flatMap() method is similar to the map() method. The only difference is that the mapping function provided as a parameter to the flatMap() method should return an Optional. If a value is present in the original optional, then the mapping function is applied to it and the result is returned. Otherwise, an empty optional is returned.
    Ex :
        // Creating an Optional of Employee object.
        Optional<Employee> optional = Optional.of(new Employee("Adam", 54, 20000));
        optional.flatMap(emp -> emp.getSalary())
        .filter(sal -> sal > 10000)
        .ifPresent(System.out::println);

====================================================================================