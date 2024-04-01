package com.jasper.cas;

import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReferenceDemo {
    public static void main(String[] args) {
        AtomicStampedReference<Integer> stampRef = new AtomicStampedReference<>(1, 0);

        System.out.println("stampRef.getReference() = " + stampRef.getReference());
        System.out.println("stampRef.getStamp() = " + stampRef.getStamp());

        boolean isSuccess = stampRef.compareAndSet(1, 2, stampRef.getStamp(), stampRef.getStamp() + 1);
        System.out.println("isSuccess = " + isSuccess);

        System.out.println("stampRef.getReference() = " + stampRef.getReference());
        System.out.println("stampRef.getStamp() = " + stampRef.getStamp());
    }
}
