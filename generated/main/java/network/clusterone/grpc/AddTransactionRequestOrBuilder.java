// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/listener/listener.proto

package network.clusterone.grpc;

public interface AddTransactionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:listener.AddTransactionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.listener.Transaction transaction = 1;</code>
   * @return Whether the transaction field is set.
   */
  boolean hasTransaction();
  /**
   * <code>.listener.Transaction transaction = 1;</code>
   * @return The transaction.
   */
  network.clusterone.grpc.Transaction getTransaction();
  /**
   * <code>.listener.Transaction transaction = 1;</code>
   */
  network.clusterone.grpc.TransactionOrBuilder getTransactionOrBuilder();
}
