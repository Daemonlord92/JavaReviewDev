package org.blitmatthew;

@FunctionalInterface
public interface TriFunction<T,U,P,R> {
    R apply(T t,U u,P p);
}
