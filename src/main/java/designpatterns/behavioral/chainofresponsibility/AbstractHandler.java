package designpatterns.behavioral.chainofresponsibility;

public abstract class AbstractHandler {

    private AbstractHandler next;

    AbstractHandler(final AbstractHandler next) {
        this.next = next;
    }

    void setNext(final AbstractHandler next) {
        this.next = next;
    }

    public void handleRequest(AbstractRequest abstractRequest){
        if (this.next != null){
            next.handleRequest(abstractRequest);
        }

    }

}
