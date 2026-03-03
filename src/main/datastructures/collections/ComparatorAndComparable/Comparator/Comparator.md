// Used when multiple sorting criteria are required or when you cannot modify the class to implement Comparable.



>>  to implement flexible sorting in Java collection
>use anonymous classes and lambda expressions to simplify sorting logic in lists.



One of the major drawbacks of using a Comparable interface is that the comparing logic gets fixed in the class itself. This means that if you want to sort the objects of that class based
on different attributes, you would need to implement multiple compareTo methods, which is not possible.

>> If we need some flexibility in sorting, we should use the Comparator interface instead of the Comparable interface.

>> Comparator interface has a method, compare(T o1, T o2),
> 
> 
> 