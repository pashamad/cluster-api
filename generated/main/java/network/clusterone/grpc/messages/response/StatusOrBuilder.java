// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messages/response/response.proto

package network.clusterone.grpc.messages.response;

public interface StatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:response.Status)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.response.StatusCode Code = 1;</code>
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   * <code>.response.StatusCode Code = 1;</code>
   * @return The code.
   */
  network.clusterone.grpc.messages.response.StatusCode getCode();

  /**
   * <code>string Error = 2;</code>
   * @return The error.
   */
  java.lang.String getError();
  /**
   * <code>string Error = 2;</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();
}
