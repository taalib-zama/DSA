-------------------all below operations are immutable---------------
------distinct, limit, and skip------
The slicing operations are intermediate operations, and, as the name implies, they are used to slice a stream.


1. distinct()
   The first operation that we are going to discuss is distinct(). It returns a stream consisting of the distinct elements (according to Object.equals(Object)) of this stream.

   So, if you have a stream of custom objects then your custom class should override equals() and hashcode() methods.


2. limit()
   This is also an intermediate function. It returns a stream consisting of the elements of this stream, truncated to be no longer than maxSize in length.
        Ex : countries.stream()
       .distinct()
       .limit(3)
       .forEach(System.out::println);

3) skip()
   Like distinct() and limit(), skip() is also an intermediate method. It returns a stream consisting of the remaining elements of this stream after discarding the first n elements of the stream.


-------------------------------------------------Matching operations-------------------------------------------
Matching operations are terminal operations that are used to check if elements with certain criteria are present in the stream or not.

There are mainly three matching functions available in Stream. These are:

1) anyMatch()#
   It returns true if any elements of the stream match the provided predicate. Otherwise, it returns false.
    ---check if any person is residing in a particular country or not.
           boolean anyCanadian = list.stream()
           .anyMatch(p -> p.getCountry().equals("Canada"));

   2) allMatch()# - It takes a predicate as input and returns
            true if all elements match the criteria.
            true if the stream is empty.
            false if even a single element does not match the criteria.
      boolean anyCanadian = list.stream()
      .allMatch(p -> p.getCountry().equals("Canada"));

      3) noneMatch()# - It returns true if no elements of the stream match the provided predicate. Otherwise, it returns false.
         boolean anyRussian = list.stream()
         .noneMatch(p -> p.getCountry().equals("Russia"));


----------------------------------------finding operations-------------------------------------------
used when we need to get the matched element instead of just verifying if it is present or not.

operations : findFirst() and findAny().  ---------->  returns Optional


1) findFirst()
   2) findAny() - It returns an Optional describing some element of the stream, or an empty Optional if the stream is empty.
    The behavior of this method is explicitly nondeterministic; it is free to return any element in the stream. This is to allow for maximal performance in parallel operations.

Ex :
        Optional<Person> person = list.stream()               // Creating a Stream of person objects.
        .filter(p -> p.getCountry().equals("India")) // Filter to get only persons living in India.
        .findFirst()/ findAny();  


----------------------------------------------reduction operations----------------------------
Reduction stream operations are those operations that reduce the stream into a single value.
key concepts of reduction:
        
        Identity – an element that is the initial value of the reduction operation and the default result if the stream is empty.
        Accumulator – a function that takes two parameters: a partial result of the reduction operation and the next element of the stream.
        Combiner – a function used to combine the partial result of the reduction operation when the reduction is parallelized.
        or there’s a mismatch between the types of the accumulator arguments and the types of the accumulator implementation.
        
1. reduce
   a. Optional<T> reduce(BinaryOperator<T> accumulator).
   Ex :  find the total salaries of all the employees in an organization.
       Optional<Integer> totalSalary = list.stream()
       .map(p -> p.getSalary())  //We are converting the Stream of Employees to Stream of salaries.
       .reduce((p,q) -> p + q);

    b. T reduce(T identity, BinaryOperator<T> accumulator)#
   we provide five as an identity. If the stream is empty, five will be returned. If the stream is not empty, five will be added to the sum.
       int totalSum = list.stream()
       .reduce(5, (partialSum, num) -> partialSum + num);

   c. <U> U reduce(U identity, BiFunction<U, ? super T,U> accumulator, BinaryOperator<U> combiner)
   If we are using a parallel stream, then the Java runtime splits the stream into multiple substreams. In such cases, we need to use a function to combine the results of the substreams into a single one. This is done by a combiner.
        int totalSum = list.parallelStream()
                .reduce(0, (partialSum, num) -> partialSum + num, Integer::sum);



2. max() and min()
      max() and min() operations are very helpful if we need to get the largest or smallest element from a stream.
      ----  Optional<T> max(Comparator<? super T> comparator)
                          Optional<Integer> max = list.stream()
                          .max(Comparator.naturalOrder());
                    
                    
                          Optional<Integer> min = list.stream()
                          .min(Comparator.naturalOrder());


