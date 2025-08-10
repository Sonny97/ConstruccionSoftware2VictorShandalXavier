public class RegisterUserUseCase {
    // private final UserRepository userRepository;

    public RegisterUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void execute(RegisterUserCommand cmd) {
        User user = UserFactory.create(cmd);
        userRepository.save(user);
    }
}