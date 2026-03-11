-------------------------mutable reduction operations---------
The mutable reductions collect the desired results into a mutable container object, such as a java.util.Collection or an array.

--The mutable reduction is achieved through the collect() method. It is one of the Java 8 Stream API’s terminal methods.

--There are two overloaded versions of the collect() method:
    -- collect(Collector<? super T,A,R> collector)
    -- <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner)

1 Collect method :
                        //getting all product names.
                        Set<String> uniqueProductNames = products.stream().map(product -> product.getName())
                        .collect(Collectors.toSet());
                        
                
                        //hashmap to store product name as key and product object as value
                        Map<Integer, Product> productMap = products.stream()
                                .collect(Collectors.toMap(product -> product.getRank(), product -> product));



                        //example to eliminate the duplicates in map operation  duting collect.
                         Map<String,Integer> nameMap = list.stream()
                .collect(Collectors.toMap(s -> s , s -> s.length(), (s1,s2) -> s1, HashMap::new));
                                            //here we provided another argument to specify which implement of map we want to use. By default it will return a HashMap but we can specify any other implementation of map as well.



2.  collectingAndThen(Collector<T,A,R> downstream, Function<R,RR> finisher)#
    This method returns a Collector that accumulates the input elements into the given Collector and then performs an additional finishing function, here using the unmodifiableList of collections class.
    List<String> unmodifiableList = list.stream()
    .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));



==================Collectors methods===============

--counting() - It returns a Collector that counts the number of input elements. It is used to count the number of elements in a stream.

summingInt/summingLong/ summingDouble - 
 >> Double price = products.stream().collect(Collectors.summingDouble(product -> product.getPrice()));

--averagingDouble
Double averagePrice = products.stream().collect(Collectors.averagingDouble(product -> product.getPrice()));



---MIN AND MAX
>> //we have an ArrayList of Employee objects and we need to find the Product object with a minimum price.
Optional<Product> minPriceProduct = products.stream()
.min(Comparator.comparing(Product::getPrice));
System.out.println();

======================Grouping operations=============
--groupingBy() - It is used to group the elements of a stream based on a classifier function. 
It returns a Map where the keys are the result of applying the classifier function and the values are Lists of elements that correspond to each key.

1) Collectors.groupingBy()
   This method is similar to the group by clause of SQL, which can group data on some parameters.
   groupingBy(Function<? super T, ? extends K> classifier)


Ex : in below example we use groupingby() to group the Employee objects based on countries of residence.
Map<String,List<Employee>> employeeMap = employeeList.stream()
.collect(Collectors.groupingBy(Employee::getCountry));


-- to apply a second collector on the result of groupingBy() we can use the overloaded version of groupingBy() method which takes a second collector as an argument.
ex : In the previous example, the value of Map was a List of employees. However, what if we need a Set of employees?
Map<String, Set<Employee>> employeeMap = employeeList.stream()
.collect(Collectors.groupingBy(Employee::getCountry, Collectors.toSet()));

