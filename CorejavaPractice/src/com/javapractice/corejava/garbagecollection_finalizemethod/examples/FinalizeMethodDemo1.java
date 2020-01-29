package com.javapractice.corejava.garbagecollection_finalizemethod.examples;

public class FinalizeMethodDemo1 {
    public static void main(String[] args) {
        FinalizeMethodDemo1 obj = new FinalizeMethodDemo1();
        System.out.println(obj.hashCode());
        obj = null;
        //Calling garbage collector explicitly
        System.gc();
        System.out.println("end of garbage collection");



    }

    @Override
    protected void finalize() {
        System.out.println("finalize method called");
    }
}
