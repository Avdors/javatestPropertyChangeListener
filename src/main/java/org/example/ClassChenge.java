package org.example;

public class ClassChenge {
    private static ClassWithProperty test;
    public ClassChenge(ClassWithProperty test) {
        this.test = test;


    }

    public void ChengStatus(){
        System.out.println("ChengStatus");
        test.setTextDone(true);
        test.setRecordComplete(true);
        System.out.println("ChengStatus isRecordComplete " + test.isRecordComplete());
        System.out.println("ChengStatus isTextDone " + test.isTextDone());

    }

    public void ChengStatusFalse(){
        System.out.println("ChengStatus");
        test.setTextDone(false);
        test.setRecordComplete(false);
        System.out.println("ChengStatus isRecordComplete " + test.isRecordComplete());
        System.out.println("ChengStatus isTextDone " + test.isTextDone());

    }
}
