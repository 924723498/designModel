package com.clyang.behavior.state.sample;

public class Client {
    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for (int i = 0;i < 10; i++) {
            vm.vote("zs","A");
        }
    }
}
