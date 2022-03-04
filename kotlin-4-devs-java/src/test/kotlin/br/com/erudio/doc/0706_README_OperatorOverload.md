# Operator Overload

## Instructions

Given two Data Classes with two attributes make sum and subtraction, return true if the return is equals to expected or false if it is not. Use Operator Overload to do that.

## Examples

```kotlin
operator fun plus(other: Coordinates) : Coordinates {
    TODO("not implemented")
}

operator fun minus (other: Coordinates) : Coordinates {
    TODO("not implemented")
}
```

```kotlin
val p3 = p1 + p2
p3.toString() shouldBeEqualTo "Coordinates(x=1200, y=2100)" // true

val p3 = p1 - p2
p3.toString() shouldBeEqualTo "Coordinates(x=1200, y=2100)" // false
```