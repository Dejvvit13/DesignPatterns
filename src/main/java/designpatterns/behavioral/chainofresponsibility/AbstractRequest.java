package designpatterns.behavioral.chainofresponsibility;

public abstract class AbstractRequest {

    private int requestCode;

    AbstractRequest(final int requestCode) {
        this.requestCode = requestCode;
    }

    int getRequestCode() {
        return requestCode;
    }
}
