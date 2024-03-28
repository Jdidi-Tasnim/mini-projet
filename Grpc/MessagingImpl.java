import io.grpc.stub.StreamObserver;
import messaging.MessagingGrpc;
import messaging.MessageRequest;
import messaging.MessageResponse;
import messaging.UserRequest;
import messaging.MessagesForUser;

public class MessagingImpl extends MessagingGrpc.MessagingImplBase {
    @Override
    public void sendMessage(MessageRequest request, StreamObserver<MessageResponse> responseObserver) {
        // Implementation to send message
        MessageResponse response = MessageResponse.newBuilder().setStatus("Message sent").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getMessagesForUser(UserRequest request, StreamObserver<MessagesForUser> responseObserver) {
        // Implementation to get messages for user
        MessagesForUser response = MessagesForUser.newBuilder().addMessages("Hello!").addMessages("How are you?").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
