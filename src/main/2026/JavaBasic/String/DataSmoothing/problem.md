## Problem statement

You are working on a weather station system. The temperature sensor occasionally records erratic data due to wind interference. You receive a batch of raw temperature readings. To get a clear picture of the day’s weather, you need to design reusable method processSensorData that takes this raw array, discard the extreme outliers (the lowest and highest readings) and then calculate the average of the remaining stable readings.



## Task requirements
Implement processSensorData(double[] data) which returns a double.

Inside the method:

Sort the array to find min and max easily.

Calculate the average excluding the first (min) and last (max) elements.

In main, call the method with the provided array and print the returned average.




## Constraints
Use Arrays.sort() inside the method.

Handle the logic using a loop that skips index 0 and index length-1.

Do not modify the main method provided in the boilerplate (except to call your new function).




