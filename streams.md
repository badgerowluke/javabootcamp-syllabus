In Java, a stream is a sequence of elements that supports various operations to perform computations over those elements. It is not a data structure itself but rather an abstraction that allows you to process collections of data in a declarative and functional style.

Here are some key characteristics and concepts related to streams in Java:

1. **Sequence of Elements**: A stream represents a sequence of elements, which can be objects of any type, such as integers, strings, or custom objects.

2. **Source**: Streams are typically created from a data source such as collections (e.g., lists, sets, maps), arrays, input/output resources (e.g., files), or even generator functions.

3. **Pipeline**: Streams support a pipeline of operations that can be applied sequentially to process the elements. These operations can include filtering, mapping, sorting, and aggregation.

4. **Lazy Evaluation**: Most stream operations are lazily evaluated, meaning that elements are processed only when necessary. This allows for efficient processing of large data sets without loading all elements into memory at once.

5. **Intermediate and Terminal Operations**: Stream operations can be divided into two categories:
   - Intermediate operations: These operations transform or filter the stream and return a new stream as a result. Examples include filter, map, and sorted.
   - Terminal operations: These operations consume the stream and produce a result or side effect. Examples include forEach, collect, and reduce. After a terminal operation is executed, the stream is considered consumed and cannot be used again.

6. **Immutability and Side Effects**: Streams are designed to be immutable and avoid side effects. Intermediate operations do not modify the original stream but produce a new stream with the transformed elements. This facilitates parallel processing and makes streams suitable for functional programming.

In summary, streams provide a powerful and expressive way to process collections of data in Java, enabling concise and readable code that is often easier to understand and maintain compared to traditional imperative approaches. They encourage functional programming practices and can improve the efficiency and scalability of data processing tasks. Please review [this repository](https://github.com/namvdo/lambdas-and-streams-best-practices) for a concise list of examples of dos and donts when using streams.