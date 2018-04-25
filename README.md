List Permutation 
=====
Generate all permutations of a given list

## Detail

Write Scala function to compute permutation of a given list. 

### Assumption

Elements of the list are unique

### Getting Started

```
git clone git@github.com:kayvank/ListPermutation.git
cd ListPermutation
```
### Prerequisites

- [JDK 8 or better](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [sbt](https://www.scala-sbt.org/)

### Running the tests

```
sbt test
```
#### Solution detail

Please note the original problem did not ask for a tail recursive solution. Proposed solution is not a tail recursive one. You may experienced GC errors for List size of more than 10 elements  using the default JVM setting.

##### Source code

- source code: 
    - [ListPermutation](./src/main/scala/intrvw/ListPermutation.scala)
    - [SpreadSheet](./src/main/scala/intrvw/SpreadSheet.scala)
- Unit test: 
    - [ListPermutationSpec](./src/test/scala/intrvw/ListPermutationSpec.scala)
    - [SpreadSheetSpec](./src/test/scala/intrvw/SpreadsheetSpec.scala)

### Autors

- Kayvan Kazeminejad
