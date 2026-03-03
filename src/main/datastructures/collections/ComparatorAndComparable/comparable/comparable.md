>> Comparable interface allows sorting of list elements using the compareTo method



>> Collections.sort() method sorts the given List in ascending order


 >> This interface contains a compareTo(T o) method which is used by sorting methods to sort the Collection.


>>  Collections.sort(List<T> list) method to sort an ArrayList, then the class whose objects are stored in the ArrayList must implement the Comparable interface
   If the ArrayList stores an Integer, a Long, or a String, then we don’t need to worry as these classes already implement the Comparable interface.
   But if the ArrayList stores a custom class object, then that class must implement the Comparable interface.





   