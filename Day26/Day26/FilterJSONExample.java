
public class FilterJsonExample {
    public static void main(String[] args) {
        String jsonData = "[{\"name\": \"Alice\", \"age\": 30}, {\"name\": \"Bob\", \"age\": 22}, {\"name\": \"Charlie\", \"age\": 27}]";
        
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            List<User> users = objectMapper.readValue(jsonData, new TypeReference<List<User>>() {});

            List<User> filteredUsers = users.stream()
                                            .filter(user -> user.age > 25)
                                            .collect(Collectors.toList());

            filteredUsers.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}