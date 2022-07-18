package Question12;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class CompletableFutureDemo {
  public void getUsers() throws ExecutionException, InterruptedException {
    CompletableFuture<List<User>> userList =
        CompletableFuture.supplyAsync(this::getListOfUsers)
            .thenCompose(
                users -> {
                  List<User> upperCaseList = null;
                  try {
                    upperCaseList =
                        users.get().stream()
                            .peek(
                                user -> {
                                  user.setFirstName(user.getFirstName().toUpperCase());
                                })
                            .collect(Collectors.toList());
                  } catch (InterruptedException | ExecutionException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                  }
                  return CompletableFuture.completedFuture(upperCaseList);
                });
    userList.get().stream().map(User::getFirstName).forEach(System.out::println);
  }

  private CompletableFuture<List<User>> getListOfUsers() {
    List<User> users = new ArrayList<>();
    users.add(new User("jack"));
    users.add(new User("tom"));
    users.add(new User("jerry"));
    return CompletableFuture.completedFuture(users);
  }

  public static void main(String[] args) {
    CompletableFutureDemo completableFutureDemo = new CompletableFutureDemo();
    try {
      // blocking call
      completableFutureDemo.getUsers();
    } catch (ExecutionException | InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
