package com.ds.usc;

 public class Main {
        public static void main(String[] args) throws Exception {
            User [] users = new User[2];
            users [0] = new User();
            users [1] = new User();
            for (int i = 0 ; i < 2 ; i++){
                users[i].setuser();
                try {
                    User.CheckUser(users);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
