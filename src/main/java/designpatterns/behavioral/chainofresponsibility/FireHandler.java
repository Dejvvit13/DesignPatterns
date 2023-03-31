package designpatterns.behavioral.chainofresponsibility;

public class FireHandler extends AbstractHandler{

    private static int code = 1;
    FireHandler(final AbstractHandler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(final AbstractRequest request) {
        if (code == request.getRequestCode()) {
            // TODO: Handle the request here.
        } else {
            // If the handler, doesn't handle these type of
            // requests, it can just call the super class's
            // forward request method.
            super.handleRequest(request);
        }
    }
}
