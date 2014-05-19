Hashmap seems to be the Python dictionary, where you PUT in two objects. The first parameter is the key, the second is the value. 

In terms of implementation, it is a hash table based on the Map interface. 
Essentially, this permits nulls and is unsynchronized. 


Tree Maps are implemented by a red-black tree and is essentially similar to Hashmap, but is ordered so that printing it will return all of the values in an ordered way. 

Treemaps are not synchronized, and cannot be iterated through(?).

TreeSet is essentially Tree map that is iterable. You can loop through the tree, but can only store a single form of object. It is implemented based on a treemap, which is implemented through a red-black tree. 

HASH MAP Timing(PUT)

(NUMBER:TIME)
5:1
10:1
100:1
1000:4
10000:51
100000:109
1000000:403
10000000:2987
100000000:25746

TREE MAP Timing(PUT)

(NUMBER:TIME)
5:2
10:1
100:2
1000:7
10000:41
100000:129
1000000:930
10000000:7260
100000000:67178







