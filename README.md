# java14-instanceof-tutorial
Tutorial on Java 14’s intanceof operator (a preview feature)

The instanceof operator in Java 14 has been extended to allow for what's called a "test type pattern" which allows 
for Pattern Matching to be used. This test type pattern is a combination of a predicate that specifies a Type
(like instanceof Type) and a binding variable (that's what is new here).

No more explicit casting and no more declaration of local variables, less boilerplate code .. great! 
Just be aware that there are some scoping rules with the new binding variable that are well described in the JEP 305 .

This new feature also is quite useful when writing your on equality methods and really streamlines 1 liner
return statement. Readability of this type of code is improved and less susceptible to runtime errors 
arising from incorrect casting.

# Java 14 instanceof - Preview Feature

This tutorial supports Blog post "Java 14 instanceof | Hold Up!"
from mvpjava.com

Blog Post:  http://mvpjava.com/instanceof-java-14/instanceof-java-14

YouTube Tutorial: TBD

======================================================

Subscribe to MVP Java ...

https://www.youtube.com/c/MVPJava?sub_confirmation=1

Follow me ...

Website  : http://www.mvpjava.com

Facebook : https://www.facebook.com/mvpjava

Twitter  : https://twitter.com/mvpjava

DockerHub: https://hub.docker.com/?namespace=mvpjava
