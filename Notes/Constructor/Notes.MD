**Constructors**

**Constructor Chaining**
-Is the process of calling one constructor from another constructor with respect to the current object.
-Is used to avoid duplicate codes while having multiple constructors and makes code more readable.
-Can be done in two ways:
    1.within same class - can be done using 'this()' for constructors in the same class.
    2.from base class - using 'super()' to call the constructor from the base class.

-Constructor chaining occurs through inheritance.
-A sub-class constructor's task is to call super class's constructor first.
-The process is used when we want to perform multiple tasks in a single constructor rather than creating code for each task in a single constructor we create a separate constructor for each task and make their chain which makes the program more readable.

# Constructor Overloading.
-Process in which a class can have any number of constructors that differ in parameter lists.
-Same name but different signatures.
-Whenever we are omitting some values from the primary constructor, we need to define the data n our secondary constructor using 0, N/A etc etc.

