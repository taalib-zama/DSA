//The traditional approach focuses on "how" to achieve tasks, like looping through numbers.

//Understand the functional programming focus on "what to do" rather than "how to do it".

Streams methods :
numbers.stream(): Converts the list of numbers into a stream, which is a sequence of elements.

.forEach(): Applies the specified action (in this case, printing) to each element in the stream.

FP01Functional::print: This is a method reference to the print method, which will be used to print each number.





Understanding Key Functional Programming Concepts
Streams: A stream is a sequence of elements that supports various operations to process data in a declarative way. In
this case, we convert the list of numbers into a stream to process each element without manually looping.

Method References (::): Instead of passing a full lambda expression or explicitly calling a method inside forEach(), we
use a method reference (FP01Functional::print). This is a shorthand for telling Java to execute the print method for
each element in the stream.