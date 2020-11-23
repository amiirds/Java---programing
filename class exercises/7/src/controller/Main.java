package controller;

import Model.Entity.Entity;
import Model.service.Service;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        try {
            Service.getInstance().user(new Entity());
        } catch (Exception e) {
            System.out.println("failed to save " + e.getMessage());
        }
        Scanner scanner = new Scanner(System.in);
        int choose;
        System.out.printf("Enter Username: ");
        String user = scanner.next();
        if (!user.equals("amirreza")) {
            System.out.println("User doesn't exist");
            System.exit(0);
        }
        else {
            System.out.printf("Enter Password: ");
            String pass = scanner.next();
            if (pass.equals(123))
                System.out.println("Login Successful");

            System.out.println("1-insert user\n2-show");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    try {
                        System.out.println("Enter id");
                        Entity entity = new Entity();
                        Entity id = entity.setId(scanner.nextInt());
                        System.out.println("Enter name");
                        Entity name = entity.setName(scanner.next());
                        System.out.println("Enter an email");
                        Entity email = entity.setEmail(scanner.next());
                        System.out.println("Enter an user");
                        Entity username = entity.setUsername(scanner.next());
                        System.out.println("Enter  password");
                        Entity password = entity.setPassword(scanner.next());
                        Service.getInstance().save(new Entity().setId(id.getId()).setName(name.getName()).setEmail(email.getEmail()).setUsername(username.getUsername()).setPassword(password.getPassword()));
                        System.out.println("saved successfully");
                    } catch (Exception e) {
                        System.out.println("Fail to save! " + e.getMessage());
                    }

                    break;
                case 2:
                    try {
                        List<Entity> entities = Service.getInstance().report();
                        for (Entity entity : entities) {
                            System.out.println("id = "+entity.getId());
                            System.out.println("name  = "+entity.getName());
                            System.out.println("email  = "+entity.getEmail());
                            System.out.println("user = "+entity.getUsername());
                            System.out.println("pass  = "+entity.getPassword());
                            System.out.println("-----------------------");
                        }
                    } catch (Exception e) {
                        System.out.println("Fail to show!" + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("wrong");

            }
        }
    }
}
