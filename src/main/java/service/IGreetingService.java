package service;

import domain.Greeting;
import dto.User;

public interface IGreetingService {

	Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
}
