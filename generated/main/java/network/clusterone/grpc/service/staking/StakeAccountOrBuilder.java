// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/staking/staking.proto

package network.clusterone.grpc.service.staking;

public interface StakeAccountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:solana_stake.StakeAccount)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.solana_stake.ActivationStatus Status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.solana_stake.ActivationStatus Status = 1;</code>
   * @return The status.
   */
  network.clusterone.grpc.service.staking.ActivationStatus getStatus();

  /**
   * <code>.solana_stake.StakeAccount.Info info = 2;</code>
   * @return Whether the info field is set.
   */
  boolean hasInfo();
  /**
   * <code>.solana_stake.StakeAccount.Info info = 2;</code>
   * @return The info.
   */
  network.clusterone.grpc.service.staking.StakeAccount.Info getInfo();
  /**
   * <code>.solana_stake.StakeAccount.Info info = 2;</code>
   */
  network.clusterone.grpc.service.staking.StakeAccount.InfoOrBuilder getInfoOrBuilder();
}
