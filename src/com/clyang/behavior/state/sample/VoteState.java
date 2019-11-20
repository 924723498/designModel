package com.clyang.behavior.state.sample;

public interface VoteState {
    void vote(String user,String voteItem,VoteManager voteManager);
}
