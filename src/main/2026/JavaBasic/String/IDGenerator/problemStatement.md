## Problem statement
You are developing an inventory system for a retail warehouse. To organize products efficiently, 
every item needs a unique SKU (Stock Keeping Unit). You need to write a specific method generateSKU 
that **accepts a product name and an ID, then generates a formatted SKU** based on specific naming conventions
and returns the formatted code. This keeps your code reusable for thousands of products.



## Task requirements
Implement the method generateSKU(String productName, int id).

Inside the method:

Extract the first three characters of the name (uppercase).

Extract the last two characters of the name (uppercase).

Return a string combining them with the ID: [First3]-[ID]-[Last2].

