import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import messaging.MessagingGrpc;
import messaging.MessageRequest;
import messaging.MessagesForUser;
import messaging.UserRequest;

public class GRPCClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        MessagingGrpc.MessagingBlockingStub stub = MessagingGrpc.newBlockingStub(channel);

        // Example call to send message
        MessageRequest request = MessageRequest.newBuilder()
                .setSender("Alice")
                .setReceiver("Bob")
                .setText("Hello from Alice")
                .build();

        stub.sendMessage(request);

        // Example call to get messages for user
        UserRequest userRequest = UserRequest.newBuilder().setUsername("Bob").build();
        MessagesForUser messages = stub.getMessagesForUser(userRequest);

        System.out.println("Messages for Bob: " + messages.getMessagesList());
        
        channel.shutdown();
    }
}

