# **Fruit Box Exercise**

##Given
-       a list of fruit types, each fruit type with a price in €/Kg
-       a list of fruits, each fruit with a weight


##TASK:
- package the fruits in boxes of at most 1Kg and for each package provide
-       list of fruits contained
-       package weight
-       package price calculated as the price of the sum of the prices of the fruits, with 2 decimals plus a packaging fee per each package (independent of the content)

###Notes:
- package the fruits in the same order they come, don't re-arrange them
- don't split the fruits, if the box is not full but the next fruit doesn't fit, the box will be closed with less than 1kg of fruits
- also, if the list of fruits finishes and there is still space in the current box, that last box is considered completed and packaged
 

###  ISSUES TO RESOLVE
- Skipping the print of the last Package info (Total Weight, Total Price )
- Loosing one fruit element in the cicle after the package weight is < 1Kg